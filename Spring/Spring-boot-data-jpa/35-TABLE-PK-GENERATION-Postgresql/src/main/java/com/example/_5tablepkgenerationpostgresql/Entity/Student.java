package com.example._5tablepkgenerationpostgresql.Entity;


import com.example._5tablepkgenerationpostgresql.Gender.Gender;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Student {

    @Id
    @TableGenerator(
            name="rno_gen",
            table="id_generator",
            pkColumnName = "gen_name",
            valueColumnName = "gen_value",
            pkColumnValue = "student_id",
            allocationSize = 100
    )


    @GeneratedValue(strategy = GenerationType.TABLE,generator = "rno_gen")
    @Column(name="RNO")
    private Integer rno;

    @Column(name="NAME")
    private String name;

    @Column(name="PER")
    private Double per;

    @Enumerated(EnumType.STRING)
    @Column(name="GENDER")
    Gender gender;

    @Column(name="DATE")
    private LocalDate BirthDate;


}
