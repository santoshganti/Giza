package edu.lab.ocaguide.objective1.enums;

enum CoffeeSize {
	BIG(8), HUGE(10), OVERWHELMING(16);
	private int ounce;

	CoffeeSize(int ounce) {
		this.ounce = ounce;
	}

	private int ounces;

	public int getOunces() {
		return ounce;
	}
};

public class CoffeeTestEnum {
	CoffeeSize size;

	public static void main(String[] args) {
		CoffeeTestEnum drink1 = new CoffeeTestEnum();
		drink1.size = CoffeeSize.BIG;

		CoffeeTestEnum drink2 = new CoffeeTestEnum();
		drink2.size = CoffeeSize.OVERWHELMING;

		System.out.println(drink1.size.getOunces());
		for (CoffeeSize cs : CoffeeSize.values())
			System.out.println(cs + " " + cs.getOunces());

	}
}
