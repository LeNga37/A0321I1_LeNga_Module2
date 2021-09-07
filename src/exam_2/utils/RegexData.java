package exam_2.utils;

import java.util.Scanner;

public class RegexData {
    static Scanner input = new Scanner(System.in);

    public static String regexString(String value, String regex, String error) {
        boolean check = true;
        do {
            if (value.matches(regex)) {
                check = false;
            } else {
                System.out.println(error);
                value = input.nextLine();
            }

        } while (check);
        return value;
    }

//    public static String regexAge(String value, String regex) {
//        boolean check = true;
//        while (check) {
//            try {
//                if (Pattern.matches(regex, value)) {
//                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//                    LocalDate age = LocalDate.parse(value, formatter);
//                    LocalDate now = LocalDate.now();
//                    int current = Period.between(age, now).getYears();
//                    if (current < 100 && current > 18) {
//                        check = false;
//                    } else {
//                        throw new AgeException("Tuổi phải lớn hơn 18 và bé hơn 100");
//                    }
//                } else {
//                    throw new AgeException("Định dạng nhập vào không đúng");
//                }
//            } catch (AgeException e) {
//                System.out.println(e.getMessage());
//                value = input.nextLine();
//            }
//        }
//        return value;
//    }
}

