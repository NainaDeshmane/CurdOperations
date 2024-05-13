package com.example.demo.serviceimp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.model.Student;
import com.example.demo.repository.HomeRepository;
import com.example.demo.service.HomeService;


@Service
public class HomeServiceImp implements HomeService{
	
	@Autowired
	HomeRepository hr;
	
	@Override
	public void deleteByRollno(int rollno) {
		hr.deleteById(rollno);
		
	}

	@Override
	public void delete() {
		hr.deleteAll();
	}

	

	

}
