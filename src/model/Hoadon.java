package src.model;

import java.time.LocalDate;

public class HoaDon {
    private String maHoaDon;
    private LocalDate ngayHoaDon;
    private Phong phong;
    private ChiTietHoaDon chiTietHoaDon;

    public HoaDon(String mhd, LocalDate date, Phong p, ChiTietHoaDon detail) {
        this.maHoaDon = mhd;
        this.ngayHoaDon = date;
        this.phong = p;
        this.chiTietHoaDon = detail;
    }

    public Double tinhTongTien() {
        return phong.getGiaThue() + chiTietHoaDon.TinhDienNuocXe();
    }

    public void hienThiHoaDon() {
        System.out.println("=== HOA DON ===");
        System.out.println("Phong: " + phong.getMaPhong() + " (" + phong.getLoaiPhong() + ")");
        System.out.println("Nguoi thue: " + phong.getNguoiDungTen());
        System.out.println("Tien Thue: " + phong.getGiaThue());
        System.out.println("Tien dien/ nuoc/ xe: " + chiTietHoaDon.TinhDienNuocXe());
        System.out.println("Tong cong: " + tinhTongTien());
    }
}
