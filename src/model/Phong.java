package src.model;

public interface IHienThi { // dòng này mới thêm
    void hienThi();         // dòng này mới thêm
}

public abstract class Phong implements IHienThi { //dòng này mới thêm
    private String maPhong;
    private Double giaThue;
    private HopDong hopDong;
    private KhachThue nguoiDungTen;

    public Phong(String maPhong, Double giaThue, HopDong hopDong, KhachThue nguoiDungTen) {
        this.maPhong = maPhong;
        this.giaThue = giaThue;
        this.hopDong = hopDong;
        this.nguoiDungTen = nguoiDungTen;
    }

    public abstract String loaiPhong();

    public String getMaPhong() {
        return maPhong;
    }

    public Double getGiaThue() {
        return giaThue;
    }

    public String getLoaiPhong() {
        return loaiPhong();
    }

    public KhachThue getNguoiDungTen() {
        return nguoiDungTen;
    }
    @Override //dòng này mới thêm
    public void hienThi() { // dòng này mới thêm
        System.out.println("Phong: " + maPhong + " (" + loaiPhong() + "), Gia: " + getGiaThue());
    }
}