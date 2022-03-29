package com.warpit.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.warpit.demo.domain.Classroom;
import com.warpit.demo.domain.Course;
import com.warpit.demo.domain.Student;
import com.warpit.demo.repo.ClassroomRepository;
import com.warpit.demo.repo.CourseRepository;
import com.warpit.demo.repo.StudentRepository;


@Service
public class ClassroomService {

	@Autowired
	private ClassroomRepository classroomRepository;
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private CourseRepository courseRepository;
	
	
	public Classroom createClassrom(String code,String name) {
		
		
		return null;
		
	}
	
	
	public Student checkInCourse(String courseName,Student student) {
	//	Course course = courseRepository.findB
		
	//	return courseRepository.findByName(courseName).orElse(courseRepository.save(new Course(courseName)));
		return null;
	}
	
}
