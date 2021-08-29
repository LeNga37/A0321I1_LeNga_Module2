package furamaResort.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateData {
    private static final String ID_SERVICE_VILLA_REGEX = "^(SVVL)-\\d{4}$";
    private static final String ID_SERVICE_HOUSE_REGEX = "^(SVHO)-\\d{4}$";
    private static final String ID_SERVICE_ROOM_REGEX = "^(SVRO)-\\d{4}$";
    private static final String SERVICE_NAME_REGEX = "^[A-Z][a-z]+$";
    private static final String USABLE_AREA_REGEX = "([3-9]\\d|[1-9]\\d{2,})$";
    private static final String POOL_AREA_REGEX = "([3-9]\\d|[1-9]\\d{2,})$";
    private static final String COST_RENT_REGEX = "^(\\d+)(|\\.[0-9]+)$";
    private static final String MAX_CAPACITY_REGEX = "^(0)[1-9]|(1)[0-9]|(20)$";
    private static final String TOTAL_FLOOR_REGEX = "^(\\d+)(|\\.[0-9]+)$";//co d sau \\ khong
    private static final String RENT_TYPE_REGEX="^[A-Z][a-z0-9]$";
    private static final String ROOM_STANDARD_REGEX="^[A-Z][a-z0-9]$";
    private static final String EMAIL_REGEX="^[a-z0-9_]+[a-z0-9]@([a-z0-9]+\\.)[a-z]+(|\\.[a-z]+)$";
    private static final String BIRTHDAY_REGEX = "(^(((0[1-9]|1[0-9]|2[0-8])[/](0[1-9]|1[012]))|((29|30|31)[/]" +
            "(0[13578]|1[02]))|((29|30)[/](0[4,6,9]|11)))[/](19\\d\\d|200[0-1])$)|(^29[/]02[/]((19)" +
            "(04|08|12|16|20|24|28|32|36|40|44|48|52|56|60|64|68|72|76|80|84|88|92|96)|2000)$)";

    public ValidateData(){
    }

    public static boolean validateIdServiceVilla(String regex){
        Pattern pattern=Pattern.compile(ID_SERVICE_VILLA_REGEX);
        Matcher matcher=pattern.matcher(regex);
        return matcher.matches();
    }

    public static boolean validateIdServiceHouse(String regex){
        Pattern pattern=Pattern.compile(ID_SERVICE_HOUSE_REGEX);
        Matcher matcher=pattern.matcher(regex);
        return matcher.matches();
    }

    public static boolean validateIdServiceRoom(String regex){
        Pattern pattern=Pattern.compile(ID_SERVICE_ROOM_REGEX);
        Matcher matcher=pattern.matcher(regex);
        return matcher.matches();
    }

    public static boolean validateServiceName(String regex){
        Pattern pattern=Pattern.compile(SERVICE_NAME_REGEX);
        Matcher matcher=pattern.matcher(regex);
        return matcher.matches();
    }

    public static boolean validateUsableArea(String regex){
        Pattern pattern=Pattern.compile(USABLE_AREA_REGEX);
        Matcher matcher=pattern.matcher(regex);
        return matcher.matches();
    }

    public static boolean validatePoolArea(String regex){
        Pattern pattern=Pattern.compile(POOL_AREA_REGEX);
        Matcher matcher=pattern.matcher(regex);
        return matcher.matches();
    }

    public static boolean validateCostRent(String regex){
        Pattern pattern=Pattern.compile(COST_RENT_REGEX);
        Matcher matcher=pattern.matcher(regex);
        return matcher.matches();
    }

    public static boolean validateMaxCapacity(String regex){
        Pattern pattern=Pattern.compile(MAX_CAPACITY_REGEX);
        Matcher matcher=pattern.matcher(regex);
        return matcher.matches();
    }

    public static boolean validaTotalFloor(String regex){
        Pattern pattern=Pattern.compile(TOTAL_FLOOR_REGEX);
        Matcher matcher=pattern.matcher(regex);
        return matcher.matches();
    }

    public static boolean validaRentType(String regex){
        Pattern pattern=Pattern.compile(RENT_TYPE_REGEX);
        Matcher matcher=pattern.matcher(regex);
        return matcher.matches();
    }

    public static boolean validaRoomStandard(String regex){
        Pattern pattern=Pattern.compile(ROOM_STANDARD_REGEX);
        Matcher matcher=pattern.matcher(regex);
        return matcher.matches();
    }

    public static boolean validaEmal(String regex){
        Pattern pattern=Pattern.compile(EMAIL_REGEX);
        Matcher matcher=pattern.matcher(regex);
        return matcher.matches();
    }




}
