package com.uc.jpaspec.mapper;

import com.uc.jpaspec.model.dto.CourseDto;
import com.uc.jpaspec.model.entity.Course;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CourseDtoMapper extends BaseMapper<Course, CourseDto>{
}
