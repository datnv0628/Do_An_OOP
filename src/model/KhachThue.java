package src.model;

public class KhachThue extends Nguoi {
    private String ten;
    private String sdt;
    private String bienSoXe;

    public KhachThue(String ten, String sdt, String bienSoXe) {
        this.ten = ten;
        this.sdt = sdt;
        this.bienSoXe = bienSoXe;
    }

    public String getTen() {
        return ten;
    }

    public String getSdt() {
        return sdt;
    }

    public String getBienSoXe() {
        return bienSoXe;
    }

    // public void getNguoiDungTen() {
    //     System.out.println("Ten khach hang: " + nguoiDungTen.getTen());
    //     System.out.println("sdt: " + nguoiDungTen.getSdt());
    //     if (nguoiDungTen.getXe()) {
    //         System.out.println("Bien so xe: " + nguoiDungTen.getBienSoXe());
    //     }
    // }
}
