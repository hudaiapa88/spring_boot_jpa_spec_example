package com.uc.jpaspec.repository;

import com.uc.jpaspec.model.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface StudentRepository extends JpaRepository<Student,Long> , JpaSpecificationExecutor<Student> {
}
