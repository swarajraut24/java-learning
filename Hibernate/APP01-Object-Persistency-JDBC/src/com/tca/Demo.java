package com.tca;

import java.util.Arrays;
import java.util.List;

import com.tca.entities.Student;

public class Demo {

	public static void main(String[] args) {
//		
//		Student s1=new Student(101,"AAA",90);
//		Student s2=new Student(102,"OOO",89);
//		Student s3=new Student(103,"CCC",23);
		
		List<Student> L1=Arrays.asList(new Student(101,"AAA",90),new Student(102,"OOO",89),new Student(103,"CCC",23));
	 
		 
		for(Student ob: L1) {
			System.out.println("Rollno:"+ob.getRno());
			System.out.println("Name"+ob.getName());
			System.out.println("Percentage"+ob.getPer());
			
		}
//		
//		 List<Integer> ob= Arrays.asList(11,22,33);
//		 display(ob);
	}
	
	public static void display(List<Integer>m) {
		System.out.println(m);
	}
 
}
