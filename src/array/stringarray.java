package array;

import java.util.Arrays;

public class stringarray {
public static void main(String[] args) {
	
	//step1:decaration
	String s[]=new String[7];  //length 6    length-1
			
			//step2: initialization
			s[0]="shubham";
	        s[1]="gaurav";
	        s[2]="vrushali";
	        s[3]="mahesh";
	        s[4]="ramesh";
	        s[5]="suresh";
	        s[6]="amol";
	        
	        
	        //step3: usages
	        System.out.println(s.length);
	        System.out.println("\n");
	        System.out.println(s[1]);
	        System.out.println("\n");
	        
	        for(int i=0; i<=s.length-1;i++) {
	        	System.out.println(s[i]);
	        }
	        
	        Arrays.sort(s);
	        System.out.println("\n");
System.out.println("alphabetical order string");

	        for(int i=0; i<=s.length-1;i++) {
	        	System.out.println(s[i]);
	        }
	        
}
}
