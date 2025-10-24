package src.model;

import java.time.LocalDate;

public class KhachThue extends Nguoi {
    private String bienSoXe;

    public KhachThue(String ten, String sdt,  String gioitinh, LocalDate ngaysinh, String cccd, String bienSoXe) {
        super( ten, cccd, gioitinh, sdt, ngaysinh);
        this.bienSoXe = bienSoXe;
    }



    public String getBienSoXe() {
        return bienSoXe;
    }
    public void setBienSoXe(String n) {
        this.bienSoXe = n;
    }
}
