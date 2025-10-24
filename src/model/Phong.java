package src.model;

public abstract class Phong {
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

    public void getNguoiDungTen() {
        System.out.println("Ten khach hang: " + nguoiDungTen.getTen());
        System.out.println("sdt: " + nguoiDungTen.getSdt());
        if (nguoiDungTen.getXe()) {
            System.out.println("Bien so xe: " + nguoiDungTen.getBienSoXe());
        }
    }
}