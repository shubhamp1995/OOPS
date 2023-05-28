package array;

import java.util.Arrays;

public class multidimensional {
public static void main(String[] args) {
	
	//2*3 multidimensional arrays
	//  0  1  2
    //0 10 20 30
	//1 40 50 60
	
	int I [][]=new int[2][3];
	 
	I[0][0]=10;
	I[0][1]=20;
	I[0][2]=30;
	I[1][0]=40;
	I[1][1]=50;
	I[1][2]=60;
	
	System.out.println(I.length);
	System.out.println(Arrays.toString(I));
	System.out.println(I[0][2]);
	
	for(int i=0; i<=1; i++) 
	{
		for(int j=0;j<=2;j++) 
		{
			System.out.print(I[i][j]+" ");
		}
		System.out.println();
	}
	
	
}
}
