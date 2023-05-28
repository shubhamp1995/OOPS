package method_overloading;

public class demo1 {
public static void main(String[] args) {
	System.out.println(" actual main method");
	main(100);
}


//  method with int parameter
public static void main(int a) {
	System.out.println(a);
	main("shubham", 20);
	main();
	
}
// method with string and int paramter
static void main(String str, int b)
{
	System.out.println("Str is :"+str+" "+"int is :"+b);
}
// method wihtout any paramter
static void main() 
{
	System.out.println(" method without paramter");
}

}
