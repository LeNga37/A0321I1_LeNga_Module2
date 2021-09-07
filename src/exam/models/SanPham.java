package exam.models;

import java.io.Serializable;

public abstract class SanPham implements Serializable {
    private int soThuTu;
    private String maSanPham;
    private String tenSanPham;
    private String giaBan;
    private String soLuong;
    private String nhaSanXuat;

    private static final long serialVersionUID = 1050690682087895098L;

    public SanPham(){}

    public abstract void  hienThiThongTinSanPham();

    public SanPham(int soThuTu, String maSanPham, String tenSanPham, String giaBan, String soLuong, String nhaSanXuat) {
        this.soThuTu = soThuTu;
        this.maSanPham = maSanPham;
        this.tenSanPham=tenSanPham;
        this.giaBan = giaBan;
        this.soLuong = soLuong;
        this.nhaSanXuat = nhaSanXuat;
    }

    public int getSoThuTu() {
        return soThuTu;
    }

    public void setSoThuTu(int soThuTu) {
        this.soThuTu = soThuTu;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(String giaBan) {
        this.giaBan = giaBan;
    }

    public String getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(String soLuong) {
        this.soLuong = soLuong;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    @Override
    public String toString() {
        return soThuTu + "," + maSanPham + "," + tenSanPham + ","+ giaBan + "," + soLuong + "," + nhaSanXuat;
    }
}

