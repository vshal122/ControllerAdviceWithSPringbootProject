package com.rakuten.StudentApp.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.rakuten.StudentApp.Model.Student;
import com.rakuten.StudentApp.Service.StudentServiceImpl;

@RestController
public class StudentControllerImpl implements IStudentController {

	@Autowired
	public StudentServiceImpl serviceImpl;

	@Override
	public Student createStudent(Student student) {

		return serviceImpl.save(student);
	}

	@Override
	public ResponseEntity<Student> getbyId(Long id) {

		     Student student = serviceImpl.findbyId(id);
		     return ResponseEntity.status(HttpStatus.OK).body(student);
	}

	@Override
	public Student studentUpdate(Long id, Student student) {

		return serviceImpl.update(id, student);
	}

	@Override
	public Boolean deleteStudent(Long id) {
		return serviceImpl.deleteWithId(id);

	}

	@Override
	public ResponseEntity<List<Student>> findAll() {
		
		 List<Student>  student= serviceImpl.allStudentview();
		return  ResponseEntity.status(HttpStatus.OK).body(student);
	}

}
