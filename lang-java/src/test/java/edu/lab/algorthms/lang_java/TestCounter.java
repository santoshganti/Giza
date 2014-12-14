package edu.lab.algorthms.lang_java;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCounter {

	@Test
	public void testIncrement() {
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		assertEquals(1, c1.increment());
		assertEquals(1, c1.staticIncrement());
		assertEquals(1, c2.increment());
		assertEquals(2, c2.staticIncrement());

	}

	@Test
	public void testCounter1() {
		Counter c1 = new Counter();
		assertEquals(1, c1.increment());
		assertEquals(3, c1.staticIncrement());
		Counter c2 = new Counter();
		assertEquals(1, c2.increment());
		assertEquals(4, c2.staticIncrement());
	}
	
	@Test
	public void testCounter2(){
		assertEquals(5,Counter.staticIncrement());
	}
}
