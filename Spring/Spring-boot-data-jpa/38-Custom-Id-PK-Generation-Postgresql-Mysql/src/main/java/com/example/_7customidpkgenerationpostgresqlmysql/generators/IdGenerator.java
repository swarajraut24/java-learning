package com.example._7customidpkgenerationpostgresqlmysql.generators;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.util.Random;

public class IdGenerator implements IdentifierGenerator {
    @Override
    public Object generate(SharedSessionContractImplementor session, Object object) {
        String id=" ";
        Random r=new Random();
        int a=r.nextInt();
        int b= r.nextInt();
        int c=r.nextInt();
        int d= r.nextInt();

        id="TCA-"+(a+b+c+d);

        return  id;
    }
}
