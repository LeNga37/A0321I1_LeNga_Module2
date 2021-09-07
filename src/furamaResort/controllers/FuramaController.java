package furamaResort.controllers;

import furamaResort.services.Impl.*;

import java.util.Scanner;

public class FuramaController {
    private static Scanner input = new Scanner(System.in);

    public static void displayMainMenu() {
        Scanner input = new Scanner(System.in);
//        do {
        System.out.println("1.\tEmployee Management");
        System.out.println("2.\tCustomer Management");
        System.out.println("3.\tFacility Management");
        System.out.println("4.\tBooking Managerment");
        System.out.println("5.\tPromotion Management");
        System.out.println("6.\tExit");
        System.out.println("Enter your choice: ");
        int choice = 0;
        try{
            choice = Integer.parseInt(input.nextLine());
        }catch (NumberFormatException e){
            System.out.println("Please re-enter the number");
        }

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
        EmployeeServiceImpl employeeServiceImpl = new EmployeeServiceImpl();
        int choice = -1;
        do {
            System.out.println("Please enter choice \n"
                    + "1. Display employee list \n"
                    + "2. Add new employee \n"
                    + "3. Edit employee \n"
                    + "4. Delete employee \n"
                    + "5. Return main menu \n");
            try{
                choice = Integer.parseInt(input.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Please re-enter the number");
            }

            switch (choice) {
                case 1:
                    employeeServiceImpl.display();
                    break;
                case 2:
                    employeeServiceImpl.addNew();
                    break;
                case 3:
//                    employeeServiceImpl.findEmployee();
                    employeeServiceImpl.edit();
                    break;
                case 4:
                    employeeServiceImpl.deleteEmployee();
                    break;
                case 5:
                    displayMainMenu();
                    break;
                default:
                    System.out.println("Please enter 1~4");
            }
        } while (true);
    }

    public static void customerManagement() {
        CustomerServiceImpl customerServiceImpl = new CustomerServiceImpl();
        int choice = -1;
        do {
            System.out.println("Please enter choice \n"
                    + "1. Display customer list \n"
                    + "2. Add new customer \n"
                    + "3. Edit customer \n"
                    + "4. Return main menu \n");
            try{
                choice = Integer.parseInt(input.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Please re-enter the number");
            }
            switch (choice) {
                case 1:
                    customerServiceImpl.display();
                    break;
                case 2:
                    customerServiceImpl.addNew();
                    break;
                case 3:
                    customerServiceImpl.edit();
                    break;
                case 4:
                    displayMainMenu();
                default:
                    System.out.println("Please enter 1~4");
            }
        } while (true);
    }

    public static void facilityManagement() {
        FacilityServiceImpl facilityServiceImpl = new FacilityServiceImpl();
        int choice = -1;
        do {
            System.out.println("Please enter choice \n"
                    + "1. Display facility list \n"
                    + "2. Add new facility \n"
                    + "3. Display facility list maintenance \n"
                    + "4. Return main menu \n");
            try{
                choice = Integer.parseInt(input.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Please re-enter the number");
            }
            switch (choice) {
                case 1:
                    facilityServiceImpl.display();
                    break;
                case 2:
                    facilityServiceImpl.addNew();
                    break;
                case 3:
                    facilityServiceImpl.displayFacilityListMaintenance();
                    break;
                case 4:
                    displayMainMenu();
                default:
                    System.out.println("Please enter 1~4");
            }
        } while (true);
    }

    public static void bookingManagement() {
        BookingServiceImpl bookingServiceImpl = new BookingServiceImpl();
        ContactServiceImpl contactServiceImpl =new ContactServiceImpl();
        int choice = -1;
        do {
            System.out.println("Please enter choice \n"
                    + "1. Add new booking \n"
                    + "2. Display list booking \n"
                    + "3. Create new contracts \n"
                    + "4. Display list contracts \n"
                    + "5. Edit contracts \n"
                    + "6. Return main menu \n");
            try{
                choice = Integer.parseInt(input.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Please re-enter the number");
            }
            switch (choice) {
                case 1:
                    bookingServiceImpl.addNew();
                    break;
                case 2:
                    bookingServiceImpl.display();
                    break;
                case 3:
                    contactServiceImpl.addNew();
                    break;
                case 4:
                    contactServiceImpl.display();
                    break;
                case 5:
                    contactServiceImpl.edit();
                    break;
                case 6:
                    displayMainMenu();
                default:
                    System.out.println("Please enter 1~6");
            }
        } while (true);
    }

    public static void promotionManagement() {
        System.out.println("1.\tDisplay list customers use service");
        System.out.println("2.\tDisplay list customers get voucher");
        System.out.println("3.\tReturn main menu");
    }
}
