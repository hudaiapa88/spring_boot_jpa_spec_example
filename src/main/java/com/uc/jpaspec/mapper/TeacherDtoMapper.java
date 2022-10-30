package com.uc.jpaspec.mapper;

import com.uc.jpaspec.model.dto.TeacherDto;
import com.uc.jpaspec.model.entity.Teacher;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TeacherDtoMapper extends BaseMapper<Teacher, TeacherDto>{
}
