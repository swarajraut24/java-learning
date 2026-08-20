package com.tca;

//way-1
//public class Car {
//  
//	public static Car ob= new Car();
//	
//	
//	public void display() {
//		System.out.println("i am in a display");
//	}
//	
//	
//	
//	public static void main(String args[]) {
//		 
//		Car ob1=Car.ob;
//		ob1.display();
//	}
//}


//way-2

//public class Car {
//	public static Car ob= null;
//
//
//public  static Car getinstance() {
//	
//	 if(ob==null) {
//		 ob=new Car();
//	 }
//	 return ob;
//}
//
//public void display() {
//	System.out.println("i am in a display");
//}
//
//
//public static void main(String args[]) {
//	 
//	Car ob1=Car.getinstance();
//	ob1.display();
//}
//}




//way-3


//public class Car {
//	public static Car ob= null;
//
//
//public  synchronized static Car getinstance() {
//	
//	 if(ob==null) {
//		 ob=new Car();
//	 }
//	 return ob;
//}
//
//public void display() {
//	System.out.println("i am in a display");
//}
//
//
//public static void main(String args[]) {
//	 
//	Car ob1=Car.getinstance();
//	ob1.display();
//}
//}


//way-4


public class Car {
	public static Car ob= null;


public static Car getinstance() {
	
	 if(ob==null) {
		 
		 synchronized(Car.class) {
		 if(ob==null) {
			  ob=new Car();
		 }
	 }
	 }
	 return ob;
}

public void display() {
	System.out.println("i am in a display");
}


public static void main(String args[]) {
	 
	Car ob1=Car.getinstance();
	ob1.display();
}
}