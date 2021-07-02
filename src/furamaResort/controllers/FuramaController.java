package furamaResort.controllers;

import java.util.Scanner;

public class FuramaController {
    public static void displayMainMenu() {
        Scanner input = new Scanner(System.in);
        int choice = 0;
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
    }

    public static void employeeManagement() {
        System.out.println("1.\tDisplay list employees");
        System.out.println("2.\tAdd new employees");
        System.out.println("3.\tEdit employee");
        System.out.println("4.\tReturn main menu");
    }

    public static void customerManagement() {
        System.out.println("1.\tDisplay list customers");
        System.out.println("2.\tAdd new customer");
        System.out.println("3.\tEdit customer");
        System.out.println("4.\tReturn main menu");
    }

    public static void facilityManagement() {
        System.out.println("1.\tDisplay list facility");
        System.out.println("2.\tAdd new facility");
        System.out.println("3.\tDisplay list facility maintenance");
        System.out.println("4.\tReturn main menu");
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
