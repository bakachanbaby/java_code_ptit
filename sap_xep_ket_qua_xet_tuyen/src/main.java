
import java.util.ArrayList;
import java.util.Collections;
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

    public static class ThuKhoa implements Comparable<ThuKhoa>{
        private int tuoi, dTB;
        private String stt, hoTen, ngaySinh, xepHang;
        private double dLT, dTH, dThuong;

        public ThuKhoa(int stt, String hoTen, String ngaySinh, double dLT, double dTH) {
            this.hoTen = hoTen;
            this.ngaySinh = ngaySinh;
            this.stt = "PH" + String.format("%02d", stt);
            this.dLT = dLT;
            this.dTH = dTH;
            this.tuoi = tinhTuoi();
            this.dThuong = tinhDT();
            int DTB = (int) Math.round((dLT+dTH)/2 + dThuong);
            if(DTB > 10)
                this.dTB = 10;
            else 
                this.dTB = DTB;
            this.xepHang = tinhXH();
        }
        
        public int tinhTuoi(){
            String a[] = ngaySinh.split("/");
            return 2021-Integer.parseInt(a[2]);
        }
        public double tinhDT(){
            if(dLT >= 8 && dTH >= 8){
                return 1;
            }
            else if(dLT >= 7.5 && dTH >= 7.5)
                return 0.5;
            else 
                return 0;
        }
        
        public String tinhXH(){
            if(dTB < 5)
                return "Truot";
            else if(dTB <= 6)
                return "Trung binh";
            else if(dTB <= 7)
                return "Kha";
            else if(dTB <= 8)
                return "Gioi";
            else 
                return "Xuat sac";
        }
        public int compareTo(ThuKhoa n) {
            if (this.dTB < n.dTB) {
                return 1;
            }
            else if(this.dTB == n.dTB && this.stt.compareTo(n.stt) > 0)
                return 1;
            return -1;
        }

        @Override
        public String toString() {
            return  stt + " " + hoTen + " " + tuoi + " " + dTB + " " + xepHang;
        }

    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<ThuKhoa> listNV = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            
            listNV.add(new ThuKhoa(i, sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(listNV);
        for (ThuKhoa nhanVien : listNV) {
            System.out.println(nhanVien);
        }
    }
    
}
