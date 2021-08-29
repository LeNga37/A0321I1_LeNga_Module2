package furamaResort.models;

import java.io.Serializable;

public class Employee extends Person{
    private String lever;
    private String position;//vi tri
    private String salary;

    public Employee() {

    }

    public Employee(String lever, String position, String salary) {
        this.lever = lever;
        this.position = position;
        this.salary = salary;
    }

    public Employee(String id, String name, String dateOfBirth, String gender, String identityCardNumber, String phoneNumber, String email, String lever, String position, String salary) {
        super(id, name, dateOfBirth, gender, identityCardNumber, phoneNumber, email);
        this.lever = lever;
        this.position = position;
        this.salary = salary;
    }

    public String getLever() {
        return lever;
    }

    public void setLever(String lever) {
        this.lever = lever;
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

    @Override
    public String toString() {
        return
                this.getId() + "," + this.getName() + "," + this.getDateOfBirth() + "," + this.getGender() + "," +
                this.getIdentityCardNumber() + "," + this.getPhoneNumber() + "," + this.getEmail() + lever + "," +
                position + "," + salary;
//                super.toString() +
//                "lever='" + lever + '\'' +
//                ", position='" + position + '\'' +
//                ", salary=" + salary +
//                '}';
    }

}
