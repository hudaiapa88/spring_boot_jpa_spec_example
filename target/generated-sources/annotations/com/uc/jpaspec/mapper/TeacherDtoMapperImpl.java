package com.uc.jpaspec.mapper;

import com.uc.jpaspec.model.dto.TeacherDto;
import com.uc.jpaspec.model.entity.Teacher;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-10-31T00:04:54+0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.3 (Amazon.com Inc.)"
)
@Component
public class TeacherDtoMapperImpl implements TeacherDtoMapper {

    @Override
    public TeacherDto convert(Teacher entity) {
        if ( entity == null ) {
            return null;
        }

        TeacherDto teacherDto = new TeacherDto();

        teacherDto.setId( entity.getId() );
        teacherDto.setFirstname( entity.getFirstname() );
        teacherDto.setLastname( entity.getLastname() );
        teacherDto.setEmail( entity.getEmail() );
        teacherDto.setPhone( entity.getPhone() );
        teacherDto.setRole( entity.getRole() );

        return teacherDto;
    }

    @Override
    public List<TeacherDto> convertList(List<Teacher> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<TeacherDto> list = new ArrayList<TeacherDto>( entityList.size() );
        for ( Teacher teacher : entityList ) {
            list.add( convert( teacher ) );
        }

        return list;
    }
}
