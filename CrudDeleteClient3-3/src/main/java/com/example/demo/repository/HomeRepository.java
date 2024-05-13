package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.CrudDeleteClient33Application;
import com.example.demo.model.Student;

@Repository

public interface HomeRepository extends CrudRepository<Student, Integer>{
	

}
