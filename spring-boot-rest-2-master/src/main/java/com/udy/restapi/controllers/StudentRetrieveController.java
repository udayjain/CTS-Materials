package com.udy.restapi.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.udy.restapi.beans.Student;
import com.udy.restapi.beans.StudentRegistration;

@Controller
public class StudentRetrieveController {
	
	@RequestMapping(method = RequestMethod.GET, value="/student/allstudent")

	@ResponseBody
	public List<Student> getStudent() {
		return StudentRegistration.getInstance().getStudentRecords();
	}

}
