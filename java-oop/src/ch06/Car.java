package ch06;

public class Car {
	public int num;
	public boolean is;
	// 생성자 오버로딩
	public Car() {
		this(1, true);
	}
	
	public Car(int num, boolean is) {
		this.num = num;
		this.is = is;
	}
	
	//this
	public void print() {
		System.out.println(this.num);
	}
	/*
	 * // 생성자가 없으면 컴파일러 기계어로 변경할 때 기본생성자 모양으로 자동으로 추가
	 * 
	 * public Car() { // 필드 초기화 코드도 자동으로 추가 // 필드는 초기화의 규칙이 필요 this.num = 7;
	 * 
	 * 
	 * this.is = false; this.arr = null; this.list = null;
	 * 
	 * 
	 * 
	 * this.num = 1; this.is = true; this.arr = "test"; this.list = new
	 * ArrayList<String>(); list.add("t"); list.add("b");
	 * 
	 * }
	 * 
	 * 
	 * // 생성자 오버로딩 // 일반 생성자 public Car(int x) { // 컴파일러가 일반생성사 존재하므로 기본생성자 추가x //
	 * 생성자인데 필드초기화 코드가 없다 -> 추가 this.num = x; }
	 * 
	 * public Car(boolean is) { this.is = is; }
	 * 
	 * public Car(int num, boolean is) { this.num = num; this.is = is; }
	 * 
	 * // 메소드 오버로딩 public void test() {} public void test(int x) {}
	 */
}
