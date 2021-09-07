package exam.services;

import exam.controllers.Controller;
import exam.models.SanPham;
import exam.models.SanPhamXuatKhau;
import exam.utils.ReadWriteFile;
import exam.utils.RegexData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SanPhamXuatKhauImpl implements ChucNang {
    static String filePath = "src\\exam\\data\\sanphamxuatkhau.csv";
    public static Scanner input = new Scanner(System.in);
    private static final String MA_SANPHAM_REGEX = "^(SP)\\d{5}$";
    private static final String COMMON_REGEX = "^(.+)$";
    private static final String NUMBER_REGEX = "^(\\d+)$";


    @Override
    public void themMoiSanPham() {
        List<SanPhamXuatKhau> danhSachSanPham = getDanhSachSanPhamXuatKhau();
        int soThuTu = 1;
        if (!danhSachSanPham.isEmpty()) {
            SanPham sPCuoiCung = danhSachSanPham.get(danhSachSanPham.size() - 1);
            soThuTu = sPCuoiCung.getSoThuTu() + 1;
        }
        System.out.println("Hãy nhập mã sản phẩm ");
        String maSanPham = exam_2.utils.RegexData.regexString(input.nextLine(), MA_SANPHAM_REGEX, "Vui lòng nhập mã sản phẩm theo định dạng SPXXXXX, XXXXX là các số");

        System.out.println("Hãy nhập tên sản phẩm ");
        String tenSanPham = exam_2.utils.RegexData.regexString(input.nextLine(), COMMON_REGEX, "Vui lòng nhập tên sản phẩm");

        System.out.println("Hãy nhập giá bán ");
        String giaBan = exam_2.utils.RegexData.regexString(input.nextLine(), NUMBER_REGEX, "Vui lòng nhập số dương lớn hơn 0");

        System.out.println("Hãy nhập số lượng");
        String soLuong = exam_2.utils.RegexData.regexString(input.nextLine(), NUMBER_REGEX, "Vui lòng nhập số dương lớn hơn 0");

        System.out.println("Hãy nhập nhà sản xuất");
        String nhaSanXuat = exam_2.utils.RegexData.regexString(input.nextLine(), COMMON_REGEX, "Vui lòng nhập nhà sản xuất");

        System.out.println("Hãy nhập giá xuất khẩu ");
        String giaXuatKhau = exam_2.utils.RegexData.regexString(input.nextLine(), NUMBER_REGEX, "Vui lòng nhập số dương lớn hơn 0");

        System.out.println("Hãy nhập quốc gia nhập khẩu");
        String quocGiaNhapSanPham = exam_2.utils.RegexData.regexString(input.nextLine(), COMMON_REGEX, "Vui lòng nhập quốc gia nhập khẩu");

        SanPhamXuatKhau sanPhamXuatKhau = new SanPhamXuatKhau(soThuTu, maSanPham, tenSanPham, giaBan, soLuong, nhaSanXuat, giaXuatKhau, quocGiaNhapSanPham);
        danhSachSanPham.add(sanPhamXuatKhau);
        ReadWriteFile.writeFile(danhSachSanPham, filePath);

        System.out.println("Thêm mới sản phẩm xuất khẩu thành công");
        System.out.println("-------------*****-------------");
    }

    private SanPhamXuatKhau timSanPham(String maSanPham){
        List<SanPhamXuatKhau> danhSachSanPham = (List<SanPhamXuatKhau>) ReadWriteFile.readFile(filePath);
        maSanPham = RegexData.regexString(maSanPham, MA_SANPHAM_REGEX, "Vui lòng nhập mã bệnh án theo định dạng BA-XXX, với XXX là các kí tự số.");
        if (!danhSachSanPham.isEmpty()) {
            for (SanPhamXuatKhau sanPham : danhSachSanPham) {
                if (sanPham.getMaSanPham().equals(maSanPham)) {
                    return sanPham;
                }
            }
        }
        return null;
    }

    @Override
    public void xoaSanPham() {
        List<SanPhamXuatKhau> danhSachSanPham= (List<SanPhamXuatKhau>)ReadWriteFile.readFile(filePath);
        System.out.println("Hãy nhập mã sản phẩm muốn xóa ");
        boolean check = true;
        String maSanPham = input.nextLine();
        SanPhamXuatKhau sanPham = timSanPham(maSanPham);

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
                        List<SanPhamXuatKhau> newList=new ArrayList<>();
                        for(SanPhamXuatKhau sp:danhSachSanPham){
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
            System.out.println("Mã san pham bạn nhâp chưa tồn tại nên không thể xóa");
            System.out.println("-------------*****-------------");
        }

    }

    @Override
    public void xemDanhSachSanPham() {
        List<SanPhamXuatKhau>danhSachSanPham =getDanhSachSanPhamXuatKhau();
        if (!danhSachSanPham.isEmpty()) {
            for (SanPhamXuatKhau sanPham : danhSachSanPham) {
                    System.out.println(sanPham);
            }
        } else {
            System.out.println("Danh sách sản phẩm xuất khẩu hiện tại đang trống.");
            System.out.println("----------****-----------");
        }
    }


    @Override
    public void timKiemSanPham() {
        List<SanPhamXuatKhau> danhSachSanPham= (List<SanPhamXuatKhau>)ReadWriteFile.readFile(filePath);
        System.out.println("Hãy nhập mã sản phẩm hoặc tên sản phẩm muốn tìm kiếm ");
        boolean tonTai = false;
        String timKiem = input.nextLine();
        for (SanPhamXuatKhau sanPham: danhSachSanPham) {
            if(sanPham.getMaSanPham().equals(timKiem)||sanPham.getTenSanPham().equals(timKiem)){
                System.out.println(sanPham);
                tonTai=true;
            }
        }
        if(!tonTai){
            System.out.println("Không tồn tại sản phẩm muốn tìm kiếm");
        }
    }

    private List<SanPhamXuatKhau> getDanhSachSanPhamXuatKhau() {
        List<SanPhamXuatKhau> danhSachSPXuatKhau = (List<SanPhamXuatKhau>) ReadWriteFile.readFile(filePath);
        if (danhSachSPXuatKhau == null) {
            return new ArrayList<>();
        }
        return danhSachSPXuatKhau;
    }
}

