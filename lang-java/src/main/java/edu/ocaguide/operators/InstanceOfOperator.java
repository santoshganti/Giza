package edu.ocaguide.operators;

class A{}
public class InstanceOfOperator extends A {
public static void main(String[] args){
A myA = new InstanceOfOperator();
	m2(myA);
}

public static void m2(A a){
	if(a instanceof InstanceOfOperator)
		InstanceOfOperator.doBstuff();
}

public static void doBstuff(){
	System.out.println("'a' referes to a B ");
}
}