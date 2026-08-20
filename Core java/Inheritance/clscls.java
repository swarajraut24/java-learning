import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class a{
	int a=12;
	int b=20;

	a(){};
	a(int a,int b){};
	a(int c){};

	void display(){
	}
}

public class clscls{
	public static void main(String args[]){
        
        Class<a> cob=a.class;
       
       System.out.println("-------for data members------");
		Field m[]=cob.getDeclaredFields();

		for(Field field:m){
			System.out.println(field);
		}
		System.out.println("---------------------------");



       System.out.println("-------for Constructors------");
	    Constructor constructor[]=cob.getDeclaredConstructors();

		for(Constructor d:constructor){
			System.out.println(d);
		}
		System.out.println("---------------------------");


  
       System.out.println("-------for methods------");
		Method c[]=cob.getMethods();

		for(Method method:c){
			System.out.println(method);
		}
		System.out.println("---------------------------");


	}
}