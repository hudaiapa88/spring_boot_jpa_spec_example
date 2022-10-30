package com.uc.jpaspec.repository;

import com.uc.jpaspec.model.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TeacherRepository extends JpaRepository<Teacher,Long> , JpaSpecificationExecutor<Teacher> {
}
