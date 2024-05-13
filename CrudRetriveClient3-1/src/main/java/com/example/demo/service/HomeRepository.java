package com.example.demo.service;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Student;

public interface HomeRepository extends CrudRepository<Student, Integer>{

}
