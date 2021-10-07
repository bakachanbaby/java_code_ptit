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

    public static class GiaoVien {

        private String ma, hoTen;
        private int bacLuong, phuCap, thuNhap;

        public GiaoVien(String ma, String hoTen, int luongCoBan) {
            this.ma = ma;
            this.hoTen = hoTen;
            this.phuCap = timPhuCap(ma);
            this.bacLuong = timBacLuong(ma);
            this.thuNhap = luongCoBan*bacLuong+phuCap;
        }

        private static int timPhuCap(String ma) {
            String s = "";
            for(int i = 0; i <= 1; i++)
                s += ma.charAt(i);
            if(s.equals("HT"))
                return 2000000;
            else if(s.equals("HP"))
                return 900000;
            else 
                return 500000;
        }
        private static int timBacLuong(String ma) {
            String s = "";
            for(int i = 2; i <= 3; i++)
                s += ma.charAt(i);
            return Integer.parseInt(s);
        }
        
        @Override
        public String toString() {
            return  ma + " " + hoTen + " " + bacLuong + " " + phuCap + " " + thuNhap ;
        }
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int t = Integer.parseInt(in.nextLine());
        ArrayList<GiaoVien> listNV = new ArrayList<>();
//        for (int i = 1; i <= t; i++) {
            listNV.add(new GiaoVien(in.nextLine(), in.nextLine(), Integer.parseInt(in.nextLine())));
//        }
        for (GiaoVien nhanVien : listNV) {
            System.out.println(nhanVien);
        }
    }
}