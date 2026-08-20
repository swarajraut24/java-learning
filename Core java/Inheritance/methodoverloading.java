import java.io.*;

class a{
       a(){};

	int greater(int a1,int b1){
		 if(a1>b1) return a1;
		 else return b1;
	}

	int greater(int arr[]){
		int s=0;
		for(int i=0;i<5;i++){
			if(s<arr[i]){
				s=arr[i];
			}
		}
		return s;
	}
}

	public class methodoverloading{
		public static void main(String args[]){
			int arr[]={3,6,1,9,8};
			a ob=new a();
			System.out.println("greater number:"+ob.greater(23,32));
			System.out.println("greater number:"+ob.greater(arr));


		}
	}