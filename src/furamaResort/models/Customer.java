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

    public Customer(int id, String name, String dateOfBirth, String gender, double identityCardNumber, double phoneNumber, String email, String customerType, String address) {
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
        return this.getId() + "," + this.getName() + "," + this.getDateOfBirth() + "," + this.getGender() + "," +
                this.getIdentityCardNumber() + "," + this.getPhoneNumber() + "," + this.getEmail() + customerType + "," + address;
//                "Customer{" +
//                super.toString() +
//                "customerType='" + customerType + '\'' +
//                ", address='" + address + '\'' +
//                '}';
    }
}
