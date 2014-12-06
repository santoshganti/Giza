package edu.lab.algorithms.sorting;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

import static org.junit.Assert.*;

//import static junit.framework.Assert.*;

public class TestInsertionSort {
	private static final Logger logger = LogManager.getLogger(MergeSort.class);

	@Test
	public void testSortFloatingPointArrays() {
		// Test case 1

		// This is the unsorted array and this array is fed to quick sort method
		// for sorting
		double toSort[] = { 5.0f, 2.0f, 4.0f, 6.0f, 1.0f, 3.0f };

		// This is the expected array after sorting. This is used in Assert
		// equals to check if the test is passing or not
		double expected[] = { 1.0f, 2.0f, 3.0f, 4.0f, 5.0f, 6.0f };

		// creating object of the class InsertionSort called sort
		InserstionSort sort = new InserstionSort();

		// sort object is used to call the quick sort method
		double[] sorted = sort.inserstionSort(toSort);

		// checks expected and actual output
		assertArrayEquals(sorted, expected, 0.01);
		logger.info(sorted);

	}

	@Test
	public void testSortIntegers() {
		// Test case 2 - check for integers
		double toSort[] = { 5, 2, 4, 6, 1, 3 };
		double expected[] = { 1, 2, 3, 4, 5, 6 };
		InserstionSort sort = new InserstionSort();
		double[] sorted = sort.inserstionSort(toSort);
		assertArrayEquals(sorted, expected, 0);
	}
}
