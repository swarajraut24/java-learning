import java.io.*;
import java.util.*;
public class assignmentstack{

	public static void main(String args[]) throws Exception  {

		     Stack<String> s=new Stack<String>();

		     FileReader fr=new FileReader("a.txt");

		     BufferedReader br=new BufferedReader(fr);

		     while(true){

		         String m=br.readLine();
		         if(m==null){
		         break;
		         }
		         
		         String arr[]=m.split(" ");


		         for(int i=0;i<arr.length;i++){
		         	s.push(arr[i]);
		         }
		     }
     

		     while(!s.empty()){
		     	 System.out.println(s.pop());
		     }

			}
}