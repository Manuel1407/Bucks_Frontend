package com.ikechukwu.paysensei.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "students")
public class StudentEntity extends AbstractEntity{

    @Column(nullable = false, columnDefinition = "VARCHAR(100)")
    private String name;

    @Column(columnDefinition = "VARCHAR(250)")
    private String displayPicture;

    @Column(columnDefinition = "VARCHAR(100)")
    private String phoneNumber;

    @Column(columnDefinition = "VARCHAR(100)")
    private String title;


}