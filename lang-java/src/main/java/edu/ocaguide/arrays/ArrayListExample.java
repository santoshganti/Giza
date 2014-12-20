package edu.ocaguide.arrays;

import java.util.*;

public class ArrayListExample {
	public static void main(String[] args) {
		List<String>c = new ArrayList<String>();
		c.add("Oslo");
		c.add("paris");
		c.add("Rome");
		int index = c.indexOf("paris");
		c.add(index, "London");
		System.out.println(c);
	}
}
