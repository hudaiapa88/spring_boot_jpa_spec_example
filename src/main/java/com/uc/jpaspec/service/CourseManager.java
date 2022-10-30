package com.uc.jpaspec.service;


import com.uc.jpaspec.mapper.CourseDtoMapper;
import com.uc.jpaspec.model.dto.CourseDto;
import com.uc.jpaspec.model.entity.Course;
import com.uc.jpaspec.repository.CourseRepository;
import com.uc.jpaspec.repository.common.coverter.QueryConverter;
import com.uc.jpaspec.repository.common.spec.SpecificationUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
@RequiredArgsConstructor
public class CourseManager {
    private final CourseRepository courseRepository;
    private final CourseDtoMapper courseDtoMapper;

    public List<CourseDto> getFilter(String filter){
     return courseDtoMapper.convertList(courseRepository.findAll(SpecificationUtil.bySearchQuery(QueryConverter.convert(filter), Course.class)));
    }
}
