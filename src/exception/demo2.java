package exception;

public class demo2 {
	public static void main(String[] args) {
int []s1= {10,20,30,40};

try {
	System.out.println(s1[9]);
}
catch(ArrayIndexOutOfBoundsException s2)
{
	System.out.println(s1[3]);
	System.out.println("ArrayIndexOutOfBoundsException Handled");
}
System.out.println("hello");
 
	}
}
