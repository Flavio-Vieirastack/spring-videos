package com.project1.project_study.Models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Roles extends ModelsId {
    @Column(columnDefinition = "varchar (50) not null")
    private String role;
}
