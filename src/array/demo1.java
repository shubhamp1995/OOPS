package array;

import java.util.Arrays;

public class demo1 {
public static void main(String[] args) {
	int a[][]= {{10,20,-40,1400},{40,50,60,500},{1200,80,90,1000}};
	Arrays.sort(a);
	System.out.println(a[0]);
	System.out.println(a[a.length-1]);	
}
}
