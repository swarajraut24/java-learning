import java.util.*;
import java.io.*;


public class assignment{
	 public static void main(String[] args)throws Exception{
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


	 	 Set<Integer> al=new TreeSet<>();

	 	 System.out.print("how many cities you have to enter:");

	 	 int n=Integer.parseInt(br.readLine());
        int s;

	 	 for(int i=0;i<n;i++){
             s=Integer.parseInt(br.readLine());
             al.add(s);
	 	 }

	 	 System.out.println("cities name:");
	 	 System.out.println(al);
         

	 }
}