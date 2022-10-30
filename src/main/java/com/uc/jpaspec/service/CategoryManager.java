package com.uc.jpaspec.service;

import com.uc.jpaspec.mapper.CategoryDtoMapper;
import com.uc.jpaspec.model.dto.CategoryDto;
import com.uc.jpaspec.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Transactional
@Service
@RequiredArgsConstructor
public class CategoryManager {

    private final CategoryDtoMapper categoryDtoMapper;
    private final CategoryRepository categoryRepository;

    public CategoryDto getAll(){
       // return categoryDtoMapper.convert(categoryRepository.query(query-> query.select(category)));
   return null;

    }
}
