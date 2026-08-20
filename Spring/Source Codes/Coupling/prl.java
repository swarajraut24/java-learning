import java.util.*;
import java.io.*;


interface Grandfather{
	public void pocketmoney();
}

  class Father implements Grandfather{

	  public  void pocketmoney(){
	   	    System.out.println("father pocketmoney");
	   }
}


  class Son implements Grandfather {
      
      public void pocketmoney(){
	   	    System.out.println("son pocketmoney");
	   }


}

 class Daughter implements Grandfather{
         public  void pocketmoney(){
	   	    System.out.println("Daughter pocketmoney");
	   }
}


  class Family{
        

        public  void setMoney( Grandfather g){
                  g.pocketmoney();
         }
}

public class prl{
	  public static void main(String args[]){
	  	  Son s =new Son();

	  	  Family f =new Family();

	  	  f.setMoney(s);

	  }
}