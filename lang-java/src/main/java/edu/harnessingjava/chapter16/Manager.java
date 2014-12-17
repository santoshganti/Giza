package edu.harnessingjava.chapter16;

public class Manager extends Employee {
	public static void main(String[] args) {
		Manager mgr = new Manager();
		mgr.setName("Katie Cassidy");
		String mgrname = mgr.getName();
		System.out.println("Manager Name: "+mgrname);
	}
}