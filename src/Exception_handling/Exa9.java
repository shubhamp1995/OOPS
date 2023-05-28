package Exception_handling;

public class Exa9 {
public static void main(String[] args) {
	String s1="abcd";
	int ar[]= {30,40,50,60,20};
	try
	{
		try							//nested try block
		{
			System.out.println(s1.charAt(9)); //risky code 1
		}
		catch(StringIndexOutOfBoundsException h)
		{
			System.out.println("StringIndexOutOfBoundsException handled ");
			System.out.println(s1.charAt(2));
		}
		System.out.println(ar[8]);  //risky code 2
	}
	catch(ArrayIndexOutOfBoundsException j) {
		System.out.println("ArrayIndexOutOfBoundsException handled");
		System.out.println(ar[3]);
	}
	System.out.println("hello");
}
}
