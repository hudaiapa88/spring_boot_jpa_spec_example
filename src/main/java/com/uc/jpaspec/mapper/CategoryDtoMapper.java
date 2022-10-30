package com.uc.jpaspec.mapper;

import com.uc.jpaspec.model.dto.CategoryDto;
import com.uc.jpaspec.model.entity.Category;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoryDtoMapper extends BaseMapper<Category, CategoryDto>{
}
