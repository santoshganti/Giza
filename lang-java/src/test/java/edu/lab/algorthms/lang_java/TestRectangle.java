package edu.lab.algorthms.lang_java;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestRectangle {

	@Test
	public void test() {
		Rectangle rectangle = new Rectangle(10, 20);
		assertEquals(200,rectangle.getArea(),0.01);
		fail("Not yet implemented");
	}

}
