package com.example._6autopkgenerationpostgresqlmysql.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name="RNO")
    private UUID rno;

    @Column(name="NAME")
    private String name;

    @Column(name="Per")
    private Double per;

   @Column(name="DATE")
    private LocalDate BirthDate;

}
