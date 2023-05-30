package com.ikechukwu.paysensei.domain.entities;

import com.ikechukwu.paysensei.domain.entities.enums.Position;
import com.ikechukwu.paysensei.domain.entities.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "teachers")
public class TeacherEntity extends AbstractEntity{

    @Column(nullable = false, columnDefinition = "VARCHAR(100)")
    private String name;

    @Column(unique = true, columnDefinition = "VARCHAR(100)")
    private String phoneNumber;

    private Integer yearOfTeaching;

    @Column(nullable = false, columnDefinition = "VARCHAR(100)")
    private String subjectsTaught;

    @Enumerated(value = EnumType.STRING)
    private Position position;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "teacher_status")
    private Status status;

    @Column(columnDefinition = "VARCHAR(250)")
    private String about;

    @Column(columnDefinition = "VARCHAR(100)")
    private String nin;

    @Column(columnDefinition = "VARCHAR(100)")
    private String displayPicture;


}
