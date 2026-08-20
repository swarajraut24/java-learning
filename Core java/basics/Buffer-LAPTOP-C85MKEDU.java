import java.io.*;

public class Buffer{

	public static void main(String args[]) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));

		System.out.print("enter the first:");
		float a=Float.parseFloat(br.readLine());

		System.out.print("enter the second:");
		float b=Float.parseFloat(br.readLine());

         float ans=a+b;

		System.out.println("answer is:"+ ans);
			}
}