package edu.harnessingjava.chapter16;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setName("John Jacobs");
		String empName = emp.getName();
		System.out.println("Employee Name: " + empName);
		
		int hc = emp.hashCode();
		String str = emp.toString();
		
		System.out.println(hc);
		System.out.println(str);
	}
}
