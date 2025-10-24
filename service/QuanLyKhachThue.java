package service;

import java.io.*;
import java.time.LocalDate;
import java.util.*;
import src.model.*;

public class QuanLyKhachThue {
    private static final String FILE_KHACHTHUE = "data/KhachThue.txt";
    private List<KhachThue> dsKhachThue = new ArrayList<>();

    public void docFile() {
        dsKhachThue.clear();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_KHACHTHUE))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");

                String ten = parts[0];
                String cccd = parts[1];
                String gioitinh = parts[2];
                String sdt = parts[3];
                String ngaySinhStr = parts[4];
                LocalDate ngaysinh = LocalDate.parse(ngaySinhStr);
                String bienSoXe = parts[5];

                KhachThue kh = new KhachThue(ten, sdt, gioitinh, ngaysinh, cccd, bienSoXe);
                dsKhachThue.add(kh);
                }
        } catch (IOException e) {
            System.out.println("Loi doc file: " + e.getMessage());
        }

    }

    public void hienThiDanhSachKhachThue() {
         for (KhachThue kh : dsKhachThue) {
                System.out.println("-------------");
                System.out.println("ho va ten: " + kh.getTen());
                System.out.println("cccd: " + kh.getCccd());
                System.out.println("gioi tinh: " + kh.getGioiTinh());
                System.out.println("sdt: " + kh.getSdt());
                System.out.println("ngay sinh: " + kh.getNgaySinh());
                System.out.println("bien so xe: " + kh.getBienSoXe());
        }
    }

                public void luuFile() {
            try (PrintWriter pw = new PrintWriter(new FileWriter(FILE_KHACHTHUE))) {
                // ghi dữ liệu
            } catch (IOException e) {
                System.out.println("Loi luu file: " + e.getMessage());
            }
        }
}

