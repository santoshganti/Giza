package edu.lab.algorthms.lang_java;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCounter {
	Counter c1 = new Counter();
	Counter c2 = new Counter();
	@Test
	public void testIncrement() {
		assertEquals(1,c1.increment());
		assertEquals(1,c1.staticIncrement());
		assertEquals(1,c2.increment());
		assertEquals(2,c2.staticIncrement());
	}


}
