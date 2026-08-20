import java.util.*;
import java.io.*;


public class assignment{
	 public static void main(String[] args)throws Exception{
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


	 	 List<String> al=new ArrayList<>();

	 	 System.out.print("how many cities you have to enter:");

	 	 int n=Integer.parseInt(br.readLine());
          
          String s;

	 	 for(int i=0;i<n;i++){
             s=br.readLine();
             al.add(s);
	 	 }

	 	 System.out.println("cities name:");
	 	 System.out.println(al);
         
         al.clear();
         System.out.println(al);

	 }
}