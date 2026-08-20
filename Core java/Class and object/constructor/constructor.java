import java.io.*;

class s{
	int i;
	int j;
    
    s(int a,int b){
       i=a;
       j=b;
    }

	void display(){
        System.out.println(i);
        System.out.println(j);
	}
}

public class constructor{

public static void main(String args[]){
	 s ob1=new s(12,20);

	 ob1.display();
}
}