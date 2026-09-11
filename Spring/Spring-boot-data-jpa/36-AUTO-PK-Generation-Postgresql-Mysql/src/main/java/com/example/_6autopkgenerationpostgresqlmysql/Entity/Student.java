package com.example._6autopkgenerationpostgresqlmysql.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="RNO")
    private Integer rno;

    @Column(name="NAME")
    private String name;

    @Column(name="Per")
    private Double per;

   @Column(name="DATE")
    private LocalDate BirthDate;

}
