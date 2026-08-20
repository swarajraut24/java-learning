import java.io.*;

 abstract class staff{

	private String name;
	private String city;
	private int salary;

	public staff (String name,String city,int salary){
		this.name=name;
		this.city=city;
		this.salary=salary;
	}

	public String getName(){
		return name;
	}

	public String getCity(){
		return city;
	}

	public int getSalary(){
		return salary;
	}

	abstract void display();
}

class fullstaff extends staff{
     
     public fullstaff(String name,String city,int salary){
		super(name,city,salary);
     }

     void display(){
     	System.out.println("name:"+getName());
     	System.out.println("city:"+getCity());
     	System.out.println("salary:"+getSalary());
     }
} 

class partstaff extends staff{

	private int nohrs;
	private int rate;

     public partstaff(String name,String city,int salary,int nohrs,int rate){
		super(name,city,salary);
		this.nohrs=nohrs;
		this.rate=rate;
     }

     void display(){
     	System.out.println("name:"+getName());
     	System.out.println("city:"+getCity());
     	System.out.println("salary:"+getSalary());
     	System.out.println("nohrs:"+nohrs);
     	System.out.println("salary:"+rate);
     }
}

public class abstr{
	public static void main(String args[]){
		fullstaff ob=new fullstaff("swaraj","barshi",843843);
		ob.display();

		partstaff ob1=new partstaff("swaraj","barshi",843843,9,3);
		ob1.display();
	}
}
