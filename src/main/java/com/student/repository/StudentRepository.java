package com.student.repository;

import org.springframework.data.repository.CrudRepository;

import com.student.entities.Students;

public interface StudentRepository extends CrudRepository<Students, Long> {

}
