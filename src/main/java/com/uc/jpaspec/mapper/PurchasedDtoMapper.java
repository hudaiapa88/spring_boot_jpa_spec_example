package com.uc.jpaspec.mapper;

import com.uc.jpaspec.model.dto.PurchasedDto;
import com.uc.jpaspec.model.entity.Purchased;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PurchasedDtoMapper extends BaseMapper<Purchased, PurchasedDto>{
}
