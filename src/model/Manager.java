package model;

import java.io.Serializable;

/**
 * Created by Kitcatski on 11/2/2016.
 */
public class Manager extends Employee implements Serializable {

    public Manager(String firstName, String lastName, String username, String password, HomeAddress homeAddress, String phoneNumber, String position, String salary, Schedule schedule) {
        super(firstName, lastName, username, password, homeAddress, phoneNumber, "Manager", salary, schedule);

    }

}
