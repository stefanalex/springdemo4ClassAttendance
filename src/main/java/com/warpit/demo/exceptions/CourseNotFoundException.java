package com.warpit.demo.exceptions;

public class CourseNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public CourseNotFoundException(String ex) {
		super(ex);
	}


}
