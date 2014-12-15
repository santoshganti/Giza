package edu.lab.algorthms.lang_java;

class Coffee {
	enum CoffeeSize {
		BIG, HUGE, OVERWHELMING
	};

	CoffeeSize size;
}

public class CoffeeTestEnum {

	public static void main(String[] args) {
		Coffee drink = new Coffee();
		drink.size = Coffee.CoffeeSize.BIG;
	}
}
