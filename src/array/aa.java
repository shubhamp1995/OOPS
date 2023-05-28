package array;

import java.util.Arrays;

public class aa {
public static void main(String[] args) {
	
		  				//0
		  int numbers[] ={55,32,45,98,100,82,11,9,1,39,50};//smallest 9   largest 100

		 /*Arrays.sort(numbers);
		 System.out.println(numbers[0]);
		 System.out.println(numbers[numbers.length-1]);*/
//		 for (int i = 0; i <numbers.length-1; i++) 
//		 {
//			 System.out.print(numbers[i]+" ");
//		 }
		  int largetst = numbers[0];//100
		  int smallest=numbers[0];//1
		  							//10
		  for (int i = 0; i <=numbers.length-1; i++)//0,1,2,3,4,5,6,7,8,9,10,11
		  {
			  if (numbers[i] > largetst)// 
				    largetst = numbers[i]; 
			   if(numbers[i]<smallest)//
				   smallest=numbers[i]; 
				  }
		  System.out.println("--------------------------");
		  System.out.println("arrays element"+ Arrays.toString(numbers));
		  System.out.println("size of arrays"+" "+numbers.length);
		  
		  
				  System.out.println("Largest Number is : " + largetst);
				  System.out.println("smallest Number is : " + smallest);
				 }
				
		  
}
