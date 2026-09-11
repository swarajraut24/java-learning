package com.example._7customidpkgenerationpostgresqlmysql.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student {

    @Id
    @GenericGenerator(name="my-custom-generator",strategy = "com.example._7customidpkgenerationpostgresqlmysql.generators.IdGenerator")

    @GeneratedValue(generator = "my-custom-generator")
    @Column(name="RNO")
    private String rno;

    @Column(name="NAME")
    private String name;

    @Column(name="Per")
    private Double per;

    @Column(name="DATE")
    private LocalDate BirthDate;

}
