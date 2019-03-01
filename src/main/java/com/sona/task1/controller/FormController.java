package com.sona.task1.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.sona.task1.model.Forms;
import com.sona.task1.repo.FormRepository;
import com.sona.task1.service.FormService;



@RestController
@RequestMapping("/forms")
public class FormController {
	private static final Logger logger = LoggerFactory.getLogger(FormController.class);
	@Autowired
	FormService formService;
	
	@Autowired
	FormRepository  formRepo;
	@PostMapping
 public String saveForm(@RequestBody Forms form) {
		logger.info(form.toString());
	Forms formResp=	formService.save(form);
	if(formResp==null) {
		return "no content";
		
	}else {
		return "successfully entered";
	}
	 
	
	 
 }
	
	@GetMapping
	 public List<Forms> getAllAppointments() { 
		return formRepo.findAll();  
	 }
	
	
	@GetMapping("/{firstname}")
	
	public List<Forms> findByFirstname(@PathVariable String firstname) {
		return formService.findByfirstname(firstname);
	}
}
