import java.io.*;
import java.util.*;

public class linked{
	public static void main(String args[]){
		LinkedList<String> ld=new LinkedList<>();

		ld.add("barshi");
		ld.add("pune");
		ld.add("goa");
		ld.add("ranchi");

		ListIterator lr=ld.listIterator();

		System.out.println("Forward direction:");

		while(lr.hasNext()){
			System.out.println(lr.next());
		}
       
        System.out.println("Backward direction:");

		while(lr.hasPrevious()){
			System.out.println(lr.previous());
		}
	}
}