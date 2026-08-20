import java.util.ArrayList;
import java.util.*;
import java.util.List;

public  class ascendingsort  {
    public static  void  main(String[] args){
        List<Integer> m= new ArrayList<Integer>();
        m.add(32);
        m.add(42);
        m.add(5);
        Collections.sort(m);

        for(Integer a:m){
            System.out.println(a);
        }


    }
}