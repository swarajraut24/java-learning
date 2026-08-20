package com.tca.lombokapi.Model;

import lombok.*;

import javax.management.ConstructorParameters;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public class Student {
    private int rno ;
    private String name;
    private double per;
}
