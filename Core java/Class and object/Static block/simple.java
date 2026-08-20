import java.io.*;

class A{
	static {
	  System.out.println("I am in Static");
	}
	A(){
       System.out.println("I am in constructor");
	}
}

public class simple{
public static void main(String args[]){
	 A obj=new A();

}
}