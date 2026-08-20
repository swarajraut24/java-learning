import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Student{

	private String name;
	private String city;
	private Integer per;


  

	public void setName(String name){
		this.name=name;
	}

	public void setCity(String city){
		this.city=city;
	}

	public void setPer(Integer per){
		this.per=per;
	}

	public String getName(){
		return name;
	}

	public String getCity(){
		return city;
	}

	public Integer getPer(){
		return per;
	}


    HashMap<String,Student> ht= new HashMap<String,Student>();

    public void create(String id,Student st){
           ht.put(id,st);
    }

    public void display(){
    	Set<String> t= ht.keySet();
        
        System.out.println("all student data:");

    	for(String id:t){
    		 Student m=ht.get(id);
              
             
             System.out.println("below data is for id:"+id);
 
    		 	System.out.println("Name:"+m.getName());
    		 	System.out.println("city:"+m.getCity());
    		 	System.out.println("Percentage:"+m.getPer());            
    		 

    		 System.out.println("------------------------------");
    	}
    }

}


public class Assignment2{
	public static void main(String args[]){
   
      Student ob1= new Student();

      ob1.setName("swaraj");
      ob1.setCity("barshi");
      ob1.setPer(64);

       Student ob2= new Student();

      ob2.setName("pravin");
      ob2.setCity("anala");
      ob2.setPer(44);

       Student ob3= new Student();

      ob3.setName("sorabh");
      ob3.setCity("deglur");
      ob3.setPer(21);


      ob1.create("SB-1",ob1);
      ob1.create("SB-2",ob2);
      ob1.create("SB-3",ob3);

       ob1.display();
	}
}