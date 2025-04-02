package ablock;

public class Person {
	private void first() {
		System.out.println("backup");
	}
	
	private void second() {
		System.out.println("delete");
	}

	// 캡슐화
	public void deleteMember() {
		this.first();
		this.second();
	}
}
