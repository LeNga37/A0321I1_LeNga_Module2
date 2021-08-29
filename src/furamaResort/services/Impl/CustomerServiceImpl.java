package furamaResort.services.Impl;

import furamaResort.controllers.FuramaController;
import furamaResort.models.Customer;
import furamaResort.services.CustomerService;
import furamaResort.utils.ReadWriteFile;
import furamaResort.utils.RegexData;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    private static List<Customer> customerList = new LinkedList<>();
    private static Scanner input = new Scanner(System.in);
    private static final String BIRTHDAY_REGEX = "(^(((0[1-9]|1[0-9]|2[0-8])[/](0[1-9]|1[012]))|((29|30|31)[/]" +
            "(0[13578]|1[02]))|((29|30)[/](0[4,6,9]|11)))[/](19\\d\\d|200[0-1])$)|(^29[/]02[/]((19)" +
            "(04|08|12|16|20|24|28|32|36|40|44|48|52|56|60|64|68|72|76|80|84|88|92|96)|2000)$)";

    @Override
    public void display() {
//        customerList= (List<Customer>) ReadWriteFile.readFile("D:\\A0321I1_LeNga_Module2\\src\\data\\customer.csv");
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
    }

    @Override
    public void addNew() {
//        int id;
//        do {
//            System.out.println("Please enter id: ");
//            id = input.nextInt();
//        } while (findById(id) != null);
//        input.skip("\\R");
        System.out.println("Please enter id: ");
        String id = input.nextLine();

        System.out.println("Please enter name");
        String name = input.nextLine();

        System.out.println("Please enter dateOfBirth");
        String dateOfBirth= RegexData.regexAge(input.nextLine(),BIRTHDAY_REGEX);
//        String dateOfBirth = input.nextLine();

        System.out.println("Please enter gender");
        String gender = input.nextLine();

        System.out.println("Please enter identityCardNumber");
        String identityCardNumber = input.nextLine();

        System.out.println("Please enter phoneNumber");
        String phoneNumber = input.nextLine();

        System.out.println("Please enter email");
        String email = input.nextLine();

        System.out.println("Please enter customerType: Diamond, Platinium, Gold, Silver, Member");
        String customerType = input.nextLine();

        System.out.println("Please enter address");
        String address = input.nextLine();

        customerList.add(new Customer(id, name, dateOfBirth, gender, identityCardNumber, phoneNumber, email, customerType, address));
        ReadWriteFile.writeFile(customerList,"D:\\A0321I1_LeNga_Module2\\src\\data\\customer.csv");
    }

    public static Customer findById(String id) {
        for (Customer customer : customerList) {
            if (customer.getId() == id) {
                return customer;
            }
        }
        return null;
    }

    @Override
    public void edit() {
        System.out.println("Please enter id:");
        String id = input.nextLine();
        Customer customer = findById(id);
        if (customer != null) {
            int choice = -1;
            do {
                System.out.println("Please enter information update: \n"
                        + "1. Name employee \n"
                        + "2. DateOfBirth employee \n"
                        + "3. Gender employee \n"
                        + "4. IdentityCardNumber employee \n"
                        + "5. PhoneNumber employee \n"
                        + "6. Email employee \n"
                        + "7. Lever employee \n"
                        + "8. Position employee \n"
                        + "9. Back to menu \n");
                try {
                    choice = Integer.parseInt(input.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Please re-enter the number");
                }
                switch (choice) {
                    case 1:
                        System.out.println("Please enter name");
                        String newName = input.nextLine();
                        customer.setName(newName);
                        System.out.println("Edit successful!");
                        ReadWriteFile.writeFile(customerList,"D:\\A0321I1_LeNga_Module2\\src\\data\\customer.csv");
                        break;
                    case 2:
                        System.out.println("Please enter dateOfBirth");
                        String newDateOfBirth= RegexData.regexAge(input.nextLine(),BIRTHDAY_REGEX);
//                        String newDateOfBirth = input.nextLine();
                        customer.setDateOfBirth(newDateOfBirth);
                        System.out.println("Edit successful!");
                        ReadWriteFile.writeFile(customerList,"D:\\A0321I1_LeNga_Module2\\src\\data\\customer.csv");
                        break;
                    case 3:
                        System.out.println("Please enter gender");
                        String newGender = input.nextLine();
                        customer.setGender(newGender);
                        System.out.println("Edit successful!");
                        ReadWriteFile.writeFile(customerList,"D:\\A0321I1_LeNga_Module2\\src\\data\\customer.csv");
                        break;
                    case 4:
                        System.out.println("Please enter identityCardNumber");
                        String newIdentityCardNumber = input.nextLine();
                        customer.setIdentityCardNumber(newIdentityCardNumber);
                        System.out.println("Edit successful!");
                        ReadWriteFile.writeFile(customerList,"D:\\A0321I1_LeNga_Module2\\src\\data\\customer.csv");
                        break;
                    case 5:
                        System.out.println("Please enter phoneNumber");
                        String newPhoneNumber = input.nextLine();
                        customer.setPhoneNumber(newPhoneNumber);
                        System.out.println("Edit successful!");
                        ReadWriteFile.writeFile(customerList,"D:\\A0321I1_LeNga_Module2\\src\\data\\customer.csv");
                        break;
                    case 6:
                        System.out.println("Please enter email");
                        String newEmail = input.nextLine();
                        customer.setEmail(newEmail);
                        System.out.println("Edit successful!");
                        ReadWriteFile.writeFile(customerList,"D:\\A0321I1_LeNga_Module2\\src\\data\\customer.csv");
                        break;
                    case 7:
                        System.out.println("Please enter customerType");
                        String newCustomerType = input.nextLine();
                        customer.setCustomerType(newCustomerType);
                        System.out.println("Edit successful!");
                        ReadWriteFile.writeFile(customerList,"D:\\A0321I1_LeNga_Module2\\src\\data\\customer.csv");
                        break;
                    case 8:
                        System.out.println("Please enter address");
                        String newAddress = input.nextLine();
                        customer.setAddress(newAddress);
                        System.out.println("Edit successful!");
                        ReadWriteFile.writeFile(customerList,"D:\\A0321I1_LeNga_Module2\\src\\data\\customer.csv");
                        break;
                    case 9:
                        FuramaController.displayMainMenu();
                        break;
                    default:
                        System.out.println("Please input 1 ~ 9");
                        break;
                }
            } while (choice < 1 || choice > 9);
        } else {
            System.out.println("Id is not found");
            edit();
        }
    }
}

