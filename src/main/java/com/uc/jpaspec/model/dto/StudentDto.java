package com.uc.jpaspec.model.dto;

import com.uc.jpaspec.model.enums.Role;
import lombok.Data;

@Data
public class StudentDto {
    private Long id;
    private String firstname;
    private String lastname;
    private String email;
    private String phone;
    private Role role;
}
