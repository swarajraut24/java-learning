import java.util.*;

class Area{
	final  double pi=3.14;

	public double getRadius(double r){
		return pi*(r*r);
	}
}

public class circle{
public static void main(String args[]){
	 Area ob=new Area();
     
    

     System.out.print("enter radius of circle:");
     Scanner sc=new Scanner (System.in);

      double r=sc.nextDouble();

	 System.out.println("Area of circle:"+ob.getRadius(r));
}
}