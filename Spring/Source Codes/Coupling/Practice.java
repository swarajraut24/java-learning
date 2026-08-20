import java.util.*;

public class Practice{

	public static void main(String args[]){

		Hashtable <Integer,String> st=new Hashtable<Integer,String>();

		st.put(101,"INDIA");
		st.put(102,"AUSTRALIA");
       

    // Enumeration et=st.keys();


       // while(et.hasMoreElements()){
       //    Integer id=(Integer)et.nextElement();
       //    String country=st.get(id);

       //    System.out.println("Key:"+id+" "+"value:"+country);
       // }   

          Set<Integer> s=st.keySet();

		for(Integer id:s){
			String t=st.get(id);
			System.out.println(t);
		}
}

}