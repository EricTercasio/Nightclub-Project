package model;

/**
 * Created by Kitcatski on 11/2/2016.
 */
public class Owner extends Employee{
    public Owner(String firstName, String lastName, String username, String password, HomeAddress homeAddress, String phoneNumber, String position, String salary, Schedule schedule) {
        super(firstName, lastName, username, password, homeAddress, phoneNumber, "Owner", salary, schedule);
    }
}
