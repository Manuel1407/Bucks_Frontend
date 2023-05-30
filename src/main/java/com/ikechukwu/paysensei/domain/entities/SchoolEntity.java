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
@Table(name = "school")
public class SchoolEntity extends AbstractEntity{

    @Column(name = "school_name", nullable = false, columnDefinition = "VARCHAR(100)")
    private String schoolName;

    @Column(name = "school_type", nullable = false, columnDefinition = "VARCHAR(100)")
    private String schoolType;

    @Column(name = "school_address", nullable = false, columnDefinition = "VARCHAR(100)")
    private String schoolAddress;

    @Column(name = "school_city", nullable = false, columnDefinition = "VARCHAR(100)")
    private String schoolCity;

    @Column(name = "school_state", nullable = false, columnDefinition = "VARCHAR(100)")
    private String schoolState;
}
