package com.uc.jpaspec.controller;

import com.uc.jpaspec.model.dto.CourseDto;
import com.uc.jpaspec.service.CourseManager;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("course")
public class CourseController {

    private final CourseManager courseManager;

    @GetMapping("/getFilter")
    public List<CourseDto> getFilter(@RequestParam String filter){
        return courseManager.getFilter(filter);
    }

}
