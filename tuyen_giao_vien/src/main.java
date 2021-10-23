
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

    public static class GiaoVien implements Comparable<GiaoVien>{
        private String ma,  hoTen, maXT, monHoc, xepHang;
        private double diemTH, diemCM, diemUT, tongDiem;

        public GiaoVien(long stt, String hoTen, String maXT,  double diemTH, double diemCM) {
            this.hoTen = hoTen;
            this.ma = "GV" + String.format("%02d", stt);
            this.monHoc = tinhMH(maXT);
            this.diemTH = diemTH;
            this.diemCM = diemCM;
            this.diemUT = tinhDiemUT(maXT);
            this.tongDiem = diemTH*2+diemCM+this.diemUT;
            this.xepHang = tinhXH(this.tongDiem);
        }
        
        private String tinhMH(String maXT){
            char x = maXT.charAt(0);
            if(x == 'A')
                return "TOAN";
            else if(x == 'B')
                return "LY";
            else 
                return "HOA";
            
        }
        
        
        private String tinhXH(double tongDiem){
            if(tongDiem < 18)
                return "LOAI";
            else 
                return "TRUNG TUYEN";
        }
        private double tinhDiemUT(String maXT){
            char x = maXT.charAt(1);
            if(x == '1')
                return 2;
            else if(x == '2')
                return 1.5;
            else if(x == '3')
                return 1;
            else 
                return 0;
            
        }
        
        @Override
        public int compareTo(GiaoVien n) {
            if (this.tongDiem < n.tongDiem) {
                return 1;
            }
            else if(this.tongDiem == n.tongDiem&& this.ma.compareTo(n.ma) > 0)
                return 1;
            return -1;
        }

        @Override
        public String toString() {
            return  ma + " " + hoTen + " " + monHoc+ " " + String.format("%.1f", tongDiem)  + " " + xepHang  ;
        }

        
   
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = Integer.parseInt(sc.nextLine());
        ArrayList<GiaoVien> listNV = new ArrayList<>();
        for (long i = 1; i <= t; i++) {
            
            listNV.add(new GiaoVien(i, sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(listNV);
        listNV.forEach(nhanVien -> {
            System.out.println(nhanVien);
        });
    }
    
}
