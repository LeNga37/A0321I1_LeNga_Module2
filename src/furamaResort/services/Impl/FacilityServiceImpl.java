package furamaResort.services.Impl;

import furamaResort.controllers.FuramaController;
import furamaResort.models.*;
import furamaResort.services.FacilityService;
import furamaResort.utils.*;
import furamaResort.utils.exception.*;

import java.util.*;

public class FacilityServiceImpl implements FacilityService {
    private static Scanner input = new Scanner(System.in);
    static Map<Facility, Integer> facilityList = new LinkedHashMap<>(16, 0.75f, true);

    private static final String ID_SERVICE_VILLA_REGEX = "^(SVVL)-\\d{4}$";
    private static final String ID_SERVICE_HOUSE_REGEX = "^(SVHO)-\\d{4}$";
    private static final String ID_SERVICE_ROOM_REGEX = "^(SVRO)-\\d{4}$";
    private static final String SERVICE_NAME_REGEX = "^[A-Z][a-z]+$";
    private static final String USABLE_AREA_REGEX = "([3-9]\\d|[1-9]\\d{2,})$";
    private static final String POOL_AREA_REGEX = "([3-9]\\d|[1-9]\\d{2,})$";
    private static final String COST_RENT_REGEX = "^(\\d+)(|\\.[0-9]+)$";
    private static final String MAX_CAPACITY_REGEX = "^(0)[1-9]|(1)[1-9]|(20)&";
    private static final String TOTAL_FLOOR_REGEX = "^(\\d+)(|\\.[0-9]+)$";//co d sau \\ khong
    private static final String RENT_TYPE_REGEX = "^[A-Z][a-z]+$";
    private static final String ROOM_STANDARD_REGEX = "^[A-Z][a-z]+$";
    private static final String EMAIL_REGEX = "^[a-z0-9_]+[a-z0-9]@([a-z0-9]+\\.)[a-z]+(|\\.[a-z]+)$";

//    static Villa villa1 = new Villa("Villa", 2343, 3454, 3, "ngay", "vip", 56, 2);
//    static Villa villa2 = new Villa("Villa", 55555555, 222522222, 5, "ngay", "vip", 90, 3);
//    static House house1 = new House("House", 2343, 3454, 3, "ngay", "vip", 2);
//    static House house2 = new House("House", 555555, 22222222, 5, "thang", "vip", 3);
//    static Room room1 = new Room("Room", 35, 3222, 3, "thang", "wifi");
//    static Room room2 = new Room("Room", 50, 54656, 3, "nam", "wifi");

    @Override
    public void display() {
//        facilityList.put(villa1, 0);
//        facilityList.put(villa2, 5);
//        facilityList.put(house1, 0);
//        facilityList.put(house2, 5);
//        facilityList.put(room1, 0);
//        facilityList.put(room2, 5);
        for (Map.Entry<Facility, Integer> facilityList : facilityList.entrySet()) {
            System.out.println("Service " + facilityList.getKey() + "Value: " + facilityList.getValue());
        }
    }


