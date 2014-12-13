package edu.lab.algorthms.lang_java;

public class DefaultInit {
	byte b;
	short s;
	int i;
	long l;
	float f;
	double d;
	boolean bool;
	String str;
	
	public static void main (String args[]){
		/*
		 * Create an object of DefaultInit class
		 */
		DefaultInit obj = new DefaultInit();
		/*
		 * Print the default values for all instance variables
		 */
	System.out.println("Byte is initialized to:"+obj.b);
	System.out.println("Short is initialized to:"+obj.s);
	System.out.println("int is initialized to:"+obj.i);
	System.out.println("long is initialized to:"+obj.l);
	System.out.println("float is initialized to:"+obj.f);
	System.out.println("double is initialized to:"+obj.d);
	System.out.println("Boolean is initialized to:"+obj.bool);
	System.out.println("String is initialized to:"+obj.str);
	}
}
