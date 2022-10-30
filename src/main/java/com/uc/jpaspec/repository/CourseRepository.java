package com.uc.jpaspec.repository;

import com.uc.jpaspec.model.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,Long> {
}
