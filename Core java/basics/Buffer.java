import java.io.*;

public class Buffer{

	public static void main(String args[]) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));

		System.out.print("enter the first:");
		int a=Integer.parseInt(br.readLine());

		System.out.print("enter the second:");
		int b=Integer.parseInt(br.readLine());

         int ans=a+b;

		System.out.println("answer is:"+ ans);
			}
}