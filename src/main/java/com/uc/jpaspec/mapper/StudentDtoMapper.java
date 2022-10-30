package com.uc.jpaspec.mapper;

import com.uc.jpaspec.model.dto.StudentDto;
import com.uc.jpaspec.model.entity.Student;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StudentDtoMapper extends BaseMapper<Student, StudentDto>{
}
