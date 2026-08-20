import java.util.*;
import java.io.*;

class MyComparator implements Comparator<Integer>{
	public int compare(Integer ob1,Integer ob2){
		 return -ob1.compareTo(ob2);
	}
}

public class descendingsort{
	public static void main(String[] args){

      List<Integer> ar=new ArrayList<>();

      ar.add(43);
      ar.add(23);
      ar.add(56);

      Collections.sort(ar,new MyComparator());

      System.out.println("descendingsort:-");

      for(Integer a:ar){
      	System.out.println(a);
      }
	}
}