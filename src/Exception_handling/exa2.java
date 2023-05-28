package Exception_handling;

public class exa2 {
public static void main(String[]args) {
	int ar[]= {10,20,30,40,50};
	try
	{
		System.out.println(ar[9]);//risky code
	}
	catch(ArrayIndexOutOfBoundsException s1) 
	{
		System.out.println("ArrayIndexOutOfBoundsException handled");
	}
	System.out.println("good");
}
}
