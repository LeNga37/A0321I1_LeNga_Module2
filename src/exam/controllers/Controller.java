package exam.controllers;

import exam.services.SanPhamNhapKhauImpl;
import exam.services.SanPhamXuatKhauImpl;

import java.util.Scanner;

public class Controller {
    static Scanner input = new Scanner(System.in);

    public static void displayMainMenu() {
        int choice = -1;
        do {
            System.out.println("--CHƯƠNG TRÌNH QUẢN LÝ SẢN PHẨM –-\n"
                    + "Hãy chọn loại sản phẩm muốn quản lý:\n"
                    + "1. Quản lý sản phẩm xuất khẩu  \n"
                    + "2. Quản lý sản phẩm nhập khẩu\n"
                    + "3. Thoát chương trình \n");
            try {
                choice = Integer.parseInt(input.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Hãy nhập số");
            }

            switch (choice) {
                case 1:
                    quanLySPXuatKhau();
                    break;
                case 2:
                    quanLySPNhapKhau();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Hãy chọn 1 đến 3");
                    displayMainMenu();
            }
        } while (true);
    }

    public static void quanLySPXuatKhau() {
        SanPhamXuatKhauImpl sanPhamXuatKhau = new SanPhamXuatKhauImpl();
        int choice = -1;
        do {
            System.out.println("Hãy chọn chức năng:\n"
                    + "1. Thêm mới sản phẩm  \n"
                    + "2. Xóa sản phẩm \n"
                    + "3. Hiển thị danh sách sản phẩm xuất khẩu \n"
                    + "4. Tìm kiếm sản phẩm \n"
                    + "5. Quay lại menu chính \n");
            try {
                choice = Integer.parseInt(input.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Hãy nhập số");
            }

            switch (choice) {
                case 1:
                    sanPhamXuatKhau.themMoiSanPham();
                    break;
                case 2:
                    sanPhamXuatKhau.xoaSanPham();
                    break;
                case 3:
                    sanPhamXuatKhau.xemDanhSachSanPham();
                    break;
                case 4:
                    sanPhamXuatKhau.timKiemSanPham();
                    break;
                case 5:
                    displayMainMenu();
                    break;
                default:
                    System.out.println("Hãy chọn 1 đến 4");
            }
        } while (true);
    }

    public static void quanLySPNhapKhau() {
        SanPhamNhapKhauImpl sanPhamNhapKhau = new SanPhamNhapKhauImpl();
        int choice = -1;
        do {
            System.out.println("Hãy chọn chức năng:\n"
                    + "1. Thêm mới sản phẩm  \n"
                    + "2. Xóa sản phẩm \n"
                    + "3. Hiển thị danh sách sản phẩm nhập khẩu \n"
                    + "4. Tìm kiếm sản phẩm \n"
                    + "5. Quay lại menu chính \n");
            try {
                choice = Integer.parseInt(input.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Hãy nhập số");
            }

            switch (choice) {
                case 1:
                    sanPhamNhapKhau.themMoiSanPham();
                    break;
                case 2:
                    sanPhamNhapKhau.xoaSanPham();
                    break;
                case 3:
                    sanPhamNhapKhau.xemDanhSachSanPham();
                    break;
                case 4:
                    sanPhamNhapKhau.timKiemSanPham();
                    break;
                case 5:
                    displayMainMenu();
                    break;
                default:
                    System.out.println("Hãy chọn 1 đến 4");
            }
        } while (true);
    }
}


