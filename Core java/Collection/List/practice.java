import java.io.*;
import java.util.*;

public class practice{
	public static void main(String args[]) throws Exception{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

			ArrayList<String> al=new ArrayList<>();


        while(true){
        	System.out.print("Enter city name:");
        	String s=br.readLine();
            
            if(al.contains(s)){
            	continue;
            }
            else{
            	al.add(s);
            }
            
            System.out.print("Do you want to continue:");
            String choice=br.readLine();

            if(choice.equalsIgnoreCase("yes")){
               continue;
            }
            else{
            	break;
            }

        }
        System.out.println(al);
      
	}
}