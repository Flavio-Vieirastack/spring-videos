package com.project1.project_study.Models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.HashSet;
import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Data()
@Entity
@Table(name = "\"user\"", uniqueConstraints = {
        @UniqueConstraint(name = "user_email", columnNames = "email")
}, indexes = {
        @Index(name = "idx_email", columnList = "email")
})
public class UserModel extends ModelsId {
    @Column(columnDefinition = "varchar (100) not null")
    private String name;
    @Column(columnDefinition = "varchar (100) not null")
    private String email;
    @OneToMany(orphanRemoval = true)
    @JoinColumn(name = "user_id", foreignKey = @ForeignKey(
            name = "fk_roles"
    ))
    private Set<Roles> roles = new HashSet<>();
    @OneToMany(orphanRemoval = true)
    @JoinColumn(name = "user_product_id", foreignKey = @ForeignKey(
            name = "fk_products"
    ))
    private Set<Products> products = new HashSet<>();
}
