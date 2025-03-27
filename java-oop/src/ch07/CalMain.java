package ch07;

public class CalMain {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		// c.power = true;
		System.out.println(c.power);
		c.setPower();
		System.out.println(c.power);
		c.setPower();
		System.out.println(c.power);
		c.setPower();
		
		c.setNum(5);
		System.out.println(c.num);
		
		System.out.println(c.oddEven());
		
  		System.out.println(c.setRateNum(0.7));   
	}
}

