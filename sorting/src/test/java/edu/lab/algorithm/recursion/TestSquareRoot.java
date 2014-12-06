package edu.lab.algorithm.recursion;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSquareRoot {

	@Test
	public void testIsGoodEnough() {
		SquareRoot number = new SquareRoot();
		assertFalse(600,number.isGoodEnough(125348));
		
	}

}
