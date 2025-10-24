package src.model;

public class KhachThue extends Nguoi {
    private String ten;
    private String sdt;
    private Boolean xe;
    private String bienSoXe;

    public KhachThue(String ten, String sdt, Boolean xe, String bienSoXe) {
        this.ten = ten;
        this.sdt = sdt;
        this.xe = xe;
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

    public Boolean getXe() {
        return xe;
    }

    // public void getNguoiDungTen() {
    //     System.out.println("Ten khach hang: " + nguoiDungTen.getTen());
    //     System.out.println("sdt: " + nguoiDungTen.getSdt());
    //     if (nguoiDungTen.getXe()) {
    //         System.out.println("Bien so xe: " + nguoiDungTen.getBienSoXe());
    //     }
    // }
}
