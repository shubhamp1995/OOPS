package array;

import java.util.Arrays;

public class int_Arrays
 {
public static void main(String[] args) {
	
	//Step1:declaration
	int I[]=new int[4];
	I[0]=50;
	I[1]=100;
	I[2]=75;
	I[3]=25;
	
	System.out.println(I.length);
	System.out.println(I[3]);
	
	System.out.println("----original values-----");
	for(int i=0; i<=I.length-1;i++) {
		System.out.println(I[i]);
	}
	System.out.println("-----reverse order-------");
	for(int i=I.length-1; i>=0;i--) {
		System.out.println(I[i]);
	}
	Arrays.sort(I);//25,50,75,100
	System.out.println("-----ascending order------");
	for(int i=0; i<=I.length-1;i++) 
	{
		System.out.println(I[i]);
	}
	System.out.println("-----descending order-------");
	for(int i=I.length-1;i>=0;i--) {
		System.out.println(I[i]);
	}
}
}
