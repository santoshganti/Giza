package edu.lab.algorthms.lang_java;

public class ArgumentsDemo {

	public void increment(int i) {
		i++;
	}

	public void increment(MutableInteger i) {
		i.increment();
	}

	public void badSwap(int i, int j) {
		int temp = i;
		i = j;
		j = temp;
	}

	public void badSwap(MutableInteger i, MutableInteger j) {
		MutableInteger temp = i;
		i = j;
		j = temp;
	}

	public void swap(MutableInteger i, MutableInteger j) {
		int temp = i.getValue();
		i.setValue(j.getValue());
		j.setValue(temp);
	}

	public static void main(String[] args) {
		int p = 10;
		ArgumentsDemo demo = new ArgumentsDemo();

		System.out.println("BEFORE:" + p);
		demo.increment(p);
		System.out.println("AFTER:" + p);

		MutableInteger mp = new MutableInteger(10);//22234
		System.out.println("BEFORE:" + mp.getValue());
		demo.increment(mp);
		System.out.println("AFTER:" + mp.getValue());

		MutableInteger mk = new MutableInteger(20);//3456
		System.out.println("BEFORE: mp=" + mp.getValue() + "mk="
				+ mk.getValue());
		demo.badSwap(mp, mk);
		System.out.println("AFTER: mp=" + mp.getValue() + " mk="
				+ mk.getValue());

		System.out.println("BEFORE: mp=" + mp.getValue() + "mk="
				+ mk.getValue());
		demo.swap(mp, mk);
		System.out
				.println("AFTER: mp=" + mp.getValue() + "mk=" + mk.getValue());
	}

}

class MutableInteger {
	private int i;

	public MutableInteger(int i) {
		this.i = i;
	}

	public void increment() {
		i++;
	}

	public int getValue() {
		return i;
	}

	public void setValue(int p) {
		this.i = p;
	}
}
