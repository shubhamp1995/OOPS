package exception;

public class demo1 {
 public static void main(String [] args) {
	 String s1="velocity";
	
	 try
	 {
		 System.out.println(s1.charAt(9));
	 }
	 catch(StringIndexOutOfBoundsException r)
	 {
		 System.out.println("exception handled");
	 }
	 System.out.println("hello");
	
}
}
