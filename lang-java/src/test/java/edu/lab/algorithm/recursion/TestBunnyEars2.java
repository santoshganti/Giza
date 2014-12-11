package edu.lab.algorithm.recursion;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestBunnyEars2 {

	@Test
	public void test() {
		BunnyEars2 bunnies = new BunnyEars2();
		assertEquals(0, bunnies.bunnyEars2(0));
		assertEquals(2, bunnies.bunnyEars2(1));
		assertEquals(5, bunnies.bunnyEars2(2));
		assertEquals(7, bunnies.bunnyEars2(3));
		assertEquals(10, bunnies.bunnyEars2(4));
		assertEquals(12, bunnies.bunnyEars2(5));
		assertEquals(15, bunnies.bunnyEars2(6));
		assertEquals(25, bunnies.bunnyEars2(10));

	}

}
