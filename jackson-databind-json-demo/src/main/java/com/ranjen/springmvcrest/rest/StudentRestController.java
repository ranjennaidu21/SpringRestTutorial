package com.ranjen.springmvcrest.rest;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ranjen.springmvcrest.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {
	
	private List<Student> theStudents;
	
	// define @PostConstruct to load the student data ... only once!
	@PostConstruct
	public void loadData() {
	
		theStudents = new ArrayList<>();
		
		theStudents.add(new Student("Poornima", "Patel"));
		theStudents.add(new Student("Mario", "Rossi"));
		theStudents.add(new Student("Mary", "Smith"));		
	}

	// define endpoint for "/students" - return list of students
	
	@GetMapping("/students")
	public List<Student> getStudents() {
		//now theStudents already loaded with the @PostConstruct data 	
		return theStudents;
	}
	
	// define endpoint for "/students/{studentId}" - return student at index
	//will display the student information based on the id entered in the url
	@GetMapping("/students/{studentId}")
	//by default @PathVariable variable name should be matched with above {studentId}
	//for this there is problem if user entered wrong index number , so need to catch
	//the exception for that.
	public Student getStudent(@PathVariable int studentId) {
		
		// just index into the list ... keep it simple for now
				
		//get the element of the list based on index using get method in List
		return theStudents.get(studentId);
		
	}
	
}









