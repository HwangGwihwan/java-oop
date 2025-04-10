package ch11;

public class D extends C { // 1)extends A 2)extends C
	public int k;
	
	// A + C
	public D() {
		super(); // 부모생성자 C() -> A()
		this.k = 0;
		// this...
		
		// A() : x, name, m1()
		// C() : z, m3()
		// D() : k
	}
	
	
	public static void main(String[] args) {
		D d = new D();
		d.x = 1; // this.x 없다 -> super.x 없다 -> super.super.x 있다
		d.z = 2; // this.z 없다 -> super.z 있다
		d.k = 3; // this.k 있다
	}

}
