package Bai02;

import Bai01.SinhVien;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println("Nhập số lượng sinh viên: ");
        int n = sc.nextInt();
        SinhVien[] sinhVien = new SinhVien[n];

        for (int i = 0; i < sinhVien.length; i++) {
            System.out.println("Nhập sinh viên thứ: " + (i + 1));
            sinhVien[i] = new SinhVien();

            sinhVien[i].khaiBaoThongTin();

        }
        while (true) {
            System.out.println("Thực hiện công việc sau: ");
            System.out.println("1. In toàn bộ danh sách ra màn hình\n" +
                    "2. Sắp xếp danh sách theo tên sinh viên\n" +
                    "3. In danh sách sinh viên theo lớp");
            System.out.println("Chọn ngoài số 1,2,3 để dừng công việc");
            int chon = sc.nextInt();
            if (chon > 3 || chon < 1) {
                System.out.println("dừng công việc tại đây");
                break;
            }
            switch (chon) {
                case 1:
                    inRaManHinh(sinhVien);
                    break;
                case 2:
                    sapXep(sinhVien);
                    break;
                case 3:
                    inTheolop(sinhVien);
                    break;
            }
        }


    }

    public static void inRaManHinh(SinhVien[] sinhViens) {
        for (int i = 0; i < sinhViens.length; i++) {
            System.out.println(sinhViens[i].toString());
        }
    }

    public static void sapXep(SinhVien[] mangSv) {
        SinhVien temp = null;

        for (int i = 0; i < mangSv.length; i++) {
            for (int j = 0; j < mangSv.length - 1; j++) {
                if (mangSv[j].tenSinhVien.compareTo(mangSv[j + 1].tenSinhVien) > 0) {
                    temp = mangSv[j];
                    mangSv[j] = mangSv[j + 1];
                    mangSv[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(mangSv));
    }

    public static void inTheolop(SinhVien[] mangLop) {
        System.out.println("Lớp muốn in: ");
        int a = new Scanner(System.in).nextInt();
        for (int i = 0; i < mangLop.length; i++) {
            if (mangLop[i].lop == a) {
                System.out.println(mangLop[i].toString());
            }
        }
    }
}