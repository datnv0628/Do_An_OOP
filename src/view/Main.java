package src.view;

import src.model.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        KhachThue kh = new KhachThue("Dat", "0123456789", true, "59A1-12345");
        HopDong hopDong = new HopDong("HD01", LocalDate.now(), kh);

        Phong phong = new PhongCoGac("P101", 2500000, kh, hopDong);

        ChiTietHoaDon cthd = new ChiTietHoaDon(80, 1);
        HoaDon hd = new HoaDon("HD001", LocalDate.now(), phong, cthd);

        hd.hienThiHoaDon();
    }
}
