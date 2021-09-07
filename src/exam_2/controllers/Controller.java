package exam_2.controllers;

import exam_2.services.BenhAnThuongImpl;
import exam_2.services.BenhAnVipImpl;

import java.util.Scanner;

public class Controller {
    static Scanner input = new Scanner(System.in);

    public static void displayMainMenu() {
        int choice = -1;
        do {
            System.out.println("--HỆ THỐNG QUẢN LÝ BỆNH ÁN CỦA BỆNH NHÂN TẠI BỆNH VIỆN XYZ--\n"
                    + "Hãy chọn loại bệnh án muốn quản lý:\n"
                    + "1. Quản lý bệnh án thường  \n"
                    + "2. Quản lý bệnh án Vip \n"
                    + "3. Thoát chương trình \n");
            try {
                choice = Integer.parseInt(input.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Hãy nhập số");
            }

            switch (choice) {
                case 1:
                    quanLyBenhAnThuong();
                    break;
                case 2:
                    quanLyBenhAnVip();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Hãy chọn 1 đến 3");
                    displayMainMenu();
            }
        } while (true);
    }

    public static void quanLyBenhAnThuong() {
        BenhAnThuongImpl benhAnThuongImpl = new BenhAnThuongImpl();
        int choice = -1;
        do {
            System.out.println("Hãy chọn chức năng:\n"
                    + "1. Thêm mới bệnh án thường  \n"
                    + "2. Xóa bệnh án thường \n"
                    + "3. Hiển thị danh sách bệnh án thường \n"
                    + "4. Quay lại menu chính \n");
            try {
                choice = Integer.parseInt(input.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Hãy nhập số");
            }

            switch (choice) {
                case 1:
                    benhAnThuongImpl.themMoiBenhNhan();
                    break;
                case 2:
                    benhAnThuongImpl.xoaBenhNhan();
                    break;
                case 3:
                    benhAnThuongImpl.xemDanhSachBenhNhan();
                    break;
                case 4:
                    displayMainMenu();
                    break;
                default:
                    System.out.println("Hãy chọn 1 đến 4");
            }
        } while (true);
    }

    public static void quanLyBenhAnVip() {
        BenhAnVipImpl benhAnVipImpl = new BenhAnVipImpl();
        int choice = -1;
        do {
            System.out.println("Hãy chọn chức năng\n"
                    + "1. Thêm mới bệnh án vip\n"
                    + "2. Xóa bệnh án vip\n"
                    + "3. Hiển thị danh sách bệnh án vip \n"
                    + "4. Quay lại menu chính \n");
            try {
                choice = Integer.parseInt(input.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Hãy nhập số");
            }
            switch (choice) {
                case 1:
                    benhAnVipImpl.themMoiBenhNhan();
                    break;
                case 2:
                    benhAnVipImpl.xoaBenhNhan();
                    break;
                case 3:
                    benhAnVipImpl.xemDanhSachBenhNhan();
                    break;
                case 4:
                    displayMainMenu();
                    break;
                default:
                    System.out.println("Hãy chọn 1 đến 4");
            }
        } while (true);
    }
}
