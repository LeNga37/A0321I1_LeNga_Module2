package exam.models;

import java.io.Serializable;

public class SanPhamNhapKhau extends SanPham implements Serializable {
    private static final long serialVersionUID = -6109600531179816350L;
    private String giaNhapKhau;
    private String tinhThanhNhap;
    private String thueNhapKhau;

    public SanPhamNhapKhau() {
    }

    public SanPhamNhapKhau(String giaNhapKhau,String tinhThanhNhap,String thueNhapKhau) {
        this.giaNhapKhau = giaNhapKhau;
        this.tinhThanhNhap = tinhThanhNhap;
        this.thueNhapKhau = thueNhapKhau;
    }

    public SanPhamNhapKhau(int soThuTu, String maSanPham, String tenSanPham, String giaBan, String soLuong, String nhaSanXuat,String giaNhapKhau,String tinhThanhNhap,String thueNhapKhau) {
        super(soThuTu, maSanPham,tenSanPham, giaBan, soLuong, nhaSanXuat);
        this.giaNhapKhau = giaNhapKhau;
        this.tinhThanhNhap = tinhThanhNhap;
        this.thueNhapKhau = thueNhapKhau;
    }

    public String getGiaNhapKhau() {
        return giaNhapKhau;
    }

    public void setGiaNhapKhau(String giaNhapKhau) {
        this.giaNhapKhau = giaNhapKhau;
    }

    public String getTinhThanhNhap() {
        return tinhThanhNhap;
    }

    public void setTinhThanhNhap(String tinhThanhNhap) {
        this.tinhThanhNhap = tinhThanhNhap;
    }

    public String getThueNhapKhau() {
        return thueNhapKhau;
    }

    public void setThueNhapKhau(String thueNhapKhau) {
        this.thueNhapKhau = thueNhapKhau;
    }

    @Override
    public void hienThiThongTinSanPham() {
        System.out.println(super.toString()+","+this.giaNhapKhau+","+this.tinhThanhNhap+","+this.thueNhapKhau);
    }

    @Override
    public String toString() {
        return super.toString() + "," + this.giaNhapKhau+","+this.tinhThanhNhap+","+this.thueNhapKhau;
//                this.getSoThuTu() + "," + this.getMaBenhAn() + "," + this.getTenBenhNhan() + "," + this.getNgayNhapVien() + "," +
//                this.getNgayRaVien() + "," + this.getLyDoNhapVien() + "," + this.phiNamVien;
    }
}
