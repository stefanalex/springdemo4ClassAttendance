package com.warpit.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.warpit.demo.domain.Course;

public interface CourseRepository extends JpaRepository<Course,Integer>{

}
