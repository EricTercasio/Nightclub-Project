package model;

import java.io.Serializable;

public abstract class Person implements Serializable {
	private String firstName;
	private String lastName;
	private String username;
	private String password;
	private final String idNumber;
	private HomeAddress homeAddress;
	private String phoneNumber;
	private static int idInt = 0;


	public Person(String firstName, String lastName, String username, String password, HomeAddress homeAddress, String phoneNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
		idNumber = String.valueOf(idInt++);
		this.homeAddress = homeAddress;
		this.phoneNumber = phoneNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public HomeAddress getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(HomeAddress homeAddress) {
		this.homeAddress = homeAddress;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public static int getIdInt() {
		return idInt;
	}

	public static void setIdInt(int idInt) {
		Person.idInt = idInt;
	}


	@Override
	public String toString() {
		return "Person{" +
				"firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", username='" + username + '\'' +
				", password='" + password + '\'' +
				", idNumber='" + idNumber + '\'' +
				", homeAddress=" + homeAddress +
				", phoneNumber='" + phoneNumber + '\'' +
				'}';
	}
}
