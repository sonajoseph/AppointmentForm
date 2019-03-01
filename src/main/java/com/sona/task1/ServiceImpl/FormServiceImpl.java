package com.sona.task1.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sona.task1.model.Forms;
import com.sona.task1.repo.FormRepository;
import com.sona.task1.service.FormService;

@Service
public class FormServiceImpl implements FormService{
	
	@Autowired
	FormRepository formRepo;
	

	@Override
	public Forms save(Forms form) {
		
		return formRepo.save(form);
	}


	@Override
	public List<Forms> findByfirstname(String firstname) {
		
		return formRepo.findByfirstname(firstname);
	}
	

}
