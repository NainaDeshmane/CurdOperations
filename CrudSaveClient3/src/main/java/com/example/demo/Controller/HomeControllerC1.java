package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Student;
import com.example.demo.service.HomeService;

@RestController

public class HomeControllerC1 {
	@Autowired
	HomeService hs;
	
	@PostMapping("/save")
	public String save(@RequestBody Student s) {
		hs.saveData(s);
		return " data saved";
	}

}
