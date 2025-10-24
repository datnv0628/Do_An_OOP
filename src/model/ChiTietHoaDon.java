package src.model;

public class ChiTietHoaDon {
    private int soDien;
    private int soXe;

    private static final double GIA_DIEN = 3500;
    private static final double GIA_NUOC = 60000;
    private static final double GIA_XE = 100000;

    public ChiTietHoaDon(int soDien, int soXe){
        this.soDien = soDien;
        this.soXe = soXe;
    }

    public double TinhDienNuocXe() {
        return (GIA_DIEN * soDien) + GIA_NUOC + (soXe * GIA_XE);
    }
}
