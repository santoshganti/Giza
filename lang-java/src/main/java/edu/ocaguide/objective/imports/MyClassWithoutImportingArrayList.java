package edu.ocaguide.objective.imports;

//Class without importing arraylist from java.util.
public class MyClassWithoutImportingArrayList {
	public static void main(String args[]) {
		java.util.ArrayList<String> a = new java.util.ArrayList<String>();
	}
}
