package com.student;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.student.entities.Students;
import com.student.repository.StudentRepository;

@SpringBootTest
class StudentappApplicationTests {
	@Autowired
	private StudentRepository studentRepo;

	@Test
	void saveOneStudentRecord() {
		Students s = new Students();
		s.setName("umesh");
		s.setCourse("phd");
		s.setFee(10000);
		studentRepo.save(s);
	}
	@Test
	void deleteOneStudentRecord() {
		studentRepo.deleteById(2l);
	}
	@Test
	void findOneStudentRecord() {
		Optional<Students> findById = studentRepo.findById(2l);
		Students students = findById.get();
		System.out.println(students.getId());
		System.out.println(students.getName());
		System.out.println(students.getCourse());
		System.out.println(students.getFee());

	}
	
	@Test 
	void updateOneStudentRecord() {
		Optional<Students> findById = studentRepo.findById(2l);
		Students students = findById.get();
		students.setCourse("lecturing");
		studentRepo.save(students);
	}

}
