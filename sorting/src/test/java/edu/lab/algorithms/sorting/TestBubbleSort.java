package edu.lab.algorithms.sorting;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestBubbleSort {

	@Test
	public void testBubbleSortInetegerArray() {
		int[] toSort = { 5, 2, 4, 6, 1, 3 };
		int[] expected = { 1, 2, 3, 4, 5, 6 };
		BubbleSort sort = new BubbleSort();
		int[] sorted = sort.bubbleSort(toSort);
		assertArrayEquals(sorted, expected);
	}

}
