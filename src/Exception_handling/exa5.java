package Exception_handling;

public class exa5 {
public static void main(String[] args) {
	String s1="abcd";
	try
	{
		System.out.println(s1.charAt(7));//risky code
	}
	catch(Exception f) {
		f.printStackTrace();
		System.out.println("generic exception handled");
	}
	System.out.println("hello");
}
}
