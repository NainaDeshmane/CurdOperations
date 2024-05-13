package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.HomeService;
import com.example.demo.serviceimp.HomeServiceImp;

@RestController
public class HomeController {
	@Autowired
	HomeServiceImp hs;
	
	@DeleteMapping("/deleteByrollno/{rollno}")
	public void deleteByRollno(@PathVariable int rollno)
	{
		hs.deleteByRollno(rollno);
	}
	
	@DeleteMapping("/deleteAll")
	public void deleteAll()
	{
		hs.delete();
		
	}

}
