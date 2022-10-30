package com.uc.jpaspec.repository;

import com.uc.jpaspec.model.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
