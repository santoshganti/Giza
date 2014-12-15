package edu.lab.algorthms.lang_java;

public class ThisKeyword {
	int num=1982;
	void printNum(int num){
		System.out.println("Parameter num "+num);
		System.out.println("Instance Variable "+this.num);
	}
	public static void main(String args[]){
		ThisKeyword tt1 = new ThisKeyword();
		tt1.printNum(1969);
	}
}
