package com.project1.project_study.Models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Products extends ModelsId {
    @Column(columnDefinition = "varchar (100) not null")
    private String name;
    @Column(precision = 19, scale = 2)
    private BigDecimal price;
    @Column(columnDefinition = "varchar (100) not null")
    private String description;
    @OneToOne
    @JoinColumn(name = "category_id", referencedColumnName = "id", foreignKey =
    @ForeignKey(
            name = "fk_category"
    ))
    private Category category;
}
