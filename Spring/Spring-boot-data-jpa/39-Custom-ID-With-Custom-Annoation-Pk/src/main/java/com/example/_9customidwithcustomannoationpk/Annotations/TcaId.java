package com.example._9customidwithcustomannoationpk.Annotations;

import com.example._9customidwithcustomannoationpk.Generator.IdGenerator;
import org.hibernate.annotations.IdGeneratorType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@IdGeneratorType(IdGenerator.class)
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface TcaId {
    public  String name() default "STD";

}
