import java.io.*;

class Student{
	int rno;
	String name;
	Double per;
    
    // using condtructor:-

	// Student(int rno,String name,Double per){
	//      this.rno=rno;
	//      this.name=name;
	//      this.per=per;
	// }

	
	//using set :-

	public void setName(String name){
		this.name=name;
	}

	public void setRno(int rno){
		this.rno=rno;
	}

	public void setPer(Double per){
		this.per=per;
	}
 
	void display(){
			System.out.println("Roll number :"+rno);
			System.out.println("Namr:"+name);
		    System.out.println("Percentage:"+per);
		    System.out.println("------------------------------");
	}	
}

public class array{

	public static void main(String args[]) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));

		Student s[]=new Student[3];
        
        for(int i=0;i<3;i++){
			 
		System.out.print("enter the Roll number :");
		int a=Integer.parseInt(br.readLine());

		System.out.print("enter the Name:");
		String b=br.readLine();

		System.out.print("enter the Percentage:");
		Double c=Double.parseDouble(br.readLine());

    		System.out.println();
     	   
         s[i]=new Student();

		s[i].setName(b);
		s[i].setPer(c);
		s[i].setRno(a);
	}
	for(int i=0;i<3;i++){
		s[i].display();
	}
}
}


