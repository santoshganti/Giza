package edu.lab.algorthms.lang_java;

public class AccessLevelSample {
	private int v1 = 100; // private access
	int v2 = 200;// package level access or package private or default
	protected int v3 = 300;// protected access
	public int v4 = 400;// public access
	public static int count = 1;// public access

	// m1() has private level access
	public int getV1(){
		return this.v1;
	}
	
	public int getV2(){
		return this.v1=v1;
	}
	private void m1() {
		System.out.println("Inside m1() ");
		System.out.println("V1= " + v1 + " V2= " + v2 + " V3= " + v3 + " V4="
				+ v4);
	}

	// m2() has package level access
	void m2() {
		System.out.println("Inside m2() ");
		System.out.println("V1= " + v1 + " V2= " + v2 + " V3= " + v3 + " V4="
				+ v4);
	}

	// m3() has protected level access
	protected void m3() {
		System.out.println("Inside m3() ");
		System.out.println("V1= " + v1 + " V2= " + v2 + " V3= " + v3 + " V4="
				+ v4);
	}

	// m4 has public level access
	public void m4() {
		System.out.println("Inside m4() ");
		System.out.println("V1= " + v1 + " V2= " + v2 + " V3= " + v3 + " V4="
				+ v4);
	}

	// private static void doSomething(){
	//
	// }
//	public static void main(String args[]) {
//		AccessLevelSample num = new AccessLevelSample();
//		num.m1();
//		num.m2();
//		num.m3();
//		num.m4();
//	}
}
