package com.ikechukwu.paysensei.domain.entities;

import com.ikechukwu.paysensei.domain.entities.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "app_user")
public class AppUserEntity extends AbstractEntity{

    @Column(unique = true, nullable = false, columnDefinition = "VARCHAR(100)")
    private String email;

    @Column(name = "message", nullable = false)
    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;

    @Column(columnDefinition = "boolean default user")
    private boolean isVerified;

    @OneToMany(mappedBy = "appUserEntity")
    private List<TeacherEntity> teacherEntities;

    @OneToMany(mappedBy = "appUserEntity")
    private List<StudentEntity> studentEntities;
}
