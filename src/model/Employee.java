package model;

import java.io.Serializable;

/**
 * Created by Kitcatski on 11/2/2016.
 */
public class Employee extends Person implements Serializable{
    private String position;
    private String salary;
    private Schedule schedule;

    public Employee(String firstName, String lastName, String username, String password, int idNumber, HomeAddress homeAddress, String phoneNumber,String position, String salary, Schedule schedule) {
        super(firstName,lastName,username,password,idNumber,homeAddress,phoneNumber);
        this.position = position;
        this.salary = salary;
        this.schedule = schedule;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "position='" + position + '\'' +
                ", salary='" + salary + '\'' +
                ", schedule=" + schedule +
                '}';
    }
}
