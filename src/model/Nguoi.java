package src.model;

import java.time.LocalDate;

public class Nguoi {
    private String ten;
    private String cccd;
    private String gioitinh;
    private String sdt;
    private LocalDate ngaysinh;

    public Nguoi(String ten, String cccd,  String gioitinh, String sdt, LocalDate ngaysinh){
      this.ten = ten;
      this.cccd = cccd;
      this.gioitinh = gioitinh;
      this.sdt = sdt;
      this.ngaysinh = ngaysinh;
    }

    public String getTen() {
        return ten;
    }
      public void setTen(String n) {
        this.ten = n;
      }
    public String getCccd() {
        return cccd;
      }
      public void setCccd(String n) {
        this.cccd = n;
      }
    public String getGioiTinh() {
        return gioitinh;
    }
     public void setGioiTinh(String n) {
        this.gioitinh = n;
      }
    public String getSdt() {
        return sdt;
    }
     public void setSdt(String n) {
        this.sdt = n;
    }
    public LocalDate getNgaySinh() {
        return ngaysinh;
    }
     public void setNgaySinh(LocalDate n) {
        this.ngaysinh = n;
     }
}
