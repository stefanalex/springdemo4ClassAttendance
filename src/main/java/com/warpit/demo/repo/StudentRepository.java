package com.warpit.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.warpit.demo.domain.Student;

public interface StudentRepository extends JpaRepository<Student,Integer> {

}
