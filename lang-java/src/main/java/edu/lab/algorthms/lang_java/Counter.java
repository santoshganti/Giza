package edu.lab.algorthms.lang_java;

public class Counter {
	int count;
	static int Count;

	public int increment() {
		return ++count;
	}

	public  static int staticIncrement() {
		return ++Count;
	}
	
}
