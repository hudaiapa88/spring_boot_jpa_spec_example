package com.uc.jpaspec.mapper;

import com.uc.jpaspec.model.dto.StudentDto;
import com.uc.jpaspec.model.entity.Student;
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
public class StudentDtoMapperImpl implements StudentDtoMapper {

    @Override
    public StudentDto convert(Student entity) {
        if ( entity == null ) {
            return null;
        }

        StudentDto studentDto = new StudentDto();

        studentDto.setId( entity.getId() );
        studentDto.setFirstname( entity.getFirstname() );
        studentDto.setLastname( entity.getLastname() );
        studentDto.setEmail( entity.getEmail() );
        studentDto.setPhone( entity.getPhone() );
        studentDto.setRole( entity.getRole() );

        return studentDto;
    }

    @Override
    public List<StudentDto> convertList(List<Student> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<StudentDto> list = new ArrayList<StudentDto>( entityList.size() );
        for ( Student student : entityList ) {
            list.add( convert( student ) );
        }

        return list;
    }
}
