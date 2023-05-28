package String_class;

public class reverse_String {
public static void main(String[] args) {
	String str="university";    //10//m+a+h+b+u+h+s//length=7====0to6
	//System.out.println(str.length());
	String s1[]=str.split("");//0to9
	
	for(int i=0;i<=s1.length-1;i++)
	{
		System.out.print(s1[i]+" ");
		
	}
	System.out.println("--------------------");
	System.out.println(s1.length);
}
}
