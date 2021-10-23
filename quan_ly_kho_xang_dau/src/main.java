

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

    public static class XangDau implements Comparable<XangDau> {

        private String ma, hangSX;
        private long soLuong, donGia,thue, thanhTien;

        public XangDau(String ma, long soLuong) {
            this.ma = ma;
            this.soLuong = soLuong;
            this.hangSX = tinhHangSX(ma);
            this.donGia = tinhDonGia(ma);
            this.thue = tinhThue(ma, donGia, soLuong);
            this.thanhTien = donGia*soLuong+thue;
            
        }

        private long tinhDonGia(String ma){
            char x = ma.charAt(0);
            if(x == 'X')
                return 128000;
            else if(x == 'D')
                return 11200;
            else 
                return 9700;
        }
        
        private long tinhThue(String ma, long donGia, long soLuong){
            char x = ma.charAt(0);
            String s = "";
            for(int i = 3; i <= 4; i++)
                s +=ma.charAt(i);
            if(s.equals("TN"))
                return 0;
            if(x == 'X')
                return Math.round(donGia*soLuong*0.03);
            else if(x == 'D')
                return Math.round(donGia*soLuong*0.035);
            else 
                return Math.round(donGia*soLuong*0.02);
        }
        private String tinhHangSX(String ma){
            String s = "";
            for(int i = 3; i <= 4; i++)
                s +=ma.charAt(i);
            if(s.equals("BP"))
                return "British Petro";
            else if(s.equals("ES"))
                return "Esso";
            else if(s.equals("SH"))
                return "Shell";
            else if(s.equals("CA"))
                return "Castrol";
            else if(s.equals("MO"))
                return "Mobil";
            else 
                return "Trong Nuoc";
        }
        
        private long tinhThanhTien(long soM3){
            if(soM3 <= 50)
                return Math.round((100*soM3)*1.02);
            else if(soM3 <=100)
                return Math.round(((100*50)+((soM3-50)*150))*1.03);
            else 
                return Math.round(((100*50)+(50*150)+((soM3-100)*200))*1.05);
        }

        @Override
        public int compareTo(XangDau n) {
//            if (this.thanhTien < n.thanhTien) {
//                return 1;
//            }
//            else if(this.tocDo == n.tocDo && this.ma.compareTo(n.ma) > 0)
//                return 1;

            return -1;
        }

        @Override
        public String toString() {
            return  ma + " " + hangSX + " " + donGia + " " + thue + " " + thanhTien;
        }

        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = Integer.parseInt(sc.nextLine());
        ArrayList<XangDau> listXD = new ArrayList<>();
        for (long i = 1; i <= t; i++) {
            String s = sc.nextLine();
            String arr[] = s.split("\\s+");
            listXD.add(new XangDau(arr[0],Long.parseLong(arr[1])));
        }
//        Collections.sort(listXD);
        listXD.forEach(nhanVien -> {
            System.out.println(nhanVien);
        });
    }

}
