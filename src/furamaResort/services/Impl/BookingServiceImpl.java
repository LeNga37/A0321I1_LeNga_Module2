package furamaResort.services;

import furamaResort.models.Booking;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class BookingServiceImpl implements BookingService{
    private static Set<Booking> bookingList=new TreeSet<Booking>();
//    private static Scanner input=new Scanner(System.in);
//
//    public static void displayBookingList(){
//        for(Booking booking:bookingList){
//            System.out.println(booking);
//        }
//    }

    public static void displayBookingList(){
        CustomerServiceImpl.displayCustomerList();
    }

//hiển thị danh sách khách hàng cho ngườ chọnj, hiển thị dịch vụ chọn
    //lấy id khách hàng và lưu chon đó vào danh sách booking.

}
