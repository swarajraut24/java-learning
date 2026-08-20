import java.io.*;

public class split{

	public static void main(String args[]){

		 String s="3809 Raut chal Barshi";

		 String tok[]=s.split(" ");


		 for(int i=0;i<tok.length;i++){
		 	  System.out.print(tok[i]+" ");
		 }
	}
}