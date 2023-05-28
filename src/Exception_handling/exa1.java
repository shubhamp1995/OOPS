package Exception_handling;

public class exa1 {
public static void main(String []args) {
	String s1="abcd";
	try
	{
		System.out.println(s1.charAt(5));//risky code
	}
	catch(StringIndexOutOfBoundsException s) {
		System.out.println("StringIndexOutOfBoundsException handled");
		System.out.println(s1);
		System.out.println(s1.length());
		System.out.println(s1.charAt(2));
	}
	System.out.println("hello");
}
}
