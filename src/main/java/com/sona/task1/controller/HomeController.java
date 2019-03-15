package com.sona.task1.controller;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.ws.rs.Produces;

import org.attoparser.dom.Text;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sona.task1.model.Forms;
import com.sona.task1.repo.FormRepository;
/***
 * 
 * @author uvionics
 *
 */
@Controller
public class HomeController {
	
	
	@Autowired
	FormRepository formRepo;
	
	private static final Logger logger = LoggerFactory.getLogger(FormController.class);
	
	/***
	 * 
	 * @return
	 */
	@RequestMapping("/")
	public String welcome() {

		return "Form";
	}
	
	/***
	 * 
	 * @param id
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value = "/pdfreport/{id}", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_PDF_VALUE)
    public ResponseEntity<InputStreamResource> formReport(@PathVariable String id) throws IOException {

        Forms forms = formRepo.findOneById(Integer.parseInt(id));
        List<Forms> formsList=new ArrayList<Forms>();
        formsList.add(forms);
         //generates pdffile 
        ByteArrayInputStream bis = GeneratePdfReport.formReport(formsList);
 //pdf file shown directly in browser by setting inline.
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Disposition", "inline; filename=formreport.pdf");

        return ResponseEntity
                .ok()
                .headers(headers)
                .contentType(MediaType.APPLICATION_PDF)
                .body(new InputStreamResource(bis));
    }
	 
}
