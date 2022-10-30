package com.uc.jpaspec.repository;

import com.uc.jpaspec.model.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CourseRepository extends JpaRepository<Course,Long> , JpaSpecificationExecutor<Course> {
}
