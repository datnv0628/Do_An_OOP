package src.model;

import java.time.LocalDate;

public interface IHienThi { // dòng này mới thêm
     void hienThi();         // dòng này mới thêm
 }

public class HopDong implements IHienThi { //dòng này mới thêm
    private String maHopDong;
    private LocalDate Date;
    private KhachThue khachThue;


    public HopDong(String id, LocalDate date, KhachThue kh){
        this.maHopDong = id;
        this.Date = date;
        this.khachThue = kh;
    }
    @Override //dòng này mới thêm
    public void hienThi() { // dòng này mới thêm
        System.out.println("Hop Dong: " + maHopDong + ", Khach Thue: " + khachThue.getTen() + ", Ngay: " + Date);
    }
}
