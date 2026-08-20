 
 import java.io.*;
import java.util.*;

public class Assignment{
	public static  void main(String args[]) throws Exception{

		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
          
          System.out.println("enter no of input:");

          int s= Integer.parseInt(br.readLine());
		

           Set<Integer> l= new LinkedHashSet<Integer>();

          System.out.println("Enter numbers to add in collection:");

          int d;

           while(s>0){
           
           d=Integer.parseInt(br.readLine());

           Boolean c= l.add(d);


            if(c==true){
            	System.out.println("number is added");
            	s--;
            }
             else {
           	  System.out.println("already number is present");
           }
          

}


         System.out.println("number present in the collection:");
          for(Integer m:l){
          	 System.out.println(m);
          }

           }
	
}