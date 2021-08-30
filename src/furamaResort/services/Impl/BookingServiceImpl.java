package furamaResort.services.Impl;

import furamaResort.models.Booking;
import furamaResort.models.Customer;
import furamaResort.models.Facility;
import furamaResort.models.Villa;
import furamaResort.services.BookingService;
import furamaResort.utils.BookingComparator;
import furamaResort.utils.ReadWriteFile;

import java.util.*;

public class BookingServiceImpl implements BookingService {
    private static Scanner input = new Scanner(System.in);
    private static Set<Booking> bookingSet = new TreeSet<>(new BookingComparator());
//    static List<Customer> customerList = new ArrayList<>();
//    static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();

//    static {
//        customerList.add(new Customer("1", "nga", "8/6/1992", "nu", "34567456",
//                "23546786", "lenga@gmail.com", "vip", "227 hoai thanh"));
//        customerList.add(new Customer("2", "Nhung", "14/06/1996", "nu", "65576645",
//                "23423455", "camnhung@gmail.com", "vip", "227 trung nu vuong"));
//
//        facilityIntegerMap.put(new Villa("1", "Villa1", "100", "34554", "5",
//                "year", "vip", "50", "2"), 0);
//        facilityIntegerMap.put(new Villa("2", "Villa2", "250", "3664554", "10",
//                "month", "vip", "60", "4"), 0);
//    }

    public Set<Booking> sendBooking() {
        return bookingSet;
    }

    @Override
    public void display() {
        bookingSet= (Set<Booking>) ReadWriteFile.readFile("D:\\A0321I1_LeNga_Module2\\src\\data\\booking.csv");
        for (Booking booking : bookingSet) {
            System.out.println(booking);
        }
    }

    @Override
    public void addNew() {
//        String id = "1";
//        if (!bookingSet.isEmpty()) {
//            id = String.valueOf(bookingSet.size());
//        }
        System.out.println("Please enter bookingId: ");
        String bookingId = input.nextLine();

        Customer customer = chooseCustomer();
        Facility facility = chooseFacility();

        System.out.println("Please enter firstDay: ");
        String firstDay = input.nextLine();

        System.out.println("Please enter lastDay: ");
        String lastDay = input.nextLine();

        System.out.println("Please enter serviceType: ");
        String serviceType = input.nextLine();

        Booking booking = new Booking(bookingId, firstDay, lastDay, customer.getId(), facility.getServiceName(), serviceType);
        bookingSet.add(booking);
        ReadWriteFile.writeFile(bookingSet,"D:\\A0321I1_LeNga_Module2\\src\\data\\booking.csv");
        System.out.println("Add booking successful");
        System.out.println("---------*****----------");
    }

    @Override
    public void edit() {

    }

    public static Customer chooseCustomer() {
        List<Customer> customerList = new CustomerServiceImpl().sendCustomer();
        System.out.println("---------CustomerList----------");
        for (Customer customer : customerList) {
            System.out.println(customer.toString());
        }
        System.out.println("Please enter customer id: ");
        boolean check = true;
        String id = input.nextLine();

        while (check) {
            for (Customer customer : customerList) {
                if (id.equals(customer.getId())) {
                    check = false;
                    return customer;
                }
            }
            if (check) {
                System.out.println("Please re-enter customer id: ");
                id = input.nextLine();
            }
        }
        return null;
    }

    public static Facility chooseFacility() {
        Map<Facility, Integer> facilityIntegerMap = new FacilityServiceImpl().sendFacility();
        System.out.println("---------FacilityList----------");
        for (Map.Entry<Facility, Integer> entry : facilityIntegerMap.entrySet()) {
            System.out.println(entry.getKey());
        }
        System.out.println("Please enter facility id: ");
        boolean check = true;
        String id = input.nextLine();

        while (check) {
            for (Map.Entry<Facility, Integer> entry : facilityIntegerMap.entrySet()) {
                if (id.equals(entry.getKey().getId())) {
                    check = false;
                    return entry.getKey();
                }
            }
            if (check) {
                System.out.println("Please re-enter facility id: ");
                id = input.nextLine();
            }
        }
        return null;
    }
}
