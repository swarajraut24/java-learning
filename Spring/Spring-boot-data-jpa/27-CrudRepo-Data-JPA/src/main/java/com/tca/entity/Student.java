package com.tca.entity;

import com.tca.Enums.Gender;
import jakarta.persistence.*;
import lombok.*;

import java.lang.classfile.constantpool.DoubleEntry;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Student {

    @Id
    private Integer studentId;

    @Column(name="NAME")
    private String name;

    @Column(name="PER")
    private Double per;

    @Enumerated(EnumType.STRING)
    @Column(name="GENDER")
    private Gender gender;

    @Column(name = "DATE")
    private LocalDate date;

}
