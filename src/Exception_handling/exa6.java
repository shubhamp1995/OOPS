package Exception_handling;

public class exa6 {
public static void main(String[] args) {
	String s1="abcd";
	try
	{
		System.out.println(s1.charAt(6));//risky code
	}
	catch(ArrayIndexOutOfBoundsException d)
	{
		System.out.println("ArrayIndexOutOfBoundsException handled");
	}
	catch(StringIndexOutOfBoundsException d)
	{
		System.out.println("StringIndexOutOfBoundsException handled");
		
	}
	catch(Exception d)
	{
		System.out.println("generic cException handled");
		
	}
	System.out.println("hello");
}
}
