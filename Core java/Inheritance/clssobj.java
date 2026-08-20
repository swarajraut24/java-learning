import java.io.*;

class a{
	int s=19;

	void display(){
	 System.out.println("i am in class a");
	}

	public String toString(){
		 return "i am in to string";
	}
}

public class clssobj {
	public static void main(String args[]){
		a ob=new a();

		System.out.println(ob);
	}
}