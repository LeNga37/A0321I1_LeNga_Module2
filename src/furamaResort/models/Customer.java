package furamaResort.models;

public class Customer extends Person {
    private String customerType;//kieu khach hang
    private String address;

    public Customer() {

    }

    public Customer(String customerType, String address) {
        this.customerType = customerType;
        this.address = address;
    }

    public Customer(String id, String name, String dateOfBirth, String gender, double identityCardNumber, double phoneNumber, String email, String customerType, String address) {
        super(id, name, dateOfBirth, gender, identityCardNumber, phoneNumber, email);
        this.customerType = customerType;
        this.address = address;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                super.toString() +
                "customerType='" + customerType + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
//1. Xây dựng abstract class Facility (cơ sở vật chất) bao gồm các thông tin chung của tất cả dịch vụ cho thuê Villa, House, Room.
//2. Xây dựng các class có tên là Villa, House, Room và định nghĩa thêm các thuộc tính riêng của từng class. Các class này sẽ extend từ abstract class Facility.
//3.Tương tự 2 mục trên xây dựng class Customer, Employee kế thừa từ abstract class Person
//4. Xây dựng class Booking, Contract
//(Các class này được tạo trong package models)