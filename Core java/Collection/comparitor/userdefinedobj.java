import java.util.*;
import java.io.*;

class NameComparator implements Comparator<Student>{
    public int compare(Student ob1,Student ob2){
        String s1=ob1.name;
        String  s2=ob2.name;

         return s1.compareTo(s2);
    }
}
class RnoComparator implements Comparator<Student>{
    public int compare(Student rno1,Student rno2){
        Integer d1=rno1.rno;
        Integer  d2=rno2.rno;
        return d1.compareTo(d2);
    }
}
class PerComparator implements Comparator<Student>{
    public int compare(Student per1,Student per2){
        Double m1=per1.per;
        Double  m2=per2.per;
        return m1.compareTo(m2);
    }
}


class Student {
    int rno;
    double per;
    String name;

     Student(int rno,String name,Double per){
        this.rno=rno;
        this.name=name;
        this.per=per;
     }
     public int getRno(){
            return rno;
     }
     public String getName(){
            return name;
     }
     public Double getPer(){
            return per;
     }
}


public class userdefinedobj{
    public static void main(String[] args){

      List<Student> ar=new ArrayList<>();

      Student ob1=new Student(101,"swaraj",95.8);
      Student ob2=new Student(109,"pravin",5.1);
      Student ob3=new Student(100,"sourabh",3.98);
      


      ar.add(ob1);
      ar.add(ob2);
      ar.add(ob3);

      Collections.sort(ar,new NameComparator());
      System.out.println("ascending name:-");

      for(Student a:ar){
        System.out.println("name:"+a.getName()+"  roll no:"+a.getRno()+"  per:"+a.getPer());
      }
       
        System.out.println(" ");
       Collections.sort(ar,new RnoComparator());
       System.out.println("ascending rno:-");

      for(Student a:ar){
        System.out.println("name:"+a.getName()+"  roll no:"+a.getRno()+"  per:"+a.getPer());
      }

      
       System.out.println(" ");
       Collections.sort(ar,new PerComparator());
       System.out.println("ascending per:-");

      for(Student a:ar){
        System.out.println("name:"+a.getName()+"  roll no:"+a.getRno()+"  per:"+a.getPer());
      }
    }
}
