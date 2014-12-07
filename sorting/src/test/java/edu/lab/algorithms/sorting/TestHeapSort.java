package edu.lab.algorithms.sorting;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestHeapSort {

	@Test
	public void testHeapSort() {
		int[] toSort = { 5, 2, 4, 6, 1, 3 };
		int[] expected = { 1, 2, 3, 4, 5, 6 };
		HeapSort sort = new HeapSort();
		int[] sorted = sort.heapSort(toSort);
		assertArrayEquals(sorted, expected);
	}
}
