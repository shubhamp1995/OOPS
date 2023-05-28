package exception;

public class demo4 {
public static void main(String[] args) {
	String s1="ganesh";
	
	try
	{
		System.out.println(s1.charAt(8));
	}
	catch(StringIndexOutOfBoundsException s2)
	{
		System.out.println(s1.charAt(3));
		System.out.println("StringIndexOutOfoundsException handled");
	}
	System.out.println("Good work");
}
}
