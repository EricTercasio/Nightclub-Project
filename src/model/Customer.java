package model;

/**
 * Created by Kitcatski on 11/2/2016.
 */
public class Customer extends Person{
    String gender;
    String interest;
    public Customer(String firstName, String lastName, String username, String password, int idNumber, HomeAddress homeAddress, String phoneNumber, String gender, String interest) {
        super(firstName, lastName, username, password, idNumber, homeAddress, phoneNumber);
        this.gender = gender;
        this.interest = interest;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "gender='" + gender + '\'' +
                ", interest='" + interest + '\'' +
                '}';
    }
}
