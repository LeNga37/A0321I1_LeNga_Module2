package exam_2.models;

import java.io.Serializable;

public abstract class BenhAn implements Serializable {
    private int soThuTu;
    private String maBenhAn;
    private String maBenhNhan;
    private String tenBenhNhan;
    private String ngayNhapVien;
    private String ngayRaVien;
    private String lyDoNhapVien;

    private static final long serialVersionUID = 1050690682087895098L;

    public BenhAn(){}

    public abstract void  hienThiThongTinBenhAn();

    public BenhAn(int soThuTu, String maBenhAn,String maBenhNhan, String tenBenhNhan, String ngayNhapVien, String ngayRaVien, String lyDoNhapVien) {
        this.soThuTu = soThuTu;
        this.maBenhAn = maBenhAn;
        this.maBenhNhan=maBenhNhan;
        this.tenBenhNhan = tenBenhNhan;
        this.ngayNhapVien = ngayNhapVien;
        this.ngayRaVien = ngayRaVien;
        this.lyDoNhapVien = lyDoNhapVien;
    }

    public int getSoThuTu() {
        return soThuTu;
    }

    public void setSoThuTu(int soThuTu) {
        this.soThuTu = soThuTu;
    }

    public String getMaBenhAn() {
        return maBenhAn;
    }

    public void setMaBenhAn(String maBenhAn) {
        this.maBenhAn = maBenhAn;
    }

    public String getmaBenhNhan() {
        return maBenhNhan;
    }

    public void setmaBenhNhan(String maBenhNhan) {
        this.maBenhNhan = maBenhNhan;
    }

    public String getTenBenhNhan() {
        return tenBenhNhan;
    }

    public void setTenBenhNhan(String tenBenhNhan) {
        this.tenBenhNhan = tenBenhNhan;
    }

    public String getNgayNhapVien() {
        return ngayNhapVien;
    }

    public void setNgayNhapVien(String ngayNhapVien) {
        this.ngayNhapVien = ngayNhapVien;
    }

    public String getNgayRaVien() {
        return ngayRaVien;
    }

    public void setNgayRaVien(String ngayRaVien) {
        this.ngayRaVien = ngayRaVien;
    }

    public String getLyDoNhapVien() {
        return lyDoNhapVien;
    }

    public void setLyDoNhapVien(String lyDoNhapVien) {
        this.lyDoNhapVien = lyDoNhapVien;
    }

    @Override
    public String toString() {
        return soThuTu + "," + maBenhAn + "," + maBenhNhan + ","+ tenBenhNhan + "," + ngayNhapVien + "," + ngayRaVien + "," + lyDoNhapVien;
//                "BenhAn{" +
//                "soThuTu='" + soThuTu + '\'' +
//                ", maBenhAn='" + maBenhAn + '\'' +
//                ", tenBenhNhan='" + tenBenhNhan + '\'' +
//                ", ngayNhapVien='" + ngayNhapVien + '\'' +
//                ", ngayRaVien='" + ngayRaVien + '\'' +
//                ", lyDoNhapVien='" + lyDoNhapVien + '\'' +
//                '}';
    }
}

