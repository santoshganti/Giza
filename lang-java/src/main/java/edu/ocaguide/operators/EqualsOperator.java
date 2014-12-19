package edu.ocaguide.operators;

public class EqualsOperator {
	public static void main(String[] args){
		EqualsOperator b1 = new EqualsOperator();
		EqualsOperator b2 = new EqualsOperator();
		EqualsOperator b3 = b1;
		
		String s1 = "Bob";
		String s2 = "Bob";
		String s3 = "bob"; //lowercase
		
		System.out.println(b1.equals(b2));
		System.out.println(b1.equals(b3));
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		
	}
}
