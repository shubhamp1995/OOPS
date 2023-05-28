package Exception_handling;

public class exa7 {
public static void main(String[] args) {
	String s1="abcd";
	int ar[] ={10,20,30,40,50};
	try
	{
		System.out.println(s1.charAt(6));
	}
	catch(StringIndexOutOfBoundsException d) {
		System.out.println("StringIndexOutOfBoundsException handled");
	}
	try
	{
		System.out.println(ar[8]);//risky code
	}
	catch(ArrayIndexOutOfBoundsException H) {
		System.out.println("ArrayindexOutOfBoundsException handled");
	}
					
		
	}

}
