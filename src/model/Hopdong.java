package src.model;

import java.time.LocalDate;

public class HopDong {
    private String maHopDong;
    private LocalDate Date;
    private KhachThue khachThue;


    public HopDong(String id, LocalDate date, KhachThue kh){
        this.maHopDong = id;
        this.Date = date;
        this.khachThue = kh;
    }
}
