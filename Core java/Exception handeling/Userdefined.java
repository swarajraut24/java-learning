import java.io.*;

class Temperature extends Exception{
	 Temperature (String msg){
	 	super(msg);
	 }
}

public class Userdefined {
	public static void main(String[] args){
		BufferedReader br=new BufferedReader(new InputStreamReader (System.in));

		int temp;

		try{
			System.out.print("enter a number:");
			temp=Integer.parseInt(br.readLine());

           if(temp<94){
           	throw new Temperature("Tempearature is less!!");
           }
           if(temp>100){
           	throw new Temperature("Tempearature is more!!");
           }
           System.out.println("Tempearature is normal");
		}

		catch(IOException ie){
              System.out.println("Problem io error!");
		}

		catch(NumberFormatException e){
              System.out.println("enter valid number!");
		}

		 catch(Temperature me){
             System.out.println(me.getMessage());
		 }
	}
}