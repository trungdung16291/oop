package Bai01;

import java.util.Scanner;

public class SinhVien {

    public String tenSinhVien;
    public int maSinhVien;
    public int lop;
    public int khoa;

    public void khaiBaoThongTin() {

        this.maSinhVien = maSinhVien;
        maSinhVien++;

        System.out.println("Nhập tên sinh viên: ");
        this.tenSinhVien = new Scanner(System.in).nextLine();

        System.out.println("Nhập lớp sinh viên: ");
        this.lop = new Scanner(System.in).nextInt();

        System.out.println("Nhập khoá sinh viên: ");
        this.khoa = new Scanner(System.in).nextInt();

    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "tenSinhVien='" + tenSinhVien + '\'' +
                ", maSinhVien=" + maSinhVien +
                ", lop='" + lop + '\'' +
                ", khoa=" + khoa +
                '}' + '\n';
    }
}
