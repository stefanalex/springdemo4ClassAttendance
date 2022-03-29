package com.warpit.demo.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.warpit.demo.domain.Course;
import com.warpit.demo.domain.Student;

public interface CourseRepository extends JpaRepository<Course,Integer>{

	Optional<Course> findByName(String courseName);
	
	Optional<Course> findByStudentAttendeeFirstName(String firstName);
	

	

}
