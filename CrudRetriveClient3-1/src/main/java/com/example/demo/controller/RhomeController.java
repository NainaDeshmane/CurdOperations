package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.serviceImp.ServiceImp;

@RestController
public class RhomeController {
	@Autowired
	ServiceImp hs;
	
	@GetMapping("/getAllData")
	public Iterable<Student> getAllData()
	{
		Iterable<Student> ls=hs.getAllData();
		return ls;
	}

}
