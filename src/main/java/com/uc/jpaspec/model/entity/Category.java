package com.uc.jpaspec.model.entity;

import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;

@Entity
public class Category extends  BaseEntity{
    String title;

}
