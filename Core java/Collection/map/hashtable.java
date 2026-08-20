import java.io.*;
import java.util.*;
public class hashtable{

	public static void main(String args[])  {

		 Hashtable <Integer,String> fs=new Hashtable <Integer,String>();

		 fs.put(101,"swaraj");
		  fs.put(102,"raut");
		   fs.put(103,"barshi");

		   System.out.println("hashtable is :"+fs);

		   //for traversing:-

		   Enumeration key=fs.keys();

		   while(key.hasMoreElements()){
		   	  Integer id= (Integer)key.nextElement();
		   	  String name=fs.get(id);
		   	  System.out.println(name);
		     
			}

		    // by using for each loop:-

		    Set<Integer> s=fs.keySet();

		    for(Integer k:s){
		    	System.out.println("key:"+k+" value:"+fs.get(k));
		    }
		   }
}