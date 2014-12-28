package edu.ocaguide.operators;

public class VarScope {
    public int i1;
    public static int i2;
    public static void main(String[] args) {
    	VarScope v1 = new VarScope();
    	VarScope v2 = new VarScope();
    	v1.i1 = 10; v2.i2 = 5;
    	System.out.format("%d + %d = %d", v1.i1, v1.i2, v1.i1 + v1.i2);
	}
}

