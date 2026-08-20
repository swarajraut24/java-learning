import java.io.*;

class a{
	private String name;
	private int age;
	private int rno;

	public void setName(String name){
		this.name=name;
	}

	public void setRno(int rno){
		this.age=age;
	}

	public void setAge(int age){
		this.rno=rno;
	}

	public String getName(){
		  return name;
	}

	public int getAge(){
		return age;
	}
	public int getRoll(){
		return rno;
	}
}

public class setget{

	public static void main(String args[]){

		a ob1=new a();

		ob1.setName("swaraj");
		ob1.setAge(21);
		ob1.setRno(50);

		System.out.println("your name is :"+ ob1.getName());
		System.out.println("your age is :"+ ob1.getAge());
		System.out.println("your roll no is :"+ ob1.getRoll());
 	}
}