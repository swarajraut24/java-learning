import java.util.*;

class method{
	void ascii(int no){
       System.out.println(no);
	}
}

public class test {


	public static void main(String args[]){
       String a="AFREEN";
       int num;
         char c;
         method m=new method();

       for(int i=0;i<a.length();i++){
            c=a.charAt(i);
            num=c;
            m.ascii(c);
            break;
       }
	}
}