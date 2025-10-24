package src.model;

public class KhachThue extends Nguoi {
    private String ten;
    private String sdt;
    private Boolean xe;
    private String bienSoXe;

    public KhachThue(String ten, String sdt, Boolean xe, String bienSoXe){
        this.ten = ten;
        this.sdt = sdt;
        this.xe = xe;
        this.bienSoXe = bienSoXe;
    }
}
