import java.util.*;

//constructor injection

// interface Vehicle{
// 	public void move();
// }

// class Car implements Vehicle{
// 	public void move(){
//            System.out.println("car is moving");
// 	}
// }

// class Bike implements Vehicle{
// 	public void move(){
// 		 System.out.println("bike is moving");
// 	}
// }

// class Train implements Vehicle{
// 	public void move(){
// 		 System.out.println("train is moving");
// 	}
// }

// class Travel{

// 	public Travel(Vehicle c){
//              Vehicle m=c;
//              m.move();
// 	}
// }

// public class Looselycoupling{
// 	public static void main(String args[]){
          
//           Travel ob=new Travel(new Train());
// 	}
// }



//setter injection

interface Vehicle{
	public void move();
}

class Car implements Vehicle{
	public void move(){
           System.out.println("car is moving");
	}
}

class Bike implements Vehicle{
	public void move(){
		 System.out.println("bike is moving");
	}
}

class Train implements Vehicle{
	public void move(){
		 System.out.println("train is moving");
	}
}

class Travel{

  public void setVehicle(Vehicle c){
        c.move();
   }
}

public class Looselycoupling{
	public static void main(String args[]){
          
          Travel ob=new Travel();

          ob.setVehicle(new Train());
	}
}