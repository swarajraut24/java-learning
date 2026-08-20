 import java.io.*;
 import maths.*;
 
public class Demo{
    public static void main(String args[]) {
        arithmatic obj = new arithmatic(10, 4);
        System.out.println("Addition is: " + obj.add());
        System.out.println("Subtraction is: " + obj.sub());
    }
}
