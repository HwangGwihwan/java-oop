package ch06;

public class CarMain {

	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car(7, true);
		c1.print();
		c2.print();
		
		/*
		 * Car c = new Car(); System.out.println(c.num);
		 */
		
		/*
		 * Car c2 = new Car(5); System.out.println(c2.num); System.out.println(c2.is);
		 * 
		 * Car c3 = new Car(true); System.out.println(c3.num);
		 * System.out.println(c3.is);
		 * 
		 * Car c4 = new Car(25, true); System.out.println(c4.num);
		 * System.out.println(c4.is);
		 */
	}
}
