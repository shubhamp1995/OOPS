package compile_time_polymorphism;



public class demo2 {
	public static void main(String[] args) {
		demo1 d1=new demo1();
		d1.addition(10, 20);
		d1.addition(10, 20, 30);
		d1.addition(10, 20, "shubham");
	}
}
