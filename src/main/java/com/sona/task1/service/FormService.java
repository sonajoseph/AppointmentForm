package com.sona.task1.service;

import java.util.List;

import com.sona.task1.model.Forms;

public interface FormService {
	
	public Forms save(Forms form);
	public List<Forms> findByfirstname(String firstname);

}
