package exam_2.models;

import java.io.Serializable;

public class BenhAnThuong extends BenhAn implements Serializable {
    private static final long serialVersionUID = -6109600531179816350L;
    private String phiNamVien;

    public BenhAnThuong() {
    }

    public BenhAnThuong(String phiNamVien) {
        this.phiNamVien = phiNamVien;
    }

    public BenhAnThuong(int soThuTu, String maBenhAn,String maBenhNhan,String tenBenhNhan, String ngayNhapVien, String ngayRaVien, String lyDoNhapVien, String phiNamVien) {
        super(soThuTu, maBenhAn,maBenhNhan, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien);
        this.phiNamVien = phiNamVien;
    }

    public String getPhiNamVien() {
        return phiNamVien;
    }

    public void setPhiNamVien(String phiNamVien) {
        this.phiNamVien = phiNamVien;
    }

    @Override
    public void hienThiThongTinBenhAn() {
        System.out.println(super.toString()+","+this.phiNamVien);
    }

    @Override
    public String toString() {
        return super.toString() + "," + phiNamVien;
//                this.getSoThuTu() + "," + this.getMaBenhAn() + "," + this.getTenBenhNhan() + "," + this.getNgayNhapVien() + "," +
//                this.getNgayRaVien() + "," + this.getLyDoNhapVien() + "," + this.phiNamVien;
    }
}
