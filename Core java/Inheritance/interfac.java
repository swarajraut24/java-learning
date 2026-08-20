import java.io.*;

interface A{
	void display();
}

interface B{
	void show();
}

class C implements A,B{

	C(){};

	public void display(){
		System.out.println("good morning");
	}
	public  void show(){
		System.out.println("hello");
	}
}

public class interfac{
	public static void main(String args[]){
         C ob=new C();
         ob.display();
         ob.show();
	}
}