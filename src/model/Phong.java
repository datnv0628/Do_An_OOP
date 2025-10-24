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

    public String getMaPhong() { return maPhong; }
    public Double getGiaThue() { return giaThue; }
    public String getLoaiPhong() { return loaiPhong(); }
    public KhachThue getNguoiDungTen() { return nguoiDungTen; }
    public Boolean getTrangThai() { return trangThai; }
    public HopDong getHopDong() { return hopDong; }

    public void setGiaThue(double newPrice) { this.giaThue = newPrice; }
    public void setTrangThai(Boolean tt) { this.trangThai = tt; }
    public void setNguoiDungTen(KhachThue newUser) { this.nguoiDungTen = newUser; }
    public void setHopDong(HopDong hp) { this.hopDong = hp; }
}