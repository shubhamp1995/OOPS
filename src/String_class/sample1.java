package String_class;

public class sample1 {
public static void main(String [] Args) {
	//object creation of String 
	// without using new keyword
	String s1="velocity";
	
	String s2=new String("abc");
	
	try
	{
		System.out.println(s2.charAt(3));
	}
	catch(StringIndexOutOfBoundsException s3)
	{
		System.out.println(s2.charAt(2));
		System.out.println("StirngIndexOutOfboundsException Handled");
	}
	System.out.println("good");
	
	
}
}
