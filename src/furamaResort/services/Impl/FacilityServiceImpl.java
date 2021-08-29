package furamaResort.services;

import furamaResort.controllers.FuramaController;
import furamaResort.models.Facility;
import furamaResort.models.House;
import furamaResort.models.Room;
import furamaResort.models.Villa;

import java.util.*;

public class FacilityServiceImpl implements FacilityService {
    private static Scanner input = new Scanner(System.in);
    static Map<Facility, Integer> facilityList = new LinkedHashMap<>(16, 0.75f, true);

    static Villa villa1=new Villa("Villa",2343,3454,3,"ngay","vip",56,2);
    static Villa villa2=new Villa("Villa",55555555,222522222,5,"ngay","vip",90,3);
    static House house1=new House("House",2343,3454,3,"ngay","vip",2);
    static House house2=new House("House",555555,22222222,5,"thang","vip",3);
    static Room room1=new Room("Room",35,3222,3,"thang","wifi");
    static Room room2=new Room("Room",50,54656,3,"nam","wifi");


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


        facilityList.put(new Villa(serviceName, usableArea, costRent, maxCapacity, rentType, roomStandard, poolArea, totalFloor),0);
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


        facilityList.put(new House(serviceName, usableArea, costRent, maxCapacity, rentType, roomStandard, poolArea),0);
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

        System.out.println("Please enter rentType: year/month/day/hour");
        String rentType = input.nextLine();

        System.out.println("Please enter freeService");
        String freeService = input.nextLine();

        facilityList.put(new Room(serviceName, usableArea, costRent, maxCapacity, rentType, freeService),0);
    }

    public static void displayFacilityList() {
        facilityList.put(villa1,0);
        facilityList.put(villa2,5);
        facilityList.put(house1,0);
        facilityList.put(house2,5);
        facilityList.put(room1,0);
        facilityList.put(room2,5);

        for (Facility facility : facilityList.keySet()) {
            System.out.println(facility);
        }
    }

    public static void displayFacilityListMaintenance() {
        for(Map.Entry<Facility,Integer> maintenanceList:facilityList.entrySet()){
            if(maintenanceList.getValue()==5){
                System.out.println(maintenanceList.getKey());
            }
        }

    }
}


