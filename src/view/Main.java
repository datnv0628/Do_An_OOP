package src.view;

import src.model.*;
import java.time.LocalDate;

import service.*;

public class Main {
    public static void main(String[] args) {
        QuanLyKhachThue ql = new QuanLyKhachThue();
        ql.docFile();
        ql.hienThiDanhSachKhachThue();
    }
}
