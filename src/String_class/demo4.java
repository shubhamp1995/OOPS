package String_class;

public class demo4 {
public static void main(String[] args) {
	String s1="velocity";
	
	String s2="";
	String s3="abcd";
	String s4="ABCD";
	String s5="My name is Shubham";
	
	System.out.println(s1.charAt(5));
	System.out.println("----------");
	System.out.println(s1.toUpperCase());
	System.out.println("--------------");
	System.out.println(s3.equals(s4));//false
	System.out.println("--------------");
	System.out.println(s3.equalsIgnoreCase(s4));//true
	System.out.println("--------------");
	System.out.println(s1.length());//8
	System.out.println("--------------");
	System.out.println(s2.isBlank());//true
	System.out.println(s2.isEmpty());//true
	System.out.println(s3.isEmpty());//false
	System.out.println("--------------");
	System.out.println(s5.contains("my"));//false
	System.out.println(s5.contains("is"));//true
}

}
