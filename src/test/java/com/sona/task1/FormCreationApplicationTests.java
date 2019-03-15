package com.sona.task1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import com.sona.task1.ServiceImpl.FormServiceImpl;
import com.sona.task1.controller.FormController;
import com.sona.task1.model.Forms;
import com.sona.task1.repo.FormRepository;

@RunWith(SpringRunner.class)
@SpringBootTest


public class FormCreationApplicationTests {
	@Autowired
	
	FormServiceImpl formService;
	@Mock
	FormRepository formrepo;
	
	Forms form;
	
	
	private Forms getForms(){
		
		form=new Forms();
		
		form.setId(1);
		form.setFullname("sona");
		form.setCompanyname("uvt");
		form.setTitle("Ms");
		form.setJobtitle("java developer");
		form.setDateTime("12-12-2018 02:12:32");
		form.setAddress("melvettom");
	

		System.out.println("items are"+">..................................."+form);
		return form;
		}

	@Test
	public void testByNames(){
		Forms s= new Forms();
		when(formrepo.findByfullname(anyString())).thenReturn(Arrays.asList(getForms()));
		assertEquals(1, formService.findByfullname("hareesh").size());
		
		
	}
	
	/*@Test
	public void save() {
		Forms f = new Forms(1000,"form","dsg","dsjhgsjd","adhfgsdjh","sdhghgsdjf","sdhgjfhgdjs");
		Forms d = formrepo.save(f);
		System.out.println(d);
		assertEquals("form", "");
	}
	
	*/

	
	

}
