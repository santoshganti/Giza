package edu.lab.algorthms.datastructures;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestQueue {

	@Test
	public void testIsEmptyQueue() {
		QueueImpl queue = new QueueImpl(10);
		assertTrue(queue.isEmpty());
	}

	@Test
	public void testIsEmptyWhenNotEmpty() {
		QueueImpl queue = new QueueImpl(10);
		queue.enqueue(5);
		assertTrue(!queue.isEmpty());
	}

	@Test(expected = QueueFullException.class)
	public void testIsFullWhenNotFull() {
		QueueImpl queue = new QueueImpl(1);
		queue.enqueue(2);
		queue.enqueue(4);

	}

	@Test
	public void testPushAndPop() {
		QueueImpl queue = new QueueImpl(10);
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.enqueue(5);
		assertEquals(1, queue.dequeue());
		assertEquals(2, queue.dequeue());
		assertEquals(3, queue.dequeue());
		assertEquals(4, queue.dequeue());
		assertEquals(5, queue.dequeue());

	}

	@Test(expected = QueueEmptyException.class)
	public void testDequeueOnEmptyQueue() {
		QueueImpl queue = new QueueImpl(10);
		queue.dequeue();
	}
}
