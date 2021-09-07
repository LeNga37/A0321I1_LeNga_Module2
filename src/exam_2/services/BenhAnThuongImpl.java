package exam_2.services;

import exam_2.controllers.Controller;
import exam_2.models.BenhAn;
import exam_2.models.BenhAnThuong;
import exam_2.utils.ReadWriteFile;
import exam_2.utils.RegexData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BenhAnThuongImpl implements ChucNang {
    static List<BenhAnThuong> benhAnThuongList = new ArrayList<>();
    public static Scanner input = new Scanner(System.in);
    public static int soThuTu = 0;
    private static final String ID_BENHAN_REGEX = "^(BA)-\\d{3}$";
    private static final String ID_BENHNHAN_REGEX = "^(BN)-\\d{3}$";
    private static final String ID_NAME_REGEX = "^(([A-Z][a-z]+)(| ))+$";
    private static final String BIRTHDAY_REGEX = "(^(((0[1-9]|1[0-9]|2[0-8])[\\/](0[1-9]|1[012]))|((29|30|31)[\\/]" +
            "(0[13578]|1[02]))|((29|30)[\\/](0[4,6,9]|11)))[\\/](19|[2-9][0-9])\\d\\d$)|(^29[\\/]02[\\/](19|[2-9][0-9])" +
            "(00|04|08|12|16|20|24|28|32|36|40|44|48|52|56|60|64|68|72|76|80|84|88|92|96)$)";

//    public static BenhAnThuong timMaBenhAn(String maBenhAn) {
//        benhAnList = (List<BenhAn>) ReadWriteFile.readFile("src\\exam_2\\data\\sanphamnhapkhau.csv");
////        for (BenhAn benhAn : benhAnThuongList) {
////            if (benhAn instanceof BenhAnThuong){
////               BenhAnThuong benhAnThuong=(BenhAnThuong)benhAn;
////                if (benhAnThuong.getMaBenhAn().equals(maBenhAn)) {
////                    return benhAnThuong;
////                }
////            }
////        }
//        if (benhAnList != null) {
//            for (BenhAn benhAn : benhAnList) {
//            if (benhAn instanceof BenhAnThuong){
//               BenhAnThuong benhAnThuong=(BenhAnThuong)benhAn;
//                if (benhAnThuong.getMaBenhAn().equals(maBenhAn)) {
//                    return benhAnThuong;
//                    }
//                }
//            }
//        }
//        return null;
//    }


    public static BenhAnThuong timMaBenhAn(String maBenhAn) {
        maBenhAn = RegexData.regexString(maBenhAn, ID_BENHAN_REGEX, "Vui lòng nhập mã bệnh án theo định dạng BA-XXX, với XXX là các kí tự số.");
        benhAnThuongList = (List<BenhAnThuong>) ReadWriteFile.readFile("src\\exam_2\\data\\sanphamnhapkhau.csv");
        if (benhAnThuongList != null) {
            for (BenhAnThuong benhAnThuong : benhAnThuongList) {
                if (benhAnThuong.getMaBenhAn().equals(maBenhAn)) {
                    return benhAnThuong;
                }
            }
        }
        return null;
    }

    @Override
    public void xemDanhSachBenhNhan() {
        benhAnThuongList = (List<BenhAnThuong>) ReadWriteFile.readFile("src\\exam_2\\data\\sanphamnhapkhau.csv");
        System.out.println(benhAnThuongList);
        if (benhAnThuongList != null) {
            for (BenhAn benhAn : benhAnThuongList) {
                if(benhAn instanceof BenhAnThuong){
                    System.out.println(benhAn);
                }
            }
        } else {
            System.out.println("Danh sách bệnh án hiện tại đang trống.");
            System.out.println("----------****-----------");
        }
    }

    @Override
    public void themMoiBenhNhan() {
//        String maBenhAn;
//        boolean check = true;
//        do {
//            System.out.println("Hãy nhập mã bệnh bệnh án bạn muốn thêm ");
//            maBenhAn = RegexData.regexString(input.nextLine(), ID_BENHAN_REGEX, "Vui lòng nhập mã bệnh án theo định dạng BA-XXX, với XXX là các kí tự số.");
//            if (timMaBenhAn(maBenhAn) == null) {
//                check = false;
//            } else {
//                System.out.println("Mã bệnh án bạn nhâp đã tồn tại");
//            }
//        } while (check);

        System.out.println("Hãy nhập mã bệnh an ");
        String maBenhAn = RegexData.regexString(input.nextLine(), ID_BENHAN_REGEX, "Vui lòng nhập mã bệnh án theo định dạng BA-XXX, với XXX là các kí tự số.");

        System.out.println("Hãy nhập mã bệnh nhân ");
        String maBenhNhan = RegexData.regexString(input.nextLine(), ID_BENHNHAN_REGEX, "Vui lòng nhập mã bệnh nhân theo định dạng BN-XXX, với XXX là các kí tự số.");

        System.out.println("Hãy nhập tên bệnh nhân ");
        String tenBenhNhan = RegexData.regexString(input.nextLine(), ID_NAME_REGEX, "Vui lòng nhập tên bệnh nhân theo định dạng BN-XXX, với XXX là các kí tự số.");

        System.out.println("Hãy nhập ngày nhập viện");
        String ngayNhapVien = RegexData.regexString(input.nextLine(), BIRTHDAY_REGEX, "Vui lòng nhập ngày theo định dạng dd/MM/yyyy");

        System.out.println("Hãy nhập ngày ra viện");
        String ngayRaVien = RegexData.regexString(input.nextLine(), BIRTHDAY_REGEX, "Vui lòng nhập ngày theo định dạng dd/MM/yyyy");

        System.out.println("Hãy nhập lý do nhập viện ");
        String lyDoNhapVien = input.nextLine();

        System.out.println("Hãy nhập phí nằm viện ");
        String phiNamVien = input.nextLine();
        soThuTu++;
        benhAnThuongList.add(new BenhAnThuong(soThuTu, maBenhAn, maBenhNhan, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien, phiNamVien));
        ReadWriteFile.writeFile(benhAnThuongList, "src\\exam_2\\data\\sanphamnhapkhau.csv");

        System.out.println("Thêm mới bệnh án thường thành công");
        System.out.println("-------------*****-------------");
    }

    @Override
    public void xoaBenhNhan() {
        System.out.println("Hãy nhập mã bệnh bệnh án muốn xóa ");
        String maBenhAn = input.nextLine();
        BenhAnThuong benhAnThuong = timMaBenhAn(maBenhAn);
        boolean check = true;
        if (benhAnThuong != null) {
            do {
                System.out.println("Bạn muốn xóa bệnh án có mã " + maBenhAn + "?\n"
                        + "1. Yes\n" + "2. No");
                int choice = 0;
                try {
                    choice = Integer.parseInt(input.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Hãy nhập số");
                }
                switch (choice) {
                    case 1:
                        benhAnThuongList.remove(benhAnThuong);
                        ReadWriteFile.writeFile(benhAnThuongList, "src\\exam_2\\data\\sanphamnhapkhau.csv");
                        System.out.println("Đã xóa " + maBenhAn + " thành công");
                        System.out.println("-------------*****-------------");
                        xemDanhSachBenhNhan();
                        check = false;
                        break;
                    case 2:
                        Controller.displayMainMenu();
                        break;
                    default:
                        System.out.println("Hãy chọn yes hoặc no");
                }
            } while (check);
        } else {
            System.out.println("Mã bệnh án bạn nhâp chưa tồn tại nên không thể xóa");
            System.out.println("-------------*****-------------");
        }
    }
}