package edu.lab.casting;

public class Equals {
	public static void main(String[] args) {
		Dog d1 = new Dog();//d1 = 2342324
		Dog d2 = new Dog();//d2 = 2323214
		d2=d1;//d2=d1=2342324
		System.out.println(d1.equals(d2));
		System.out.println(d1==d2);
	}
}
