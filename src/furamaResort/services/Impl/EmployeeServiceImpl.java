package furamaResort.services;

import furamaResort.controllers.FuramaController;
import furamaResort.models.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    private static List<Employee> employeeList = new ArrayList();
    private static Scanner input = new Scanner(System.in);

    public static void displayEmployeeList() {
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    public static void addEmployee() {
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
        System.out.println("Please enter lever");
        String lever = input.nextLine();
        System.out.println("Please enter position");
        String position = input.nextLine();
        System.out.println("Please enter salary");
        Float salary = input.nextFloat();
        employeeList.add(new Employee(id, name, dateOfBirth, gender, identityCardNumber, phoneNumber, email, lever, position, salary));
    }

    public static Employee findById(int id) {
        for (Employee employee : employeeList) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }

    public static void editEmployee() {
        System.out.println("Please enter id: ");
        int id = input.nextInt();
        Employee employee = findById(id);
        int choice;
        if (employee != null) {
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
                        + "9. Salary employee \n"
                        + "10. Back to menu \n");
                choice = input.nextInt();
                input.skip("\\R");
                switch (choice) {
                    case 1:
                        System.out.println("Please enter name");
                        String newName = input.nextLine();
                        employee.setName(newName);
                        break;
                    case 2:
                        System.out.println("Please enter dateOfBirth");
                        String newDateOfBirth = input.nextLine();
                        employee.setDateOfBirth(newDateOfBirth);
                        break;
                    case 3:
                        System.out.println("Please enter gender");
                        String newGender = input.nextLine();
                        employee.setGender(newGender);
                        break;
                    case 4:
                        System.out.println("Please enter identityCardNumber");
                        double newIdentityCardNumber = input.nextDouble();
                        employee.setIdentityCardNumber(newIdentityCardNumber);
                        break;
                    case 5:
                        System.out.println("Please enter phoneNumber");
                        double newPhoneNumber = input.nextDouble();
                        employee.setPhoneNumber(newPhoneNumber);
                        break;
                    case 6:
                        System.out.println("Please enter email");
                        String newEmail = input.nextLine();
                        employee.setEmail(newEmail);
                        break;
                    case 7:
                        System.out.println("Please enter lever");
                        String newLever = input.nextLine();
                        employee.setLever(newLever);
                        break;
                    case 8:
                        System.out.println("Please enter position");
                        String newPosition = input.nextLine();
                        employee.setDateOfBirth(newPosition);
                        break;
                    case 9:
                        System.out.println("Please enter salary");
                        float newSalary = input.nextFloat();
                        employee.setSalary(newSalary);
                        break;
                    case 10:
                        FuramaController.displayMainMenu();
                        break;
                    default:
                        System.out.println("Please enter 1 ~ 10");
                        editEmployee();
                }
            } while (choice < 1 || choice > 9);
        } else {
            System.out.println("Id is not found");
            editEmployee();
        }
    }

//    public static void deleteEmployee(){
//        System.out.println("Please enter id employee");
//        int id=input.nextInt();
//        Employee employee=findById(id);
//        if(employee!=null){
//            employeeList.remove(findById(id));
//        }else {
//            System.out.println("Id is not found");
//            updateEmployee();
//        }
//
//    }
}
