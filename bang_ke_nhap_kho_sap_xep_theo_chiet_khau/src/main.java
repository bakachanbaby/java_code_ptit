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

    public static class SanPham implements Comparable<SanPham>{

        private String ma, maSP, tenHang;
        private int soLuong, doGia, tienCK, thanhTien;
        private float phantramCK;

        public SanPham(String tenHang, int soLuong, int doGia) {
            this.ma = timMaHang(tenHang);
            this.tenHang = tenHang;
            this.phantramCK = tinhPhanTram(soLuong);
            this.tienCK = (int) (doGia*soLuong*phantramCK);
            this.thanhTien = doGia*soLuong-tienCK;
            
        }

        public String getMa() {
            return ma;
        }

        public void setMa(String ma) {
            this.ma = ma;
        }

        public String getMaSP() {
            return maSP;
        }

        public void setMaSP(String maSP) {
            this.maSP = maSP;
        }

        
        private static float tinhPhanTram(int soLuong) {
            if(soLuong > 10)
                return (float) 0.05;
            else if(soLuong >= 8)
                return (float) 0.02;
            else if(soLuong >= 5)
                return (float) 0.01;
            else
                return 0;
        }
        
        private static String timMaHang(String tenHang){
            tenHang = tenHang.trim();
            tenHang = tenHang.toUpperCase();
            String s[] = tenHang.split("\\s+");
            String x = "";
            for(int i = 0; i <= 1; i++){
                x += s[i].charAt(0);
            }
            return x;
        }

        public int compareTo(SanPham n) {
            if (this.tienCK < n.tienCK) {
                return 1;
            }
            return -1;
        }
        
        @Override
        public String toString() {
            return  maSP + " " + tenHang + " " + tienCK + " " + thanhTien;
        }
        
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        ArrayList<SanPham> a = new ArrayList<>();
        ArrayList<SanPham> b = new ArrayList<>();
        
        for (int i = 1; i <= t; i++) {
            SanPham sp = new SanPham(in.nextLine(),Integer.parseInt(in.nextLine()),
                    Integer.parseInt(in.nextLine()));
            a.add(sp);
        }
        int dem = 1;
        String s = "";
        for(int i = 0; i < a.size(); i++){
            dem = 1;
            for(int j = 0; j < i; j++){
                if(a.get(i).getMa().equals(a.get(j).getMa()))
                    dem++;
            }
            s = a.get(i).getMa() + String.format("%02d", dem);
            a.get(i).setMaSP(s);
        }
        
        Collections.sort(a);
        for (SanPham sanPham : a) {
            System.out.println(sanPham);
        }
    }

}