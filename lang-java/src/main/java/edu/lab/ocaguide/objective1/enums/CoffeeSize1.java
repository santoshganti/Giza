package edu.lab.ocaguide.objective1.enums;

/*
 * Conceptual Example of how you can think about enums
 */
public class CoffeeSize1 {
	public static final CoffeeSize1 BIG = new CoffeeSize1("BIG", 0);
	public static final CoffeeSize1 HUGE = new CoffeeSize1("HUGE", 1);
	public static final CoffeeSize1 OVERWHELMING = new CoffeeSize1(
			"OVERWHELMING", 2);

	CoffeeSize1(String enumName, int index) {

	}

	public static void main(String[] args) {
		System.out.println(CoffeeSize1.BIG);
	}
}
