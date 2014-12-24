package edu.ocaguide.operators;

import java.awt.Dimension;

public class ReferenceTest {
	public static void main(String[] args) {
		int a=1;
		Dimension d = new Dimension(5, 10);
		ReferenceTest rt = new ReferenceTest();
	
		//Object modification
		System.out.println("Object Before Modify() d.height " + d.height);
		rt.modify(d);
		System.out.println("Object After Modify() d.height " + d.height);
		
		//Primitive modification
		System.out.println("Primitive Before Modify() a=  "+a);
		rt.modify(a);
		System.out.println("Primitive after Modify() a=  "+a);
		

	}

	void modify(Dimension dim) {
		dim.height = dim.height + 1;
		System.out.println("Dim = " + dim.height);
	}
	
	void modify(int number){
		number = number +1;
		System.out.println("number= "+number);
	}
}
