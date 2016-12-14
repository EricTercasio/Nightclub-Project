package model;

/**
 * Created by Kitcatski on 11/2/2016.
 */
public class Customer extends Person{
    String gender;
    Receipt receipt;



    public Customer(String firstName, String lastName, String username, String password, HomeAddress homeAddress, String phoneNumber, String gender, Receipt receipt) {
        super(firstName, lastName, username, password, homeAddress, phoneNumber);
        this.gender = gender;
        this.receipt = receipt;

    }

    public String getGender() {
        return gender;
    }
    public Receipt getReceipt(){
        return receipt;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "gender='" + gender + '\'' +
                ", interest='" + //interest + '\'' +
                '}';
    }
}
