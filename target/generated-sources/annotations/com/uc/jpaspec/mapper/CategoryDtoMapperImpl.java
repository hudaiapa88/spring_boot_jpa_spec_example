package com.uc.jpaspec.mapper;

import com.uc.jpaspec.model.dto.CategoryDto;
import com.uc.jpaspec.model.entity.Category;
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
public class CategoryDtoMapperImpl implements CategoryDtoMapper {

    @Override
    public CategoryDto convert(Category entity) {
        if ( entity == null ) {
            return null;
        }

        CategoryDto categoryDto = new CategoryDto();

        return categoryDto;
    }

    @Override
    public List<CategoryDto> convertList(List<Category> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<CategoryDto> list = new ArrayList<CategoryDto>( entityList.size() );
        for ( Category category : entityList ) {
            list.add( convert( category ) );
        }

        return list;
    }
}
