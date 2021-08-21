package furamaResort.services;

import furamaResort.controllers.FuramaController;
import furamaResort.models.Facility;
import furamaResort.models.House;
import furamaResort.models.Room;
import furamaResort.models.Villa;

import java.util.*;

public class FacilityServiceImpl implements FacilityService {
    private static List<Facility> facilityList = new ArrayList<>();
    private static Scanner input = new Scanner(System.in);
//    Map<String, Integer> serviceList = new LinkedHashMap<>(16, 0.75f, true);

    public static void serviceList(LinkedHashMap<String,Integer> serviceList){
        serviceList.put("Villa",2);
        serviceList.put("House",2);
        serviceList.put("Room",2);
    }

//    public static void displayFacilityList(LinkedHashMap<Service, Integer> linkedHashMap) {
//        Set<Service> keySet = linkedHashMap.keySet();
//        for (Service key : keySet) {
//            System.out.println(key + " " + linkedHashMap.get(key));
//        }
//    }

    public static void addFacility() {
        int choice = -1;
        do {
            System.out.println("Please enter facility want add: \n"
                    + "1. Add New Villa \n"
                    + "2. Add New House \n"
                    + "3. Add New Room \n"
                    + "4. Back to menu \n");
            choice = input.nextInt();
            input.skip("\\R");
            switch (choice) {
                case 1:
                    addVilla();
                    break;
                case 2:
                    addHouse();
                    break;
                case 3:
                    addRoom();
                    break;
                case 4:
                    FuramaController.displayMainMenu();
                    break;
                default:
                    System.out.println("Please enter 1 ~ 4");
            }
        } while (choice < 1 || choice > 4);
    }

    public static void addVilla() {
        System.out.println("Please enter serviceName");
        String serviceName = input.nextLine();

        System.out.println("Please enter usableArea");
        float usableArea = input.nextFloat();

        System.out.println("Please enter costRent");
        double costRent = input.nextDouble();

        System.out.println("Please enter maxCapacity");
        int maxCapacity = input.nextInt();
        input.skip("\\R");

        System.out.println("Please enter rentType");
        String rentType = input.nextLine();

        System.out.println("Please enter roomStandard");
        String roomStandard = input.nextLine();

        System.out.println("Please enter poolArea");
        float poolArea = input.nextFloat();

        System.out.println("Please enter totalFloor");
        int totalFloor = input.nextInt();

        facilityList.add(new Villa(serviceName, usableArea, costRent, maxCapacity, rentType, roomStandard, poolArea, totalFloor));
    }

    public static void addHouse() {
        System.out.println("Please enter serviceName");
        String serviceName = input.nextLine();

        System.out.println("Please enter usableArea");
        float usableArea = input.nextFloat();

        System.out.println("Please enter costRent");
        double costRent = input.nextDouble();

        System.out.println("Please enter maxCapacity");
        int maxCapacity = input.nextInt();
        input.skip("\\R");

        System.out.println("Please enter rentType");
        String rentType = input.nextLine();

        System.out.println("Please enter roomStandard");
        String roomStandard = input.nextLine();

        System.out.println("Please enter totalFloor");
        int poolArea = input.nextInt();

        facilityList.add(new House(serviceName, usableArea, costRent, maxCapacity, rentType, roomStandard, poolArea));
    }

    public static void addRoom() {
        System.out.println("Please enter serviceName");
        String serviceName = input.nextLine();

        System.out.println("Please enter usableArea");
        float usableArea = input.nextFloat();

        System.out.println("Please enter costRent");
        double costRent = input.nextDouble();

        System.out.println("Please enter maxCapacity");
        int maxCapacity = input.nextInt();
        input.skip("\\R");

        System.out.println("Please enter rentType");
        String rentType = input.nextLine();

        System.out.println("Please enter freeService");
        String freeService = input.nextLine();

        facilityList.add(new Room(serviceName, usableArea, costRent, maxCapacity, rentType, freeService));
    }

    public static void displayFacilityList() {
        for (Facility facility : facilityList) {
            System.out.println(facility);
        }
    }

    public static void displayFacilityListMaintenance() {

    }
}


