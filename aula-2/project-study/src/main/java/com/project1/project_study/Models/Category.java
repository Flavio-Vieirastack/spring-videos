package com.project1.project_study.Models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Category extends ModelsId {
    @Column(columnDefinition = "varchar (100) not null")
    private String categoryName;
}
