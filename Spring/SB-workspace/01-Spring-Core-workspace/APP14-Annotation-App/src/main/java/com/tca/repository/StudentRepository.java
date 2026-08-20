package com.tca.repository;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.tca.model.Student;

@Repository
public class StudentRepository {

	@Autowired
	@Qualifier("Studentstore1")
	Map<String,Student> hm;
	 
	public Student findByid(String key) {
		Student s= hm.get(key);
		return s;
	}
	
	
	public Map<String,Student> findAll() {
		return hm;
	}
}
