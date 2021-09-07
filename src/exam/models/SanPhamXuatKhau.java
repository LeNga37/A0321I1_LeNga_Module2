package exam.models;

public class SanPhamXuatKhau extends SanPham {
    private String giaXuatKhau;
    private String quocGiaNhapSanPham;

    public SanPhamXuatKhau() {

    }

    public SanPhamXuatKhau(String giaXuatKhau, String quocGiaNhapSanPham) {
        this.giaXuatKhau = giaXuatKhau;
        this.quocGiaNhapSanPham = quocGiaNhapSanPham;
    }

    public SanPhamXuatKhau(int soThuTu, String maSanPham, String tenSanPham, String giaBan, String soLuong, String nhaSanXuat,String giaXuatKhau, String quocGiaNhapSanPham) {
        super(soThuTu, maSanPham,tenSanPham, giaBan, soLuong, nhaSanXuat);
        this.giaXuatKhau = giaXuatKhau;
        this.quocGiaNhapSanPham = quocGiaNhapSanPham;
    }

    public String getGiaXuatKhau() {
        return giaXuatKhau;
    }

    public void setGiaXuatKhau(String giaXuatKhau) {
        this.giaXuatKhau = giaXuatKhau;
    }

    public String getQuocGiaNhapSanPham() {
        return quocGiaNhapSanPham;
    }

    public void setQuocGiaNhapSanPham(String quocGiaNhapSanPham) {
        this.quocGiaNhapSanPham = quocGiaNhapSanPham;
    }

    @Override
    public void hienThiThongTinSanPham() {
        System.out.println(super.toString() + "," + this.giaXuatKhau + "," + this.quocGiaNhapSanPham);
    }

    @Override
    public String toString() {
        return super.toString()+ "," + this.giaXuatKhau + "," + this.quocGiaNhapSanPham;

    }
}
