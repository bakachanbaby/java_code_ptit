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

    public static class SanPham {

        private String ma;
        private int soLuongN, soLuongX, donGia,tien, thue;

        public SanPham(String ma, int soLuongN) {
            this.ma = ma;
            this.soLuongN = soLuongN;
            this.soLuongX = tinhSoLuongXuat(ma, soLuongN);
            this.donGia = tinhDonGia(ma, soLuongN);
            this.tien = donGia*soLuongX;
            this.thue = tinhThue(ma, tien);
        }

        private static int tinhSoLuongXuat(String ma, int soLuongN) {
            if(ma.charAt(0) == 'A'){
                float x = (float) (soLuongN*0.6);
                x = Math.round(x);
                return (int) (x);
            }
                
            else {
                 float x = (float) (soLuongN*0.7);
                x = Math.round(x);
                return (int) (x);
            }
                
        }
        private static int tinhDonGia(String ma, int soLuongN) {
            if(ma.charAt(ma.length()-1) == 'Y')
                return 110000;
            else 
                return 135000;
        }
        
        private static int tinhThue(String ma, int tien){
            char x = ma.charAt(0);
            char y = ma.charAt(ma.length()-1);
            if(x == 'A' && y == 'Y')
                return (int) (tien*0.08);
            else if(x == 'A' && y == 'N')
                return (int) (tien*0.11);
            else if(x == 'B' && y == 'Y')
                return (int) (tien*0.17);
            else
                return (int) (tien*0.22);
        }

        @Override
        public String toString() {
            return ma + " " + soLuongN + " " + soLuongX + " " + donGia + " " + tien + " " + thue;
        }
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        ArrayList<SanPham> a = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            a.add(new SanPham(in.nextLine(), Integer.parseInt(in.nextLine())));
        }
        
        for (SanPham nhanVien : a) {
            System.out.println(nhanVien);
        }
    }
}