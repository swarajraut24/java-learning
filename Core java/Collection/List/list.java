import java.util.*;

public class list{
   public static void main(String[] args){
   	ArrayList<String> al=new ArrayList<>();

   	al.add("pune");
   	 	al.add("mumbai");
   	 	 	al.add("barshi");
   	 	 	 	al.add("solapur");

             // al.remove("mumbai");
   	 	 	 // System.out.println(al);
   	 	 	 //  System.out.println(al.size());

   	 	 	  //for each method :-

   	 	 	  // for(String data:al){
   	 	 	  // 	System.out.println(data);
   	 	 	  // }


             //Iterator method:-

   	 	 	 	Iterator data=al.iterator();

   	 	 	 	while(data.hasNext()){
   	 	 	 		System.out.println(data.next());
   	 	 	 	}
   }
}