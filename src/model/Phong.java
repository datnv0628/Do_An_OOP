package src.model;

public abstract class Phong {
    private String maPhong;
    private Double giaThue;
    private HopDong hopDong;
    private KhachThue nguoiDungTen;
    private Boolean trangThai = false;

    public Phong(String maPhong, Double giaThue, HopDong hopDong, Boolean trangThai, KhachThue nguoiDungTen) {
        this.maPhong = maPhong;
        this.giaThue = giaThue;
        this.hopDong = hopDong;
        this.trangThai = trangThai;
        this.nguoiDungTen = nguoiDungTen;
    }

    public abstract String loaiPhong();

    public String getMaPhong() {
        return maPhong;
    }

    public Double getGiaThue() {
        return giaThue;
    }

    public void setGiaThue(Double newPrice) {
        this.giaThue = newPrice;
    }

    public String getLoaiPhong() {
        return loaiPhong();
    }

    public KhachThue getNguoiDungTen() {
        return nguoiDungTen;
    }

    public void setNguoiDungTen(KhachThue newUser) {
        this.nguoiDungTen = newUser;
    }

    public Boolean getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Boolean value) {
        this.trangThai = value;
    }

    public HopDong getHopDong() {
        return this.hopDong;
    }

    public void setHopDong(HopDong hp) {
        this.hopDong = hopDong;
    }

}