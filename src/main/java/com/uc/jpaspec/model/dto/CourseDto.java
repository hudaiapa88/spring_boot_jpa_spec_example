package com.uc.jpaspec.model.dto;

import com.uc.jpaspec.model.entity.Category;
import com.uc.jpaspec.model.entity.Teacher;
import lombok.Data;
@Data
public class CourseDto {
    private String title;
    private String lesson;
    private String description;
    private Category category;
    private Teacher teacher;

}
