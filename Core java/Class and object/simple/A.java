import java.io.*;


class simple{
	int a=20;
	int b=11;
     
     void display(){
	System.out.println("value of a:"+a);
	System.out.print("vakue of b:"+b);
}
 
}

public class A{

	public static void main(String args[]){

		 simple ob1=new simple();
		 simple ob2=new simple();

		 ob1.display();

		 System.out.println(ob1);

	}
}