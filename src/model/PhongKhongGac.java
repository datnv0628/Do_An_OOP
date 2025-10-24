package src.model;

public class PhongKhongGac extends Phong {

    public PhongKhongGac(String maPhong, double giaThue, Boolean trangThai, KhachThue nguoiDungTen, HopDong hopDong) {
        super(maPhong, giaThue, hopDong, trangThai, nguoiDungTen);
    }

    @Override
    public String loaiPhong() {
        return "Phong khong gac";
    }
}
