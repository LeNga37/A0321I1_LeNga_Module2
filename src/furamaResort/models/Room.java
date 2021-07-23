package furamaResort.models;

public class Room extends Facility {
    private String freeService;

    public Room() {
    }

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(String serviceName, float usableArea, double costRent, int maximum, String rentType, String freeService) {
        super(serviceName, usableArea, costRent, maximum, rentType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" +
                super.toString() +
                "freeService='" + freeService + '\'' +
                '}';
    }
}
//1. Xây dựng abstract class Facility (cơ sở vật chất) bao gồm các thông tin chung của tất cả dịch vụ cho thuê Villa, House, Room.
//2. Xây dựng các class có tên là Villa, House, Room và định nghĩa thêm các thuộc tính riêng của từng class. Các class này sẽ extend từ abstract class Facility.
//3.Tương tự 2 mục trên xây dựng class Customer, Employee kế thừa từ abstract class Person
//4. Xây dựng class Booking, Contract
//(Các class này được tạo trong package models)