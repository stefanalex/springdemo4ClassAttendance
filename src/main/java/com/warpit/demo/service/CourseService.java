package com.warpit.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.warpit.demo.domain.Course;
import com.warpit.demo.repo.CourseRepository;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;
	
	
	public Course createCourse(String courseName) {
		return courseRepository.findByName(courseName).orElse(courseRepository.save(new Course(courseName)));
	}
	
		
	/*
	public Course findCourseForStudent(Student student) {
		
		
		return courseRepository.findByName(courseName).orElse(courseRepository.save(new Course(courseName)));
	}
	*/
}
