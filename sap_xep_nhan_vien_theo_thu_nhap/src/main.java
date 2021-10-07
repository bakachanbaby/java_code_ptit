import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author LENOVO
 */
public class main {

    public static class NhanVien {

        private String ma, hoTen;
        private int phuCap, luongChinh, tamUng, conLai;

        public NhanVien(int stt, String hoTen, String chucVu, int luongCoBan, int soNgayCong) {
            this.ma = "NV" + String.format("%02d", stt);
            this.hoTen = hoTen;
            this.phuCap = timPhuCap(chucVu);
            this.luongChinh = luongCoBan * soNgayCong;
            this.tamUng = timTamUng(phuCap, luongChinh);
            this.conLai = luongChinh + phuCap - tamUng;
        }

        private static int timPhuCap(String chucVu) {
            if (chucVu.equals("GD")) {
                return 500;
            } else if (chucVu.equals("PGD")) {
                return 400;
            } else if (chucVu.equals("TP")) {
                return 300;
            } else if (chucVu.equals("KT")) {
                return 250;
            }
            return 100;
        }

        private static int timTamUng(int phuCap, int luongChinh) {
            if ((phuCap + luongChinh) * 2 / 3 < 25000) {
                return (((phuCap + luongChinh) * 2 / 3) + 500) / 1000 * 1000;
            } else {
                return 25000;
            }
        }

        @Override
        public String toString() {
            return ma + " " + hoTen + " " + phuCap + " " + luongChinh + " " + tamUng + " " + conLai;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        ArrayList<NhanVien> a = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            a.add(new NhanVien(i, in.nextLine(), in.nextLine(), Integer.parseInt(in.nextLine()),
                    Integer.parseInt(in.nextLine())));
        }
        Collections.sort(a, new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                if (o1.luongChinh + o1.phuCap <= o2.luongChinh + o2.phuCap) {
                    return 1;
                }
                else{
                    return -1;
                }
            }
        });
        for (NhanVien nhanVien : a) {
            System.out.println(nhanVien);
        }
    }
}