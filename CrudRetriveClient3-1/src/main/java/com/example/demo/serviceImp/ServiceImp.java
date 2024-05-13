package com.example.demo.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.service.HomeRepository;
import com.example.demo.service.HomeService;
@Service
public class ServiceImp implements HomeService {
	@Autowired
	HomeRepository hr;

	@Override
	public Iterable<Student> getAllData() {
		
		return hr.findAll();
	}

}
