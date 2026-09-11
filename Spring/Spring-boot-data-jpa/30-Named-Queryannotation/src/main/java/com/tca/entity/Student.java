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
@NamedQuery(name="Student.findAll",query="select s from Student s where s.per>=:per and s.gender=:gender" )
@NamedQuery(name="Student.updateName",query="update Student s Set s.name=:name where s.per=:per")
@NamedQuery (name="Student.findgenderandname",query = "select s.name,s.gender from Student s where s.per>=:per and s.gender=:gender")
@NamedQuery(name="Student.findgendercount",query="select s.gender,count(s) from Student s group by gender")
@NamedNativeQuery(name="Student.findgender",query ="select * from student s where s.gender=:gender" ,resultClass = Student.class)
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
