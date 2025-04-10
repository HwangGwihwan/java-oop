package ch11;

public class B extends A { // A의 객체가 할 수 있는것들 다 가능
	public A a;
	public int y;
	public void m2() {
		System.out.println("m2");
	}
	
	public static void main(String[] args) {
		B b = new B();
		b.a = new A();
		
		b.a.x = 1;
		b.y = 2;
		b.m2();
		b.a.m1();
		b.a.name = "goodee";
	}
}
