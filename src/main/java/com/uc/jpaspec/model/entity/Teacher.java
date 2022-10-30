package com.uc.jpaspec.model.entity;

import com.uc.jpaspec.model.enums.Role;
import lombok.Data;
import lombok.experimental.SuperBuilder;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@Data
@DiscriminatorValue(value = Role.Value.TEACHER)
public class Teacher extends User {

}
