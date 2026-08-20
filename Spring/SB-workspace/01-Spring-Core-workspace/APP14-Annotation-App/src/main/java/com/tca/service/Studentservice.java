package com.tca.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.tca.model.Student;
import com.tca.repository.StudentRepository;

@Service
public class Studentservice {
  
	@Autowired
	StudentRepository repo;
	
	public Student getByid(String id) {
		return repo.findByid(id);
	}
	
	public Map<String,Student> getByfull() {
		return repo.findAll();
	}
}
