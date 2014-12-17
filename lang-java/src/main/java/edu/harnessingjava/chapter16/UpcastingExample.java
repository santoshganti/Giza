package edu.harnessingjava.chapter16;

public class UpcastingExample {
	public static void main(String[] args){
		Employee emp = new Employee();
		emp.setName("Ken Wood");
		
		Manager mgr = new Manager();
		mgr.setName("Ken Furr");
		
		EmpUtil.printName(emp);
		EmpUtil.printName(mgr);
	}
}
