package com.warpit.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.warpit.demo.domain.Classroom;
import com.warpit.demo.repo.ClassroomRepository;


@Service
public class ClassroomService {

	@Autowired
	private ClassroomRepository classroomRepository;
	
	
	public Classroom createClassrom(String code,String name) {
		
		
		return null;
		
	}
	
}
