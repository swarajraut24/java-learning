

	class travel{

		car ob=new car();
        
        travel(){
        ob.move();
    }
          
	}

	class car{
         void move(){
         	System.out.println("car is moving");
         }
	}


public class Tightly{

	public static void main(String args[]){ 

            travel s=new travel();
	}
}