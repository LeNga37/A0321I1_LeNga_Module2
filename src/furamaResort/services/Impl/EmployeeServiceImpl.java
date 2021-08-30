package furamaResort.services.Impl;

import furamaResort.controllers.FuramaController;
import furamaResort.models.Employee;
import furamaResort.services.EmployeeService;
import furamaResort.utils.ReadWriteFile;
import furamaResort.utils.RegexData;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    static List<Employee> employeeList = new ArrayList<>();
    private static Scanner input = new Scanner(System.in);
    private static final String BIRTHDAY_REGEX = "(^(((0[1-9]|1[0-9]|2[0-8])[/](0[1-9]|1[012]))|((29|30|31)[/]" +
            "(0[13578]|1[02]))|((29|30)[/](0[4,6,9]|11)))[/](19\\d\\d|200[0-1])$)|(^29[/]02[/]((19)" +
            "(04|08|12|16|20|24|28|32|36|40|44|48|52|56|60|64|68|72|76|80|84|88|92|96)|2000)$)";

    @Override
    public void display() {
//        List<String[]> listString1 = ReadWriteFile.readFile("D:\\A0321I1_LeNga_Module2\\src\\data\\employee.csv");
//        if(listString1.isEmpty()){
//            System.out.println("EmployeeList trống, hãy thêm employee vào list");
//        }else {
//            for(String[] list:listString1){
////                System.out.println(list);
//                Employee employee=new Employee(list[0],list[1],list[2],list[3],list[4],list[5],list[6],list[7],list[8],list[9]);
//                employeeList.add(employee);
//            }
//        }

        employeeList = (List<Employee>) ReadWriteFile.readFile("D:\\A0321I1_LeNga_Module2\\src\\data\\employee.csv");
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    @Override
    public void addNew() {
        String id;
        boolean check=true;
        do {
            System.out.println("Please enter id: ");
            id = input.nextLine();
            if(findById(id) == null){
                check=false;
            }else {
                System.out.println("Id bạn nhâp đã tồn tại");
            }
        } while (check);
//        System.out.println("Please enter id: ");
//        String id = input.nextLine();

        System.out.println("Please enter name: ");
        String name = input.nextLine();

        System.out.println("Please enter dateOfBirth: ");
        String dateOfBirth = RegexData.regexAge(input.nextLine(), BIRTHDAY_REGEX);
//        String dateOfBirth = input.nextLine();

        System.out.println("Please enter gender: ");
        String gender = input.nextLine();

        System.out.println("Please enter identityCardNumber:");
        String identityCardNumber = input.nextLine();

        System.out.println("Please enter phoneNumber: ");
        String phoneNumber = input.nextLine();

        System.out.println("Please enter email: ");
        String email = input.nextLine();

        System.out.println("Please enter lever: ");
        String lever = input.nextLine();

        System.out.println("Please enter position: ");
        String position = input.nextLine();

        System.out.println("Please enter salary: ");
        String salary = input.nextLine();

//        File file=new File("D:\\A0321I1_LeNga_Module2\\src\\data\\employee.csv")
        employeeList.add(new Employee(id, name, dateOfBirth, gender, identityCardNumber, phoneNumber, email, lever, position, salary));
        ReadWriteFile.writeFile(employeeList, "D:\\A0321I1_LeNga_Module2\\src\\data\\employee.csv");
    }


    public static Employee findById(String id) {
        for (Employee employee : employeeList) {
            if (employee.getId().equals(id)) {//employee.getId() == id
                return employee;
            }
        }
        return null;
    }

    @Override
    public void edit() {
        System.out.println("Please enter id: ");
        String id = input.nextLine();
        Employee employee = findById(id);
        int choice = -1;
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
                try {
                    choice = Integer.parseInt(input.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Please re-enter the number");
                }
                switch (choice) {
                    case 1:
                        System.out.println("Please enter new name");
                        String newName = input.nextLine();
                        employee.setName(newName);
                        System.out.println("Edit successful!");
                        ReadWriteFile.writeFile(employeeList, "D:\\A0321I1_LeNga_Module2\\src\\data\\employee.csv");
                        break;
                    case 2:
                        System.out.println("Please enter new dateOfBirth");
                        String newDateOfBirth = RegexData.regexAge(input.nextLine(), BIRTHDAY_REGEX);
//                        String newDateOfBirth = input.nextLine();
                        employee.setDateOfBirth(newDateOfBirth);
                        System.out.println("Edit successful!");
                        ReadWriteFile.writeFile(employeeList, "D:\\A0321I1_LeNga_Module2\\src\\data\\employee.csv");
                        break;
                    case 3:
                        System.out.println("Please enter gender");
                        String newGender = input.nextLine();
                        employee.setGender(newGender);
                        System.out.println("Edit successful!");
                        ReadWriteFile.writeFile(employeeList, "D:\\A0321I1_LeNga_Module2\\src\\data\\employee.csv");
                        break;
                    case 4:
                        System.out.println("Please enter new identityCardNumber");
                        String newIdentityCardNumber = input.nextLine();
                        employee.setIdentityCardNumber(newIdentityCardNumber);
                        System.out.println("Edit successful!");
                        ReadWriteFile.writeFile(employeeList, "D:\\A0321I1_LeNga_Module2\\src\\data\\employee.csv");
                        break;
                    case 5:
                        System.out.println("Please enter new phoneNumber");
                        String newPhoneNumber = input.nextLine();
                        employee.setPhoneNumber(newPhoneNumber);
                        System.out.println("Edit successful!");
                        ReadWriteFile.writeFile(employeeList, "D:\\A0321I1_LeNga_Module2\\src\\data\\employee.csv");
                        break;
                    case 6:
                        System.out.println("Please enter new email");
                        String newEmail = input.nextLine();
                        employee.setEmail(newEmail);
                        System.out.println("Edit successful!");
                        ReadWriteFile.writeFile(employeeList, "D:\\A0321I1_LeNga_Module2\\src\\data\\employee.csv");
                        break;
                    case 7:
                        System.out.println("Please enter new lever");
                        String newLever = input.nextLine();
                        employee.setLever(newLever);
                        System.out.println("Edit successful!");
                        ReadWriteFile.writeFile(employeeList, "D:\\A0321I1_LeNga_Module2\\src\\data\\employee.csv");
                        break;
                    case 8:
                        System.out.println("Please enter new position");
                        String newPosition = input.nextLine();
                        employee.setDateOfBirth(newPosition);
                        System.out.println("Edit successful!");
                        ReadWriteFile.writeFile(employeeList, "D:\\A0321I1_LeNga_Module2\\src\\data\\employee.csv");
                        break;
                    case 9:
                        System.out.println("Please enter new salary");
                        String newSalary = input.nextLine();
                        employee.setSalary(newSalary);
                        System.out.println("Edit successful!");
                        ReadWriteFile.writeFile(employeeList, "D:\\A0321I1_LeNga_Module2\\src\\data\\employee.csv");
                        break;
                    case 10:
                        FuramaController.displayMainMenu();
                        break;
                    default:
                        System.out.println("Please enter 1 ~ 10");
                        edit();
                }
            } while (choice < 1 || choice > 9);
        } else {
            System.out.println("Id is not found");
            edit();
        }
    }

    public void deleteEmployee() {
        System.out.println("Please enter id employee");
        String id = input.nextLine();
        Employee employee = findById(id);
        if (employee != null) {
            employeeList.remove(findById(id));
            ReadWriteFile.writeFile(employeeList, "D:\\A0321I1_LeNga_Module2\\src\\data\\employee.csv");
        } else {
            System.out.println("Id is not found");
            deleteEmployee();
        }
    }
}



//                        double newSalary = 0;
//                        boolean check = true;
//                        while (check) {
//                            try {
//                                newSalary = Double.parseDouble(input.nextLine());
//                                check = false;
//                            } catch (NumberFormatException e) {
//                                System.out.println("Please re-enter number");
//                                check = true;
//                            }
//                        }

