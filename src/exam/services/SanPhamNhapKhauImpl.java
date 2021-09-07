package exam.services;

import exam.controllers.Controller;
import exam.models.SanPham;
import exam.models.SanPhamNhapKhau;
import exam.utils.ReadWriteFile;
import exam.utils.RegexData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SanPhamNhapKhauImpl implements ChucNang{
    static String filePath = "src\\exam\\data\\sanphamnhapkhau.csv";
    public static Scanner input = new Scanner(System.in);
    private static final String MA_SANPHAM_REGEX = "^(SP)\\d{5}$";
    private static final String COMMON_REGEX = "^(.+)$";
    private static final String NUMBER_REGEX = "^(\\d+)$";
    @Override
    public void themMoiSanPham() {
        List<SanPhamNhapKhau> danhSachSanPham = getDanhSachSanPhamNhapKhau();
        int soThuTu = 1;
        if (!danhSachSanPham.isEmpty()) {
            SanPham sPCuoiCung = danhSachSanPham.get(danhSachSanPham.size() - 1);
            soThuTu = sPCuoiCung.getSoThuTu() + 1;
        }
        System.out.println("Hãy nhập mã sản phẩm ");
        String maSanPham = RegexData.regexString(input.nextLine(), MA_SANPHAM_REGEX, "Vui lòng nhập mã sản phẩm theo định dạng SPXXXXX, XXXXX là các số");

        System.out.println("Hãy nhập tên sản phẩm ");
        String tenSanPham =RegexData.regexString(input.nextLine(), COMMON_REGEX, "Vui lòng nhập tên sản phẩm");

        System.out.println("Hãy nhập giá bán ");
        String giaBan = RegexData.regexString(input.nextLine(), NUMBER_REGEX, "Vui lòng nhập số dương lớn hơn 0");

        System.out.println("Hãy nhập số lượng");
        String soLuong = RegexData.regexString(input.nextLine(), NUMBER_REGEX, "Vui lòng nhập số dương lớn hơn 0");

        System.out.println("Hãy nhập nhà sản xuất");
        String nhaSanXuat = RegexData.regexString(input.nextLine(), COMMON_REGEX, "Vui lòng nhập nhà sản xuất");

        System.out.println("Hãy nhập giá nhập khẩu");
        String giaNhapKhau = RegexData.regexString(input.nextLine(), NUMBER_REGEX, "Vui lòng nhập giá nhập khẩu");

        System.out.println("Hãy nhập tỉnh thành nhập ");
        String tinhThanhNhap = RegexData.regexString(input.nextLine(), COMMON_REGEX, "Vui lòng nhập tỉnh thành nhập khẩu");

        System.out.println("Hãy nhập thuế nhập khẩu ");
        String thueNhapKhau = RegexData.regexString(input.nextLine(), NUMBER_REGEX, "Vui lòng nhập số dương lớn hơn 0");

        SanPhamNhapKhau sanPhamNhapKhau = new SanPhamNhapKhau(soThuTu, maSanPham, tenSanPham, giaBan, soLuong, nhaSanXuat, giaNhapKhau, tinhThanhNhap,thueNhapKhau);
        danhSachSanPham.add(sanPhamNhapKhau);
        ReadWriteFile.writeFile(danhSachSanPham, filePath);

        System.out.println("Thêm mới sản phẩm nhập khẩu thành công");
        System.out.println("-------------*****-------------");
    }

    private SanPhamNhapKhau timSanPham(String maSanPham){
        List<SanPhamNhapKhau> danhSachSanPham = (List<SanPhamNhapKhau>) ReadWriteFile.readFile(filePath);
        maSanPham = RegexData.regexString(maSanPham, MA_SANPHAM_REGEX, "Vui lòng nhập mã sản phẩm theo định dạng BA-XXX, với XXX là các kí tự số.");
        if (!danhSachSanPham.isEmpty()) {
            for (SanPhamNhapKhau sanPham : danhSachSanPham) {
                if (sanPham.getMaSanPham().equals(maSanPham)) {
                    return sanPham;
                }
            }
        }
        return null;
    }

    @Override
    public void xoaSanPham() {
        List<SanPhamNhapKhau> danhSachSanPham= (List<SanPhamNhapKhau>)ReadWriteFile.readFile(filePath);
        System.out.println("Hãy nhập mã sản phẩm muốn xóa ");
        boolean check = true;
        String maSanPham = input.nextLine();
        SanPhamNhapKhau sanPham = timSanPham(maSanPham);

        if (sanPham != null) {
            do {
                System.out.println("Bạn muốn xóa sản phẩm có mã " + maSanPham + "?\n"
                        + "1. Yes\n" + "2. No");
                int choice = 0;
                try {
                    choice = Integer.parseInt(input.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Hãy nhập số");
                }
                switch (choice) {
                    case 1:
                        List<SanPhamNhapKhau> newList=new ArrayList<>();
                        for(SanPhamNhapKhau sp:danhSachSanPham){
                            if(!sp.getMaSanPham().equals(sanPham.getMaSanPham()) ){
                                newList.add(sp);
                            }
                        }
                        ReadWriteFile.writeFile(newList, filePath);
                        System.out.println("Đã xóa " + maSanPham + " thành công");
                        System.out.println("-------------*****-------------\n"+"Danh sách sản phẩm sau khi xóa");
                        xemDanhSachSanPham();
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
            System.out.println("Mã sản phẩm bạn nhâp chưa tồn tại nên không thể xóa");
            System.out.println("-------------*****-------------");
        }

    }

    @Override
    public void xemDanhSachSanPham() {
        List<SanPhamNhapKhau>danhSachSanPham =getDanhSachSanPhamNhapKhau();
        if (!danhSachSanPham.isEmpty()) {
            for (SanPhamNhapKhau sanPham : danhSachSanPham) {
                System.out.println(sanPham);
            }
        } else {
            System.out.println("Danh sách sản phẩm nhập khẩu hiện tại đang trống.");
            System.out.println("----------****-----------");
        }
    }

    @Override
    public void timKiemSanPham() {
        List<SanPhamNhapKhau> danhSachSanPham= (List<SanPhamNhapKhau>)ReadWriteFile.readFile(filePath);
        System.out.println("Hãy nhập mã sản phẩm hoặc tên sản phẩm muốn tìm kiếm ");
        boolean tonTai = false;
        String timKiem = input.nextLine();
        for (SanPhamNhapKhau sanPham: danhSachSanPham) {
            if(sanPham.getMaSanPham().equals(timKiem)||sanPham.getTenSanPham().equals(timKiem)){
                System.out.println(sanPham);
                tonTai=true;
            }
        }
        if(!tonTai){
            System.out.println("Không tồn tại sản phẩm muốn tìm kiếm");
        }

    }
    private List<SanPhamNhapKhau> getDanhSachSanPhamNhapKhau() {
        List<SanPhamNhapKhau> danhSachSanPham = (List<SanPhamNhapKhau>) ReadWriteFile.readFile(filePath);
        if (danhSachSanPham == null) {
            return new ArrayList<>();
        }
        return danhSachSanPham;
    }
}
