import java.util.*;
import java.io.*;
     

public class average{
public  static void main(String args[]) throws Exception{
 
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	 Integer arr[]= new Integer[5];
  
    int a=0;
    int sum=0;
   
   System.out.println("enter numbers:");


    for (int i=0;i<5;i++){
    	arr[i]=Integer.parseInt(br.readLine());
    	sum=+sum+arr[i];
    }

      

   a=sum/5;

   System.out.println("average is:"+a);

}
}
