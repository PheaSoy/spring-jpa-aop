package org.soyphea.springaop.controller;

import java.util.List;

import org.soyphea.springaop.doomain.Student;
import org.soyphea.springaop.pojo.BaseResult;
import org.soyphea.springaop.repository.StudentDeleteRepository;
import org.soyphea.springaop.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	StudentRepository studentRepository;
	
	@Autowired
	StudentDeleteRepository studentDelete;
	
	@GetMapping("/")
	List<Student> listStudent(){
		return studentRepository.findAllStudentCustomQuery();
	}
	
	@RequestMapping(value="/add",method = RequestMethod.POST)
	ResponseEntity<?> addStudent(@RequestBody Student stuent){
		
		if(studentRepository.existsById(stuent.getId())) {
			return ResponseEntity.badRequest().body(new BaseResult(false, "Stuent already exist."));
		}
		
		studentRepository.save(stuent);
		return ResponseEntity.ok(new BaseResult(true, "Success."));
	}
	
	
	@RequestMapping(value="/delete/{id}",method = RequestMethod.DELETE)
	ResponseEntity<?> deleteStudent(@PathVariable("id") Long id){
		
		if(studentRepository.existsById(id)) {
			studentDelete.deleteById(id);
			return ResponseEntity.ok(new BaseResult(true, "Student Id:"+id+" has deleted successfully."));
		} else {
			return ResponseEntity.ok(new BaseResult(false, "Can not find student."));
		}
		
	}
	
	
}
