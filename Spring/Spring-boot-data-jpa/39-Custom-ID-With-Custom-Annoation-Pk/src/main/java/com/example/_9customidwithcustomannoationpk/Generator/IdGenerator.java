package com.example._9customidwithcustomannoationpk.Generator;

import com.example._9customidwithcustomannoationpk.Annotations.TcaId;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.util.Random;

public class IdGenerator implements IdentifierGenerator {

    private  String prefix;

    public IdGenerator(TcaId ob){
        this.prefix=ob.name();
    }

    @Override
    public Object generate(SharedSessionContractImplementor session, Object object) {
        String id=" ";
        Random r=new Random();
        int a=r.nextInt();
        int b= r.nextInt();
        int c= r.nextInt();
        int d= r.nextInt();

        id="TCA-"+prefix+(a+b+c+d);

        return  id;
    }
}
