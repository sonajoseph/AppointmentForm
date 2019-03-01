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

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import com.sona.task1.ServiceImpl.FormServiceImpl;
import com.sona.task1.controller.FormController;
import com.sona.task1.model.Forms;
import com.sona.task1.repo.FormRepository;

@RunWith(SpringRunner.class)
@SpringBootTest


public class FormCreationApplicationTests {
	/*
	@InjectMocks
	FormController formController;
	@InjectMocks
	FormServiceImpl formService;
	@Mock
	FormRepository formrepo;
	
	Forms form;
	
	
	private Forms getForms(){
		
		form=new Forms();
		
		form.setId(1);
		form.setFirstname("sona");
		form.setLastname("joseph");
		form.setTitle("Ms");
		form.setComments("hai");
		form.setDateTime("12-12-2018 02:12:32");

		System.out.println("items are"+">..................................."+form);
		return form;
		}

	@Test
	public void testGetEvents(){
		Forms s= new Forms();
		when(formrepo.findByfirstname(anyString())).thenReturn(Arrays.asList(getForms()));//here we are mocked the database conection
		assertEquals(1, formService.findByfirstname("").size());//one object is created and it is returned.
		
		
	}
	
	@Test
	public void testAssert(){
		when(formrepo.findByfirstname(anyString())).thenReturn(Arrays.asList(getForms()));
		assertNotNull(getForms());
		assertEquals("birthday", form.getFirstname());
		assertEquals(1, form.getId());
		
	
		
	}*/

}