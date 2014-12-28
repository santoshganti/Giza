package edu.ocaguide.operators;

class SuperString {
	public String toString() {
		return "Super String";
	}

	public Object toString(String str) {
		return "Super " + str;
	}
}

class SubString extends SuperString {
	public String toString() {
		return "Sub String";
	}

	public String toString(String str) {
		return "Sub " + str;
	}
}

public class StringTest {
	public static void main(String[] args) {
		System.out.println(new SuperString().toString("String"));
		System.out.println(((Object) new SuperString()).toString());
	}
}
