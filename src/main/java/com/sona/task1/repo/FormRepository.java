package com.sona.task1.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.sona.task1.model.Forms;
@Repository
public interface FormRepository extends JpaRepository<Forms, Integer>{
	public Forms save(Forms form);
	public List<Forms> findAll();
	public Optional<Forms> findById(Integer id);
	public Forms findOneById(Integer id);
	public List<Forms> findByfirstname(String firstname);
	
//	public Forms findById(Integer id);

//	public List<Forms> findByDateOfAppointment(String dateOfAppointment);
}
