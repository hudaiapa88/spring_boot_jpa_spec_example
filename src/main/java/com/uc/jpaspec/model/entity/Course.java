package com.uc.jpaspec.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@Data
public class Course extends BaseEntity {
    private String title;
    private String lesson;
    private String description;
    @ManyToOne
    private Category category;
    @ManyToOne
    private Teacher teacher;
}
