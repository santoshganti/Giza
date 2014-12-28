package edu.ocaguide.operators;

public class Increment {
	public void primitive(int i) {

		i = i + 1;
		System.out.println("Number:" + i);

	}

	public void objects(Integer i) {

		System.out.println("Oject " + i.doubleValue());

	}

	public static void main(String[] args) {
		int i1 = 5;
		Integer i = new Integer(5);

		Increment inc = new Increment();

		inc.primitive(i1);
		System.out.println("After Modify primitive " + i1);

		inc.objects(i);
		System.out.println("After modify object " + i);

	}
}
