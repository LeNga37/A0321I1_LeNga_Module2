package furamaResort.models;

public class Employee extends Person {
    private String lever;
    private String position;
    private float salary;

    public Employee() {

    }

    public Employee(String lever, String position, float salary) {
        this.lever = lever;
        this.position = position;
        this.salary = salary;
    }

    public Employee(String id, String name, String dateOfBirth, String gender, double identityCardNumber, double phoneNumber, String email, String lever, String position, float salary) {
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                super.toString() +
                "lever='" + lever + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
