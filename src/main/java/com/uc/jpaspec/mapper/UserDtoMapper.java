package com.uc.jpaspec.mapper;

import com.uc.jpaspec.model.dto.UserDto;
import com.uc.jpaspec.model.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserDtoMapper extends BaseMapper<User, UserDto>{
}
