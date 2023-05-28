package Exception_handling;

public class exa8 {
public static void main(String[] args) {
	String s1="abcd";
	int ar[] ={10,20,30,40,50};
	try
	{
		System.out.println(s1.charAt(6));//risky code 1
		System.out.println(ar[9]); //risky code 2
	}
	catch(Exception h) {
		System.out.println(" generic exception handled");
	}
	System.out.println("hello");
}
}
