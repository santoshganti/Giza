package edu.lab.algorithm.recursion;

import static org.junit.Assert.*;

import org.junit.Test;

public class testBunnyEars {

	@Test
	public void test() {
		BunnyEars bunnies = new BunnyEars();
		assertEquals(0, bunnies.bunnyEars(0));
		assertEquals(2, bunnies.bunnyEars(1));
		assertEquals(6, bunnies.bunnyEars(3));
		assertEquals(8, bunnies.bunnyEars(4));
		assertEquals(100, bunnies.bunnyEars(50));
		assertEquals(468, bunnies.bunnyEars(234));
	}

}
