import java.io.*;

class A{
	final int s=12;
	 
	static {
	  System.out.println("I am in Static");
	}
	public A()
    {
       System.out.println("I am in constructor");

	}
	{
          System.out.println("I am in instance block");
	}
}

public class finalkey{
public static void main(String args[]){
	 A obj=new A();

}
}