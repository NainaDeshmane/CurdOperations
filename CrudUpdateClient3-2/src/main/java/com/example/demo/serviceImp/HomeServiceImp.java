package com.example.demo.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.HomeRepository;
import com.example.demo.service.HomeService;

@Service
public class HomeServiceImp implements HomeService {
	@Autowired
	HomeRepository hr;

	@Override
	public Student editData(int rollno) {
		
		return hr.findByRollno(rollno);
	}

	@Override
	public void saveStudent(Student s) {
		hr.save(s);
		
	}

}
