package edu.ocaguide.arrays;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMatrixMultiplication {

	@Test
	public void testMultiplication() {
		int[][] firstarray = new int[][] { { 1, 1, 1 }, { 1, 1, 1 } };
		int[][] secondarray = new int[][] { { 1, 1 }, { 1, 1 }, { 1, 1 } };
		int[][] finalarray = new int[][]{{3,3},{3,3}};

		MatrixMultiplication m = new MatrixMultiplication(firstarray.length,
				firstarray[1].length, secondarray.length, secondarray[1].length);
		int[][] tomultiply = m.matrixMultiplication(firstarray, secondarray);

		assertArrayEquals(finalarray, tomultiply);

		
	}

}
