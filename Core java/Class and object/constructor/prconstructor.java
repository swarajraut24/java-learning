import java.io.*;

class student{
	int rno;
	String name;
	float per;

	student(){
	   rno=54;
	   name="Swaraj";
	   per=45;
	}

	student(int rno,String name,float per){
	     this.rno=rno;
	     this.name=name;
	     this.per=per;
	}

	void display(){
	System.out.println("Name:"+name);
	System.out.println("rno:"+rno);
	System.out.println("per:"+per);
	}
}

public class prconstructor{
  public static void main(String args[]){
      
      student ob1=new student();
      ob1.display();
      System.out.println();

      student ob2=new student(28,"sourabh",80);
      ob2.display();
  }
}