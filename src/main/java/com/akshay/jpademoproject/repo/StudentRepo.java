package com.akshay.jpademoproject.repo;

import com.akshay.jpademoproject.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepo extends CrudRepository<Student, Integer> {
}
