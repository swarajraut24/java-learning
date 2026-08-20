import java.io.*;

public class reverse{

	public static void main(String args[]){

		 String s="hello";

		 StringBuffer t=new StringBuffer(s);

		 t.reverse();

		 s=new String(t);

		 System.out.print(s);

	}
}