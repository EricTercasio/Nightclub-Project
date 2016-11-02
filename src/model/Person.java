package model;

import java.io.Serializable;

public abstract class Person implements Serializable{
	private String firstName;
	private String lastName;
	private String username;
	private String password;
	private int idNumber;
	private HomeAddress homeAddress;
	private String phoneNumber;

	public Person(String firstName, String lastName,String username, String password, int idNumber, HomeAddress homeAddress, String phoneNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
		this.idNumber = idNumber;
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

	public int getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}

	public String getUsername(){return username;}

	public void setUsername(String username){this.username = username;}

	public String getPassword(){return password;}

	public void setPassword(String password){this.password = password;}

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
