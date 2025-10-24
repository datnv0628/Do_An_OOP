package src.model;

public class PhongCoGac extends Phong {
    // private double phiCoGac = 500000;

    public PhongCoGac(String maPhong, double giaThue, Boolean trangThai, KhachThue nguoiDungTen, HopDong hopDong) {
        super(maPhong, giaThue,  hopDong, trangThai, nguoiDungTen);
    }

    @Override
    public String loaiPhong() {
        return "Phong co gac";
    }

    @Override
    public Double getGiaThue() {
        return super.getGiaThue();
    }
}
