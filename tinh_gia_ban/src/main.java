
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

    public static class SanPham {

        private String ma,tenHang, donVi;
        private int donGia, soLuong, phiVanChuyen, thanhTien, giaBan;

        public SanPham(int stt,  String tenHang, String donVi, int donGia, int soLuong) {
            this.tenHang = tenHang;
            this.donVi = donVi;
            this.ma = "MH" + String.format("%02d", stt);
            this.donGia = donGia;
            this.soLuong = soLuong;
            this.phiVanChuyen = (int) Math.round(donGia*soLuong*0.05);
            this.thanhTien = (int) Math.round(donGia*soLuong+phiVanChuyen);
            this.giaBan = thanhTien+ (int) Math.round(0.02*thanhTien);
            
        }

        @Override
        public String toString() {
            return  ma + " " + tenHang + " " + donVi + " " + phiVanChuyen + " " + thanhTien + " " + giaBan ;
        }
        
        

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<SanPham> listSP = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            listSP.add(new SanPham(i, sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }

        for (SanPham nhanVien : listSP) {
            System.out.println(nhanVien);
        }
    }
}
