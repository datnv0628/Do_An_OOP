package src.model;

public class Phong {
    private String maPhong;
    private Double dienTich;
    private String giaThue;
    private Boolean trangThai;
    private String loaiPhong;

    public Phong(String maPhong, Double dienTich, String loaiPhong, String giaThue, Boolean trangThai) {
        this.maPhong = maPhong;
        this.dienTich = dienTich;
        this.loaiPhong = loaiPhong;
        this.giaThue = giaThue;
        this.trangThai = false;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String mp) {
        this.maPhong = mp;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dt) {
        this.dienTich = dt;
    }

    public String getLoaiPhong() {
        return loaiPhong;
    }

    public void setLoaiPhong(String lp) {
        this.loaiPhong = lp;
    }

    public String TinhGiaThue() {
        return loaiPhong.equals("Có Gác") ? "5.000.000" : "3.000.000";
    }

    public String getTrangThai() {
        return trangThai ? "Đã có người thuê" : "Còn trống";
    }

    public void setTrangThai(boolean tt) {
        this.trangThai = tt;
    }

    public void xem() {
        System.out.println("Mã phòng: " + maPhong);
        System.out.println("Diện tích: " + dienTich);
        System.out.println("Giá thuê: " + giaThue);
        System.out.println("Trạng thái:  " + trangThai);
    }

}