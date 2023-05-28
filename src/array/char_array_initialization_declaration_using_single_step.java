package array;

import java.util.Arrays;

public class char_array_initialization_declaration_using_single_step {
public static void main(String[] args) {
	char c[]= {'a','b','c','d','e'};
	
	System.out.println(c.length);
	for(int i=0; i<=4;i++) {
		System.out.println(c[i]);
	}
	//sorting 
	Arrays.sort(c);
	System.out.println("----ascending order -----");
	for(int i=0;i<=c.length-1;i++) {
		System.out.println(c[i]);
	}
	System.out.println("--descending order-----");
	for(int i=4;i>=0;i--) {
		System.out.println(c[i]);
	}
}
}
