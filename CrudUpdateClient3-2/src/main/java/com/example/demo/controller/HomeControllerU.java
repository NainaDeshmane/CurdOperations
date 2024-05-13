package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.serviceImp.HomeServiceImp;

@RestController
public class HomeControllerU {
	
	@Autowired
	HomeServiceImp hs;
	
	@PutMapping("/update/{rollno}")
	public String updateByrollno(@PathVariable int rollno, @RequestBody Student s)
	{
		hs.saveStudent(s);
		return "data updated";
	}
	

	

}
