import java.io.*;
import java.util.Arrays;


public class binarysearch{
	public static void main(String args[]){

         int arr[]={11,22,33,44,55};

         Arrays.sort(arr);

         int pos=Arrays.binarySearch(arr,33);

         System.out.print(pos);
	}
}