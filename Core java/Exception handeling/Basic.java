import java.io.*;

public class Basic {
	public static void main(String[] args){
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));

		int num=0;

		try{
			System.out.println("enter the number:");
			num=Integer.parseInt(br.readLine());
			System.out.println("your number is:"+num);
		}

		catch(IOException ie){
			System.out.println("****I/O problem*****");
		}

		catch(NumberFormatException ne){
			System.out.println("****Given input is not a number*****");
		}

		catch(Exception ex){
			System.out.println("Unknown problem in application");
		}

		System.out.println("you reached at final point");
	}
}