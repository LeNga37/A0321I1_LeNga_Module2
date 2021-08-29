package bai_19_string_va_regex.thuc_hanh.validate_account;

import java.util.Scanner;

public class AccountExampleTest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String account="";
        AccountExample accountExample=new AccountExample();
        do{
            System.out.println("Enter account");
            account=input.nextLine();
//            accountExample.validate(account);
        }while (!accountExample.validate(account));
    }
}
