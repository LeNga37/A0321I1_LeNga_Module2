package exam_2.services;


import exam_2.controllers.Controller;
import exam_2.models.BenhAn;
import exam_2.models.BenhAnVip;
import exam_2.utils.ReadWriteFile;
import exam_2.utils.RegexData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BenhAnVipImpl implements ChucNang {
    public static Scanner input = new Scanner(System.in);
    static String filePath="src\\exam_2\\data\\sanphamnhapkhau.csv";
    private static final String ID_BENHAN_REGEX = "^(BA)-\\d{3}$";
    private static final String ID_BENHNHAN_REGEX = "^(BN)-\\d{3}$";
    private static final String ID_NAME_REGEX = "^(([A-Z][a-z]+)(| ))+$";
    private static final String BIRTHDAY_REGEX = "(^(((0[1-9]|1[0-9]|2[0-8])[\\/](0[1-9]|1[012]))|((29|30|31)[\\/]" +
            "(0[13578]|1[02]))|((29|30)[\\/](0[4,6,9]|11)))[\\/](19|[2-9][0-9])\\d\\d$)|(^29[\\/]02[\\/](19|[2-9][0-9])" +
            "(00|04|08|12|16|20|24|28|32|36|40|44|48|52|56|60|64|68|72|76|80|84|88|92|96)$)";

//    public BenhAn timMaBenhAn(String maBenhAn) {
//        List<BenhAn>benhAnList = (List<BenhAn>) ReadWriteFile.readFile(filePath);
//        maBenhAn = RegexData.regexString(maBenhAn, ID_BENHAN_REGEX, "Vui lòng nhập mã bệnh án theo định dạng BA-XXX, với XXX là các kí tự số.");
//        if (benhAnList != null) {
//            for (BenhAn benhAn : benhAnList) {
//                if (benhAn.getMaBenhAn().equals(maBenhAn)) {
//                    return benhAn;
//                }
//            }
//        }
//        return null;
//    }

    public BenhAn timMaBenhAn(String maBenhAn){
        List<BenhAn>benhAnList = (List<BenhAn>) ReadWriteFile.readFile(filePath);
        maBenhAn = RegexData.regexString(maBenhAn, ID_BENHAN_REGEX, "Vui lòng nhập mã bệnh án theo định dạng BA-XXX, với XXX là các kí tự số.");
        if (benhAnList != null) {
            for (BenhAn benhAn : benhAnList) {
                if (benhAn.getMaBenhAn().equals(maBenhAn)) {
                    return benhAn;
                }
            }
        }
        return null;
    }
    @Override
    public void xemDanhSachBenhNhan() {
        List<BenhAn> benhAnList=getBenhAnList();
        if (!benhAnList.isEmpty()) {
            for (BenhAn benhAn : benhAnList) {
                if(benhAn instanceof BenhAnVip){
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
        List<BenhAn> benhAnList=getBenhAnList();
        int soThuTu=1;
        if(!benhAnList.isEmpty()){
            BenhAn benhAnCuoiCung=benhAnList.get(benhAnList.size()-1);
            soThuTu=benhAnCuoiCung.getSoThuTu()+1;
        }

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

        String loaiVip = null;
        boolean check = true;
        do {
            System.out.println("Hãy chọn loại Vip\n"
                    + "1. VIP I\n" + "2. VIP II\n" + "3. VIP III");
            int choice = -1;
            try {
                choice = Integer.parseInt(input.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Hãy nhập số");
            }
            switch (choice) {
                case 1:
                    loaiVip = "VIP I";
                    System.out.println(loaiVip);
                    check = false;
                    break;
                case 2:
                    loaiVip = "VIP II";
                    System.out.println(loaiVip);
                    check = false;
                    break;
                case 3:
                    loaiVip = "VIP III";
                    System.out.println(loaiVip);
                    check = false;
                    break;
                default:
                    System.out.println("Hãy chọn 1 trong 3 loại VIP trên");
            }
        } while (check);

        System.out.println("Hãy nhập thoi Han Vip ");
        String thoiHanVip = RegexData.regexString(input.nextLine(), BIRTHDAY_REGEX, "Vui lòng nhập thời hạn VIP theo định dạng dd/MM/yyyy");

        BenhAnVip benhAnVip=new BenhAnVip(soThuTu, maBenhAn, tenBenhNhan, maBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien, loaiVip, thoiHanVip);
        benhAnList.add(benhAnVip);
        ReadWriteFile.writeFile(benhAnList, filePath);

        System.out.println("Thêm mới bệnh án VIP thành công");
        System.out.println("-------------*****-------------");
    }

    @Override
    public void xoaBenhNhan() {

        List<BenhAn>benhAnList = (List<BenhAn>) ReadWriteFile.readFile(filePath);
        System.out.println("Hãy nhập mã bệnh bệnh án muốn xóa ");
        boolean check = true;
        String maBenhAn = input.nextLine();
        BenhAn benhAnVip = timMaBenhAn(maBenhAn);

        if (benhAnVip != null) {
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
                        List<BenhAn> newList=new ArrayList<>();
                        for(BenhAn benhAn:benhAnList){
                            if(!benhAn.getMaBenhAn().equals(benhAnVip.getMaBenhAn()) ){
                                newList.add(benhAn);
                            }
                        }
                        System.out.println(newList);
                        ReadWriteFile.writeFile(newList, filePath);
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

    private List<BenhAn> getBenhAnList(){
        List<BenhAn> benhAnList = (List<BenhAn>) ReadWriteFile.readFile(filePath);
        if(benhAnList==null){
            return new ArrayList<>();
        }
        return benhAnList;
    }
}
