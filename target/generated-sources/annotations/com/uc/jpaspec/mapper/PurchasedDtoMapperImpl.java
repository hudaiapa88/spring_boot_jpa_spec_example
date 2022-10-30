package com.uc.jpaspec.mapper;

import com.uc.jpaspec.model.dto.CourseDto;
import com.uc.jpaspec.model.dto.PurchasedDto;
import com.uc.jpaspec.model.entity.Course;
import com.uc.jpaspec.model.entity.Purchased;
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
public class PurchasedDtoMapperImpl implements PurchasedDtoMapper {

    @Override
    public PurchasedDto convert(Purchased entity) {
        if ( entity == null ) {
            return null;
        }

        PurchasedDto purchasedDto = new PurchasedDto();

        purchasedDto.setCourse( courseToCourseDto( entity.getCourse() ) );

        return purchasedDto;
    }

    @Override
    public List<PurchasedDto> convertList(List<Purchased> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PurchasedDto> list = new ArrayList<PurchasedDto>( entityList.size() );
        for ( Purchased purchased : entityList ) {
            list.add( convert( purchased ) );
        }

        return list;
    }

    protected CourseDto courseToCourseDto(Course course) {
        if ( course == null ) {
            return null;
        }

        CourseDto courseDto = new CourseDto();

        courseDto.setTitle( course.getTitle() );
        courseDto.setLesson( course.getLesson() );
        courseDto.setDescription( course.getDescription() );
        courseDto.setCategory( course.getCategory() );
        courseDto.setTeacher( course.getTeacher() );

        return courseDto;
    }
}
