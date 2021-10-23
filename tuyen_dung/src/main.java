
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

    public static class TuyenDung implements Comparable<TuyenDung>{
        private String ma,  hoTen, xepLoai;
        private double diemLT, diemTH, diemTB;

        public TuyenDung(long stt, String hoTen, double diemLT, double diemTH) {
            this.hoTen = hoTen;
            this.ma = "TS" + String.format("%02d", stt);
            this.diemLT = tinhD(diemLT);
            this.diemTH = tinhD(diemTH);
            this.diemTB = (this.diemLT+this.diemTH)/2;
            this.xepLoai = tinhXH(this.diemTB);
        }
        
        private double tinhD(double diemLT){
            if(diemLT > 10)
                diemLT /= 10;
            return diemLT;
        }
        
        
        private String tinhXH(double diemTB){
            if(diemTB < 5)
                return "TRUOT";
            else if(diemTB < 8)
                return "CAN NHAC";
            else if(diemTB <= 9.5)
                return "DAT";
            else
                return "XUAT SAC";
        }
        public int compareTo(TuyenDung n) {
            if (this.diemTB< n.diemTB) {
                return 1;
            }
            return -1;
        }

        @Override
        public String toString() {
            return  ma + " " + hoTen  + " " + String.format("%.2f", diemTB) + " " + xepLoai;
        }

        


        
        
        
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = Integer.parseInt(sc.nextLine());
        ArrayList<TuyenDung> listNV = new ArrayList<>();
        for (long i = 1; i <= t; i++) {
            
            listNV.add(new TuyenDung(i, sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(listNV);
        for (TuyenDung nhanVien : listNV) {
            System.out.println(nhanVien);
        }
    }
    
}
