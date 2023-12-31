package com.example.School;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;


@RestController
public class StudentController {
	
	@GetMapping("/index")
	public ArrayList<String> get(@RequestBody List<String> list){
		return Student_service.save();
	}
}
