package edu.lab.algorithm.recursion;

/*
 * We have a number of bunnies and each bunny has two big floppy ears. 
 * We want to compute the total number of ears across all the bunnies 
 * recursively (without loops or multiplication). 
 */
public class BunnyEars {
	public int bunnyEars(int bunnies) {
		if (bunnies == 0)//base case to return out of the recursion 
			return 0;
		else
			return 2 + bunnyEars(bunnies - 1);
	}

}
