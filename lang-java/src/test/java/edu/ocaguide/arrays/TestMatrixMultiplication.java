package edu.ocaguide.arrays;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMatrixMultiplication {

	@Test
	public void testMultiplication() {
		int[][] firstarray = new int[2][3];
		firstarray[0][0]=1;
		firstarray[0][1]=1;
		firstarray[0][2]=1;
		firstarray[1][0]=1;
		firstarray[1][1]=1;
		firstarray[1][2]=1;
		int[][] secondarray = new int[3][2];

		MatrixMultiplication m = new MatrixMultiplication(firstarray.length,
				firstarray[1].length, secondarray.length, secondarray[1].length);
		int[][] finalarray = m.matrixMultiplication(firstarray, secondarray);

		assertArrayEquals(finalarray, firstarray);

		fail("Not yet implemented");
	}

}
