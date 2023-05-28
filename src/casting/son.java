package casting;
//subclass
public class son extends father
{
	public void bike() { // son's own property
		System.out.println("bike:"+" "+"duke"+" "+"cb trigger");
	}
	public void realestate () {  //oeverridden
		System.out.println("own house"+" "+"banglow");
	}
//	public void gold() {
//		System.out.println("1 kg gold");
//	}
//	public void vehicles() {
//		System.out.println("bullet"+" "+"BMW car"+" "+"thar");
	//}
	public void add() { //overridden
		int a=20;
		int b=30;
		System.out.println("addition :"+(a*b));
	}
}
