package com.example.School;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Student_service {
	@Autowired
	public static ArrayList<String> save(){
		ArrayList<String>student=new ArrayList<String>();
		student.add("sabari");
		student.add("praveen");
		student.add("nandhu");
		return student;
	}
}
