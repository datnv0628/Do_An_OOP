package src.model;

public class PhongKhongGac extends Phong {

    public PhongKhongGac(String maPhong, double giaThue, KhachThue nguoiDungTen, HopDong hopDong) {
        super(maPhong, giaThue, hopDong, nguoiDungTen);
    }

    @Override
    public String loaiPhong() {
        return "Phòng không gác";
    }
}
