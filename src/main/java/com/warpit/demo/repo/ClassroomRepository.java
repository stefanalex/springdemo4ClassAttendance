package com.warpit.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.warpit.demo.domain.Classroom;

public interface ClassroomRepository extends JpaRepository<Classroom,Integer>{

}
