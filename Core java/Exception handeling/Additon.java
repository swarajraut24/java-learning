import java.io.*;

public class Additon{
	public static void main(String args[]){

		BufferedReader br=new BufferedReader(new InputStreamReader (System.in));


            int a,b,ans;

		while(true){

            try{
			System.out.println("Enter first number:");
			a=Integer.parseInt(br.readLine());
			break;
		}

		catch(Exception e){
			System.out.println("*****enter valid number******");
		}

         finally{
         	System.out.println("you are in finally block");
         }

      }

		while(true){

            try{
			System.out.println("Enter Second number:");
			b=Integer.parseInt(br.readLine());
			break;
		}

		catch(Exception e){
			System.out.println("*****enter valid number******");
		}
 }

       ans=a+b;

       System.out.println("addition is:"+ans);

		}
	}
