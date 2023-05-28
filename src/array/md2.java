package array;

import java.util.Arrays;

public class md2 {
public static void main(String[] args) {
	// 3*4 matrix 
	 /*  0   1   2   3
	0 120 130 140 150
	1 160 170 180 190
	2 200 210 220 230*/
	
	
	int s1 [][]= {{120,130,140,150},{160,170,180,190},{200,210,220,230}};
	
	
	System.out.println("----------");
	System.out.println(s1.length);
	System.out.println("----------");
	System.out.println(s1[0][3]);
	System.out.println("----------");
	
	for(int i=0; i<=2; i++) {
		for(int j=0;j<=3;j++ ) {
			System.out.print(s1[i][j]+" ");
		}
		System.out.println("");
	}
	System.out.println("----------");

	int max=s1[0][0];
	int min=s1[0][0];
	for(int i=0; i<=2; i++) {
		for(int j=0;j<=3;j++) 
		{
			
			if(s1[i][j]>max)
			max=s1[i][j];
			 if(s1[i][j]<min)
				min=s1[i][j];
				
		}
	}
		System.out.println("largest is:"+" "+max);
		System.out.println("smallest is:"+" "+min);

}
}
