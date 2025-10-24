package service;

import java.io.*;
import java.util.*;
import src.model.*;

public class QuanLyPhong {
    private static final String FILE_PHONG = "data/phong.txt";
    private List<Phong> dsPhong = new ArrayList<>();

    public void docFile() {
        dsPhong.clear();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PHONG))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");

                String ma = parts[0];
                String loai = parts[1];
                double gia = Double.parseDouble(parts[2]);
                boolean trangThai = Boolean.parseBoolean(parts[3]);

                Phong p = null;

                if (loai.equalsIgnoreCase("Phong co gac")) {
                    p = new PhongCoGac(ma, gia, null, null, null);
                } else if (loai.equalsIgnoreCase("Phong khong co gac")) {
                    p = new PhongKhongGac(ma, gia, null, null, null);
                }

                p.setTrangThai(trangThai);

                if (trangThai && parts.length > 4) {
                    String ten = parts[4];
                    String hopDong = parts[5];

                    KhachThue kh = new KhachThue(ten, null, null);
                    HopDong hp = new HopDong(hopDong, null, kh);
                    p.setNguoiDungTen(kh);
                    p.setHopDong(hp);
                }

                dsPhong.add(p);
            }
        } catch (IOException e) {
            System.out.println("Loi doc file: " + e.getMessage());
        }
    }

    public void hienThiDanhSachPhong() {
        if (dsPhong.isEmpty()) {
            System.out.println("Danh sach phong trong");
            return;
        }

        for (Phong p : dsPhong) {
            System.out.println("-------------");
            System.out.println("ma phong: " + p.getMaPhong());
            System.out.println("loai phong: " + p.getLoaiPhong());
            System.out.println("gia thue: " + p.getGiaThue());
            System.out.println("trang thai: " + (p.getTrangThai() ? "Co khach" : "Trong"));

            if (p.getTrangThai() && p.getNguoiDungTen() != null) {
                KhachThue kh = p.getNguoiDungTen();
                System.out.println("ten khach thue: " + kh.getTen());
            }

            // Nếu muốn hiển thị hợp đồng
            HopDong hd = p.getHopDong();
            if (hd != null) {
                System.out.println("Mã hợp đồng: " + hd.getMaHopDong());
            }
        }
    }

    // ghi file
    public void luuFile() {
        try (PrintWriter pw = new PrintWriter(new FileWriter(FILE_PHONG))) {
            // ghi dữ liệu
        } catch (IOException e) {
            System.out.println("Loi luu file: " + e.getMessage());
        }
    }
}
