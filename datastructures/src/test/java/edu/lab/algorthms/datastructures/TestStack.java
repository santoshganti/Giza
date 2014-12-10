package edu.lab.algorthms.datastructures;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestStack {

	@Test
	public void testStack() {
		StackImpl stack = new StackImpl(10);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(3);
		stack.push(4);
		assertTrue(4 == stack.pop());
		assertTrue(3 == stack.pop());
		assertTrue(3 == stack.pop());
		assertTrue(2 == stack.pop());
		assertTrue(1 == stack.pop());
	}

	@Test(expected = StackOverflowException.class)
	public void testStackOverflow() {
		StackImpl stack = new StackImpl(4);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
	}

	@Test(expected = StackUnderflowException.class)
	public void testStackUnderflow() {
		StackImpl stack = new StackImpl(4);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		assertTrue(4 == stack.pop());
		assertTrue(3 == stack.pop());
		assertTrue(2 == stack.pop());
		assertTrue(1 == stack.pop());
		assertTrue(0 == stack.pop());
	}

}
