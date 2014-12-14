package edu.lab.algorthms.lang_java;

public class WrapperClassDefaultInit {
	static byte b;
	static short s;
	static int i;
	static long l;
	static float f;
	static double d;
	static boolean bool;
	static String str;

	public static void main(String args[]) {

		Byte b1 = new Byte(b);
		System.out.println("Byte Object:" + b1);
		
		Short s1 = new Short(s);
		System.out.println("Short Object:" + s1);
		
		Integer i1 = new Integer(i);
		System.out.println("Integer Object:" + i1);
		
		Long l1 = new Long(l);
		System.out.println("Long Object:" + l1);
		
		Float f1 = new Float(f);
		System.out.println("Float Object:" + f1);
		
		Double d1 = new Double(d);
		System.out.println("Double Object:" + d1);

		Boolean bool1 = new Boolean(bool);
		System.out.println("Boolean Object" + bool1);

	}
}
