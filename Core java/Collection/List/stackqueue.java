 
import java.util.*;
public class stackqueue{

	public static void main(String args[])  {

		 Stack <String> fs=new Stack<String>();

		 System.out.println("stack:-");

		 fs.add("swaraj");
		  fs.add("raut");
		   fs.add("barshi");
           
           fs.pop();

              System.out.println(fs);
		   System.out.println("top element:-"+fs.peek());
		     System.out.println();



		   //for queue:-

		   System.out.println("queue:-");

		   Queue <String> sm=new LinkedList<String>();

            
		 sm.add("mango");
		  sm.add("pineapple");
		   sm.add("barshi");
           
           sm.remove();
           
            System.out.println(sm);
		   System.out.println("top element:-"+sm.peek());
 
   System.out.println();



  //priority queue:-

		   //priority queue does not allow null
		   // it always print numbers in ascending order

		     System.out.println("PriorityQueue:-");


		   PriorityQueue<String> pq= new PriorityQueue<>();

		   pq.add("Arman");
		   pq.add("Rajan");
		   pq.add("Mahesh");

		   System.out.println(pq);

		     System.out.println();


         PriorityQueue<Integer> marks= new PriorityQueue<>();
         
         marks.add(23);
         marks.add(45);
         marks.add(22);
         marks.add(21);
         marks.add(2);
         marks.add(43);

         System.out.println(marks);


          System.out.println();


      // Deque :-

          System.out.println("Deque:-");

         Deque<Integer> nums= new ArrayDeque<>();

         nums.add(12);
         nums.add(23);
         nums.add(43);
         nums.add(22);
         nums.add(15);
		     
		   System.out.println(nums);
		   System.out.println(nums.removefirst());

		   System.out.println(nums);
			}
}