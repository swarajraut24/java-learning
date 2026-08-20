import java.io.*;
import java.util.*;
public class treeset{

	public static void main(String args[]) throws Exception {
                TreeSet<String> ts=new TreeSet<String>();
            
                ts.add("pune");
                ts.add("goa");
                ts.add("barshi");
                ts.add("barshi")
                ts.add("barshi")

                System.out.println("ascending order:"+ts);
                System.out.println("descending order:"+ts.descendingSet());
             
             TreeSet<Integer> nums=new TreeSet<Integer>();
             nums.add(32);
             nums.add(23);
             nums.add(22);
             nums.add(232);

       System.out.println(nums);

			}
}