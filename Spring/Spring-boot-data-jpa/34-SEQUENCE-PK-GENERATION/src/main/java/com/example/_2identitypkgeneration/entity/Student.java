package com.example._2identitypkgeneration.entity;

import com.example._2identitypkgeneration.Enums.Gender;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@NoArgsConstructor
@Data
@Entity
@ToString
public class Student {

    @Id
    @SequenceGenerator(name="rno_gen",
                       sequenceName = "student_seq",
                        allocationSize =50
                       )
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
                     generator = "rno_gen")
    @Column(name="RNO")
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
