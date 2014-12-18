package edu.ocaguide.constructors;
/*
 * init blocks execute in the order which they appear
 * Static init block run only once, when the class is first loaded
 * Instance init blocks run everytime instance is created
 * instance init block run after the constructor's call to super();
 */


public class InitializationBlocks {
	InitializationBlocks(int x) {
		System.out.println("1-arg constructor");

	}
	InitializationBlocks(){
		System.out.println("no-arg constructor");
	}
	
	static{
		System.out.println("First static initialization");
	}

	{
		System.out.println("First instance initialization");
	}
	
	{
		System.out.println("First instance initialization");
	}

	static{
		System.out.println("Second static initialization");
	}
	
	public static void main(String[] args){
		new InitializationBlocks();
		new InitializationBlocks(7);
	}
}
