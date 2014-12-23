package edu.lab.algorthms.lang_java;

public class AccessorAndMutator {
	private String firstName;
	private String middleName;
	private String lastName;
	private String address;
	private String username;

	public AccessorAndMutator(String firstName, String middleName,
			String lastName, String address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.address = address;
		this.username = " ";
	}

	public String getFirstName() {
		return firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public static void main(String[] args) {
		AccessorAndMutator a = new AccessorAndMutator("Sai", "Santosh",
				"Kumar", "India");
		a.setFirstName("Bon");
		a.setLastName("Jovi");
		System.out.println(a.getFirstName());
	}
}
