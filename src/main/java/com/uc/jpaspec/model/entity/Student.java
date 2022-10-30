package com.uc.jpaspec.model.entity;

import com.uc.jpaspec.model.enums.Role;
import lombok.Data;
import lombok.experimental.SuperBuilder;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@Data
@SuperBuilder
@DiscriminatorValue(value = Role.Value.STUDENT)
public class Student extends User{

}
