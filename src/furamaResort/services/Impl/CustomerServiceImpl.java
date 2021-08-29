package furamaResort.services;

import furamaResort.models.Customer;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    private static List<Customer> customerList = new LinkedList<>();
    private static Scanner input = new Scanner(System.in);

    public static void displayCustomerList() {
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
    }

    public static void addCustomer() {
        int id;
        do {
            System.out.println("Please enter id: ");
            id = input.nextInt();
        } while (findById(id) != null);
        input.skip("\\R");
        System.out.println("Please enter name");
        String name = input.nextLine();
        System.out.println("Please enter dateOfBirth");
        String dateOfBirth = input.nextLine();
        System.out.println("Please enter gender");
        String gender = input.nextLine();
        System.out.println("Please enter identityCardNumber");
        Double identityCardNumber = input.nextDouble();
        System.out.println("Please enter phoneNumber");
        Double phoneNumber = input.nextDouble();
        System.out.println("Please enter email");
        input.skip("\\R");
        String email = input.nextLine();
        System.out.println("Please enter customerType: Diamond, Platinium, Gold, Silver, Member");
        String customerType = input.nextLine();
        System.out.println("Please enter address");
        String address = input.nextLine();
        customerList.add(new Customer(id, name, dateOfBirth, gender, identityCardNumber, phoneNumber, email, customerType, address));
    }

    public static Customer findById(int id) {
        for (Customer customer : customerList) {
            if (customer.getId() == id) {
                return customer;
            }
        }
        return null;
    }

    public static void editCustomer() {
        System.out.println("Please enter id:");
        int id = input.nextInt();
        Customer customer = findById(id);
        if (customer != null) {
            int choice;
            do {
                System.out.println("Please enter information update: \n"
                        + "1. Name employee \n"
                        + "2. DateOfBirth employee \n"
                        + "3. Gender employee \n"
                        + "4. IdentityCardNumber employee \n"
                        + "5. PhoneNumber employee \n"
                        + "6. Email employee \n"
                        + "7. Lever employee \n"
                        + "8. Position employee \n");
//                        + "9. Back to menu \n");
                choice = input.nextInt();
                input.skip("\\R");
                switch (choice) {
                    case 1:
                        System.out.println("Please enter name");
                        String newName = input.nextLine();
                        customer.setName(newName);
                        break;
                    case 2:
                        System.out.println("Please enter dateOfBirth");
                        String newDateOfBirth = input.nextLine();
                        customer.setDateOfBirth(newDateOfBirth);
                        break;
                    case 3:
                        System.out.println("Please enter gender");
                        String newGender = input.nextLine();
                        customer.setGender(newGender);
                        break;
                    case 4:
                        System.out.println("Please enter identityCardNumber");
                        double newIdentityCardNumber = input.nextDouble();
                        customer.setIdentityCardNumber(newIdentityCardNumber);
                        break;
                    case 5:
                        System.out.println("Please enter phoneNumber");
                        double newPhoneNumber = input.nextDouble();
                        input.skip("\\R");
                        customer.setPhoneNumber(newPhoneNumber);
                        break;
                    case 6:
                        System.out.println("Please enter email");
                        String newEmail = input.nextLine();
                        customer.setEmail(newEmail);
                        break;
                    case 7:
                        System.out.println("Please enter customerType");
                        String newCustomerType = input.nextLine();
                        customer.setCustomerType(newCustomerType);
                        break;
                    case 8:
                        System.out.println("Please enter address");
                        String newAddress = input.nextLine();
                        customer.setAddress(newAddress);
                        break;
                    default:
                        System.out.println("Please input 1 ~ 9");
                        break;
                }
            } while (choice < 1 || choice > 9);
//            switch (choice) {
//                case 1:
//                    System.out.println("Please enter name");
//                    String newName = input.nextLine();
//                    customer.setName(newName);
//                    break;
//                case 2:
//                    System.out.println("Please enter dateOfBirth");
//                    String newDateOfBirth = input.nextLine();
//                    customer.setDateOfBirth(newDateOfBirth);
//                    break;
//                case 3:
//                    System.out.println("Please enter gender");
//                    String newGender = input.nextLine();
//                    customer.setGender(newGender);
//                    break;
//                case 4:
//                    System.out.println("Please enter identityCardNumber");
//                    double newIdentityCardNumber = input.nextDouble();
//                    customer.setIdentityCardNumber(newIdentityCardNumber);
//                    break;
//                case 5:
//                    System.out.println("Please enter phoneNumber");
//                    double newPhoneNumber = input.nextDouble();
//                    input.skip("\\R");
//                    customer.setPhoneNumber(newPhoneNumber);
//                    break;
//                case 6:
//                    System.out.println("Please enter email");
//                    String newEmail = input.nextLine();
//                    customer.setEmail(newEmail);
//                    break;
//                case 7:
//                    System.out.println("Please enter customerType");
//                    String newCustomerType = input.nextLine();
//                    customer.setCustomerType(newCustomerType);
//                    break;
//                case 8:
//                    System.out.println("Please enter address");
//                    String newAddress = input.nextLine();
//                    customer.setAddress(newAddress);
//                    break;
//                default:
//                    System.out.println("Please input 1 ~ 9");
//                    break;
//            }
        } else {
            System.out.println("Id is not found");
            editCustomer();
        }
    }
}

