package furamaResort.services.Impl;

import furamaResort.controllers.FuramaController;
import furamaResort.models.Booking;
import furamaResort.models.Contract;
import furamaResort.services.ContactService;
import furamaResort.utils.ReadWriteFile;

import java.util.*;

public class ContactServiceImpl implements ContactService {
    static List<Contract> contractList=new ArrayList<>();

    static Scanner input =new Scanner(System.in);

    @Override
    public void addNew() {
        Queue<Booking> bookingQueue=new LinkedList<>();
        Set<Booking> bookingSet=new BookingServiceImpl().sendBooking();
        for(Booking booking : bookingSet){
            bookingQueue.add(booking);
        }
        while (!bookingQueue.isEmpty()) {
            Booking booking = bookingQueue.poll();
            String customer = booking.getCustomerId();
            System.out.println("Creat contract booking with information: " + booking);
            System.out.println("Creat contract customer with information: " + customer);

            System.out.println("Please enter contractNumber: ");
            String contractNumber = input.nextLine();

            System.out.println("Please enter deposit");
            String deposit = input.nextLine();

            System.out.println("Please enter totalPayment");
            String totalPayment = input.nextLine();

            Contract contract = new Contract(contractNumber, booking.getBookingId(), deposit, totalPayment, customer);
            contractList.add(contract);
            ReadWriteFile.writeFile(contractList,"D:\\A0321I1_LeNga_Module2\\src\\data\\contract.csv");
            System.out.println("Creat contract successful " + contract);
            System.out.println("---------*****-----------");
        }
    }
    @Override
    public void display() {
        contractList= (List<Contract>) ReadWriteFile.readFile("D:\\A0321I1_LeNga_Module2\\src\\data\\contract.csv");
        for(Contract contract:contractList){
            System.out.println(contract);
        }
    }

    public Contract findById(String id) {
        for (Contract contract : contractList) {
            if (contract.getContractNumber().equals(id)) {//contract.getContractNumber() == id
                return contract;
            }
        }
        return null;
    }
    @Override
    public void edit() {
        System.out.println("Please enter id:");
        String id = input.nextLine();
        Contract contract = findById(id);
        if (contract != null) {
            int choice=0;
            do {
                System.out.println("Please enter information update: \n"
                        + "1. contractNumber \n"
                        + "2. bookingId \n"
                        + "3. deposit \n"
                        + "4. totalPayment \n"
                        + "5. customerId \n"
                        + "6. Back to menu \n");
                try{
                    choice = Integer.parseInt(input.nextLine());
                }catch (NumberFormatException e){
                    System.out.println("Please re-enter the number");
                }
                switch (choice) {
                    case 1:
                        System.out.println("Please enter new contractNumber");
                        String newContractNumber = input.nextLine();
                        contract.setContractNumber(newContractNumber);
                        ReadWriteFile.writeFile(contractList,"D:\\A0321I1_LeNga_Module2\\src\\data\\contract.csv");
                        break;
                    case 2:
                        System.out.println("Please enter new bookingId");
                        String newBookingId = input.nextLine();
                        contract.setBookingId(newBookingId);
                        ReadWriteFile.writeFile(contractList,"D:\\A0321I1_LeNga_Module2\\src\\data\\contract.csv");
                        break;
                    case 3:
                        System.out.println("Please enter deposit");
                        String newDeposit = input.nextLine();
                        contract.setDeposit(newDeposit);
                        ReadWriteFile.writeFile(contractList,"D:\\A0321I1_LeNga_Module2\\src\\data\\contract.csv");
                        break;
                    case 4:
                        System.out.println("Please enter totalPayment");
                        String newTotalPayment = input.nextLine();
                        contract.setTotalPayment(newTotalPayment);
                        ReadWriteFile.writeFile(contractList,"D:\\A0321I1_LeNga_Module2\\src\\data\\contract.csv");
                        break;
                    case 5:
                        System.out.println("Please enter newCustomerId");
                        String newCustomerId = input.nextLine();
                        contract.setCustomerId(newCustomerId);
                        ReadWriteFile.writeFile(contractList,"D:\\A0321I1_LeNga_Module2\\src\\data\\contract.csv");
                        break;
                    case 6:
                        FuramaController.displayMainMenu();
                        break;
                    default:
                        System.out.println("Please input 1 ~ 6");
                        break;
                }
            } while (choice < 1 || choice > 6);
        } else {
            System.out.println("Id is not found");
            edit();
        }

    }


}
