
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers sc Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template sc the editor.
 */
/**
 *
 * @author LENOVO
 */
public class main {

    public static class SanPham implements Comparable<SanPham>{

        private String tenHang, ma, thuTu;
        private int donGia, soLuong, giamGia, thanhTien;

        public SanPham(String tenHang, String ma, int donGia, int soLuong) {
            this.tenHang = tenHang;
            this.ma = ma;
            this.donGia = donGia;
            this.soLuong = soLuong;
            this.thuTu = tinhThuTu(ma);
            this.giamGia = tinhGiamGia(ma, donGia, soLuong);
            this.thanhTien = donGia * soLuong - this.giamGia;
        }
        private static String tinhThuTu(String ma){
            String s = "";
            for(int i = 1; i <= 3; i++)
                s += ma.charAt(i);
            return s;
        }
        private static int tinhGiamGia(String ma, int donGia, int soLuong) {
            if (ma.charAt(4) == '1') {
                return (int) (0.5 * donGia * soLuong);
            } else {
                return (int) (0.3 * donGia * soLuong);
            }

        }

        public int compareTo(SanPham n) {
            if (this.thuTu.compareTo(n.thuTu) > 0) {
                return 1;
            }
            return -1;
        }
        @Override
        public String toString() {
            return tenHang + " " + ma + " "+ thuTu + " " + giamGia + " " + thanhTien;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<SanPham> listSP = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            listSP.add(new SanPham(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(listSP);
        for (SanPham nhanVien : listSP) {
            System.out.println(nhanVien);
        }
    }
}