    @Override
    public void addNew() {
        int choice = -1;
        do {
            System.out.println("Please enter facility want add: \n"
                    + "1. Add New Villa \n"
                    + "2. Add New House \n"
                    + "3. Add New Room \n"
                    + "4. Back to menu \n");
            try {
                choice = Integer.parseInt(input.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Please re-enter the number");
            }

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


//    public static Facility findById(String id) {
//        for (Map.Entry<Facility, Integer> facilityList : facilityList.entrySet()) {
//            if(id.equals(facilityList.getKey().getId())){
//                return facilityList.getKey();
//            }
//        }
//        return null;
//    }

    public void addVilla() {
        String id = inputIdVilla();
        String serviceName = inputServiceName();
        String usableArea = inputUsableArea();
        String costRent = inputCostRent();
        String maxCapacity = inputMaxCapacity();
        String rentType = inputRentType();
        String roomStandard = inputRoomStandard();
        String poolArea=inputPoolArea();
        String totalFloor = inputTotalFloor();

        facilityList.put(new Villa(id, serviceName, usableArea, costRent, maxCapacity, rentType, roomStandard,poolArea, totalFloor), 0);
        ReadWriteFile.writeFile((Collection) facilityList, "D:\\A0321I1_LeNga_Module2\\src\\data\\facility.csv");
        System.out.println("Add new Villa successful");
    }

    public void addHouse() {
        String id = inputIdHouse();
        String serviceName = inputServiceName();
        String usableArea = inputUsableArea();
        String costRent = inputCostRent();
        String maxCapacity = inputMaxCapacity();
        String rentType = inputRentType();
        String roomStandard = inputRoomStandard();
        String totalFloor = inputTotalFloor();

        facilityList.put(new House(id, serviceName, usableArea, costRent, maxCapacity, rentType, roomStandard, totalFloor), 0);
        System.out.println("Add new House successful");
    }

    public void addRoom() {
        String id = inputIdRoom();
        String serviceName = inputServiceName();
        String usableArea = inputUsableArea();
        String costRent = inputCostRent();
        String maxCapacity = inputMaxCapacity();
        String rentType = inputRentType();

        System.out.println("Please enter freeService");
        String freeService = input.nextLine();

        facilityList.put(new Room(id, serviceName, usableArea, costRent, maxCapacity, rentType, freeService), 0);
        System.out.println("Add new Room successful");
    }

    private String inputIdVilla() {
        System.out.println("Please enter id");
        return RegexData.regexString(input.nextLine(), ID_SERVICE_VILLA_REGEX, "Mã dịch vụ của House có định dạng SVVL-YYYY với YYYY là 0-9 ");
    }

    private String inputIdHouse() {
        System.out.println("Please enter id");
        return RegexData.regexString(input.nextLine(), ID_SERVICE_HOUSE_REGEX, "Mã dịch vụ của House có định dạng SVHO-YYYY với YYYY là 0-9 ");
    }

    private String inputIdRoom() {
        System.out.println("Please enter id");
        return RegexData.regexString(input.nextLine(), ID_SERVICE_ROOM_REGEX, "Mã dịch vụ của House có định dạng SVRO-YYYY với YYYY là 0-9 ");
    }

    private String inputServiceName() {
        System.out.println("Please enter serviceName");
        return RegexData.regexString(input.nextLine(), SERVICE_NAME_REGEX, "Tên dịch vụ phải viết hoa ký tự đầu, các ký tự sau là ký tự bình thường");
    }

    private String inputUsableArea() {
        System.out.println("Please enter usableArea");
        return RegexData.regexString(input.nextLine(), USABLE_AREA_REGEX, "Diện tích sử dụng phải là số thực lớn hơn 30m2");
    }

    private String inputCostRent() {
        System.out.println("Please enter costRent");
        return RegexData.regexString(input.nextLine(), COST_RENT_REGEX, "Chi phí thuê phải là số dương");
    }

    private String inputMaxCapacity() {
        System.out.println("Please enter maxCapacity");
        return RegexData.regexString(input.nextLine(), MAX_CAPACITY_REGEX, "Số lượng người tối đa phải >0 và nhỏ hơn <20");
    }

    private String inputRentType() {
        System.out.println("Please enter rentType: year/month/day/hour");
        return RegexData.regexString(input.nextLine(), RENT_TYPE_REGEX, "Kiểu thuê phải viết hoa ký tự đầu, các ký tự sau là ký tự bình thường");
    }

    private String inputRoomStandard() {
        System.out.println("Please enter roomStandard");
        return RegexData.regexString(input.nextLine(), ROOM_STANDARD_REGEX, "Tiêu chuẩn phòng  phải viết hoa ký tự đầu, các ký tự sau là ký tự bình thường");
    }

    private String inputPoolArea() {
        System.out.println("Please enter poolArea");
        return RegexData.regexString(input.nextLine(), POOL_AREA_REGEX, "Tiêu chuẩn phòng  phải viết hoa ký tự đầu, các ký tự sau là ký tự bình thường");
    }

    private String inputTotalFloor() {
        System.out.println("Please enter totalFloor");
        return RegexData.regexString(input.nextLine(), TOTAL_FLOOR_REGEX, "Số tầng phải là số nguyên dương.");
    }

    public static void displayFacilityListMaintenance() {
        for (Map.Entry<Facility, Integer> maintenanceList : facilityList.entrySet()) {
            if (maintenanceList.getValue() == 5) {
                System.out.println(maintenanceList.getKey());
            }
        }

    }

    @Override
    public void edit() {

    }
}

//        double usableArea = CheckDoubleNumber.checkInputDoubleNumber();
//        CheckNumber.checkInputNumber(usableArea);
//        int usableArea = 0;
//        while (check) {
//            try {
//                usableArea = Integer.parseInt(input.nextLine());
//                check = false;
//            } catch (NumberFormatException e) {
//                System.out.println("Please re-enter usableArea (enter number) ");
//                check=true;
//            }
//        }


//        System.out.println("Please enter id");
//        String id = input.nextLine();
//        System.out.println("Please enter serviceName");
//        String serviceName = input.nextLine();
//        System.out.println("Please enter usableArea of Villa");
//        String usableArea=input.nextLine();
//        System.out.println("Please enter costRent of Villa");
//        String costRent=input.nextLine();
//        System.out.println("Please enter maxCapacity of Villa");
//        String maxCapacity=input.nextLine();
//        System.out.println("Please enter rentType");
//        String rentType = input.nextLine();
//        System.out.println("Please enter roomStandard");
//        String roomStandard = input.nextLine();
//        System.out.println("Please enter poolArea of Villa");
//        String poolArea = input.nextLine();
//        System.out.println("Please enter totalFloor of Villa");
//        String totalFloor = input.nextLine();

//    Villa villa=new Villa();
//        boolean check=false;
//        String id;
//        do{
//            try{
//                System.out.println("Please enter id SVVL-YYYY with YYYY 0-9");
//                id=input.nextLine();
//                if(ValidateData.validateIdServiceVilla(id)){
//                    villa.setId(id);
//                    check=true;
//                }else {
//                    throw new IdException("Mã dịch vụ của Villa có định dạng SVVL-YYYY với YYYY là 0-9 ");
//                }
//            }catch (IdException e){
//                System.out.println(e.getMessage());
//            }
//        }while (!check);
//
//        check=false;
//
//        String serviceName;
//        do{
//            try{
//                System.out.println("Please enter serviceName");
//                serviceName=input.nextLine();
//                if(ValidateData.validateServiceName(serviceName)){
//                    villa.setServiceName(serviceName);
//                    check=true;
//                }else {
//                    throw new NameException("Tên dịch vụ phải viết hoa ký tự đầu, các ký tự sau là ký tự bình thường");
//                }
//            }catch (NameException e){
//                System.out.println(e.getMessage());
//            }
//        }while (!check);
//
//        check=false;
//
//        String usableArea;
//        do{
//            try{
//                System.out.println("Please enter usableArea");
//                usableArea=input.nextLine();
//                if(ValidateData.validateUsableArea(usableArea)){
//                    villa.setServiceName(usableArea);
//                    check=true;
//                }else {
//                    throw new AreaException("Diện tích sử dụng phải là số thực lớn hơn 30m2");
//                }
//            }catch (AreaException e){
//                System.out.println(e.getMessage());
//            }
//        }while (!check);
//
//
//        check=false;
//
//        String costRent;
//        do{
//            try{
//                System.out.println("Please enter costRent");
//                costRent=input.nextLine();
//                if(ValidateData.validateCostRent(costRent)){
//                    villa.setServiceName(costRent);
//                    check=true;
//                }else {
//                    throw new CostRentException("Chi phí thuê phải là số dương");
//                }
//            }catch (CostRentException e){
//                System.out.println(e.getMessage());
//            }
//        }while (!check);
//
//        check=false;
//
//        String maxCapacity;
//        do{
//            try{
//                System.out.println("Please enter maxCapacity");
//                maxCapacity=input.nextLine();
//                if(ValidateData.validateMaxCapacity(maxCapacity)){
//                    villa.setServiceName(maxCapacity);
//                    check=true;
//                }else {
//                    throw new MaxCapacityException("-\tSố lượng người tối đa phải >0 và nhỏ hơn <20");
//                }
//            }catch (MaxCapacityException e){
//                System.out.println(e.getMessage());
//            }
//        }while (!check);
//
//        check=false;
//
//        String rentType;
//        do{
//            try{
//                System.out.println("Please enter rentType: year/month/day/hour");
//                rentType=input.nextLine();
//                if(ValidateData.validaRentType(rentType)){
//                    villa.setServiceName(rentType);
//                    check=true;
//                }else {
//                    throw new RentTypeException ("-\tKiểu thuê phải viết hoa ký tự đầu, các ký tự sau là ký tự bình thường");
//                }
//            }catch (RentTypeException e){
//                System.out.println(e.getMessage());
//            }
//        }while (!check);
//
//        check=false;
//
//        String roomStandard;
//        do{
//            try{
//                System.out.println("Please enter roomStandard");
//                roomStandard=input.nextLine();
//                if(ValidateData.validaRoomStandard(roomStandard)){
//                    villa.setServiceName(roomStandard);
//                    check=true;
//                }else {
//                    throw new StandardException ("-\tTiêu chuẩn phòng phải viết hoa ký tự đầu, các ký tự sau là ký tự bình thường");
//                }
//            }catch (StandardException e){
//                System.out.println(e.getMessage());
//            }
//        }while (!check);
//
//        check=false;
//
//        String poolArea;
//        do{
//            try{
//                System.out.println("Please enter poolArea");
//                poolArea=input.nextLine();
//                if(ValidateData.validatePoolArea(poolArea)){
//                    villa.setServiceName(poolArea);
//                    check=true;
//                }else {
//                    throw new AreaException ("-\tDiện tích hồ bơi phải là số thực lớn hơn 30m2");
//                }
//            }catch (AreaException e){
//                System.out.println(e.getMessage());
//            }
//        }while (!check);
//
//        check=false;
//
//        String totalFloor;
//        do{
//            try{
//                System.out.println("Please enter totalFloor");
//                totalFloor=input.nextLine();
//                if(ValidateData.validaTotalFloor(totalFloor)){
//                    villa.setServiceName(totalFloor);
//                    check=true;
//                }else {
//                    throw new TotalFloorException ("-\tDiện tích hồ bơi phải là số thực lớn hơn 30m2");
//                }
//            }catch (TotalFloorException e){
//                System.out.println(e.getMessage());
//            }
//        }while (!check);

//        facilityList.put(new Villa(villa.getId(), villa.getServiceName(), villa.getUsableArea(), villa.getCostRent(),
//                villa.getMaxCapacity(), villa.getRenType(), villa.getRoomStandard(), villa.getPoolArea(), villa.getTotalFloor()), 0);


//        System.out.println("Please enter id");
//        String id = input.nextLine();
//        System.out.println("Please enter serviceName");
//        String serviceName = input.nextLine();
//        System.out.println("Please enter usableArea of Room");
//        String usableArea = input.nextLine();
//        System.out.println("Please enter costRent of Room");
//        String costRent = input.nextLine();
//        System.out.println("Please enter maxCapacity of Room");
//        String maxCapacity = input.nextLine();
//        System.out.println("Please enter rentType: year/month/day/hour");
//        String rentType = input.nextLine();