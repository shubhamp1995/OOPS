package multilevelinheritance;
// super/sub class
public class whatsappv2 extends whatsappv1
{
public void f3() {
	System.out.println("f3:"+"audio calling");
}
//public void f1() {
//	System.out.println("f1:"+"sms");
//	
//}
//public void f2() {
//	System.out.println("f2:"+"emoji");
//}
	
public static void main(String[] args) {
	whatsappv2 n2=new whatsappv2();
	n2.f1();
	n2.f2();
	n2.f3();
	
}
}
