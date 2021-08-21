package furamaResort.controllers;

import furamaResort.services.CustomerServiceImpl;
import furamaResort.services.EmployeeServiceImpl;
import furamaResort.services.FacilityServiceImpl;

import java.util.Scanner;

public class FuramaController {
    private static Scanner input = new Scanner(System.in);
    private static EmployeeServiceImpl employeeServiceImpl = new EmployeeServiceImpl();
    private static CustomerServiceImpl customerServiceImpl = new CustomerServiceImpl();
    private static FacilityServiceImpl facilityServiceImpl = new FacilityServiceImpl();

    public static void displayMainMenu() {
        Scanner input = new Scanner(System.in);
        int choice = 0;
//        do {
        System.out.println("1.\tEmployee Management");
        System.out.println("2.\tCustomer Management");
        System.out.println("3.\tFacility Management");
        System.out.println("4.\tBooking Managerment");
        System.out.println("5.\tPromotion Management");
        System.out.println("6.\tExit");
        System.out.println("Enter your choice: ");
        choice = input.nextInt();

        switch (choice) {
            case 1:
                employeeManagement();
                break;
            case 2:
                customerManagement();
                break;
            case 3:
                facilityManagement();
                break;
            case 4:
                bookingManagement();
                break;
            case 5:
                promotionManagement();
                break;
            case 6:
                System.exit(0);
            default:
                System.out.println("Please choice 1~6. Reselect!");
                displayMainMenu();
        }
//        } while (true);
    }

    public static void employeeManagement() {
//        System.out.println("1.\tDisplay list employees");
//        System.out.println("2.\tAdd new employees");
//        System.out.println("3.\tEdit employee");
//        System.out.println("4.\tReturn main menu");
        int choice = -1;
        do {
            System.out.println("Please enter choice \n"
                    + "1. Display employee list \n"
                    + "2. Add new employee \n"
                    + "3. Edit employee \n"
                    + "4. Return main menu \n");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    employeeServiceImpl.displayEmployeeList();
                    break;
                case 2:
                    employeeServiceImpl.addEmployee();
                    break;
                case 3:
                    employeeServiceImpl.editEmployee();
                    break;
                case 4:
                    displayMainMenu();
            }
        } while (true);
    }

    public static void customerManagement() {
//        System.out.println("1.\tDisplay list customers");
//        System.out.println("2.\tAdd new customer");
//        System.out.println("3.\tEdit customer");
//        System.out.println("4.\tReturn main menu");
        int choice = -1;
        do {
            System.out.println("Please enter choice \n"
                    + "1. Display customer list \n"
                    + "2. Add new customer \n"
                    + "3. Edit customer \n"
                    + "4. Return main menu \n");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    customerServiceImpl.displayCustomerList();
                    break;
                case 2:
                    customerServiceImpl.addCustomer();
                    break;
                case 3:
                    customerServiceImpl.editCustomer();
                    break;
                case 4:
                    displayMainMenu();
            }
        } while (true);
    }

    public static void facilityManagement() {
//        System.out.println("1.\tDisplay list facility");
//        System.out.println("2.\tAdd new facility");
//        System.out.println("3.\tDisplay list facility maintenance");
//        System.out.println("4.\tReturn main menu");
        int choice = -1;
        do {
            System.out.println("Please enter choice \n"
                    + "1. Display facility list \n"
                    + "2. Add new facility \n"
                    + "3. Display facility list maintenance \n"
                    + "4. Return main menu \n");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    facilityServiceImpl.displayFacilityList();
                    break;
                case 2:
                    facilityServiceImpl.addFacility();
                    break;
                case 3:
                    facilityServiceImpl.displayFacilityListMaintenance();
                    break;
                case 4:
                    displayMainMenu();
            }
        } while (true);
    }

    public static void bookingManagement() {
        System.out.println("1.\tAdd new booking");
        System.out.println("2.\tDisplay list booking");
        System.out.println("3.\tCreate new contracts");
        System.out.println("4.\tDisplay list contracts");
        System.out.println("5.\tEdit contracts");
        System.out.println("6.\tReturn main menu");
    }

    public static void promotionManagement() {
        System.out.println("1.\tDisplay list customers use service");
        System.out.println("2.\tDisplay list customers get voucher");
        System.out.println("3.\tReturn main menu");
    }
}
