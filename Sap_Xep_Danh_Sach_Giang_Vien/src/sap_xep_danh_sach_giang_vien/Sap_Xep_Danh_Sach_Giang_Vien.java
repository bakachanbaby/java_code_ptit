/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sap_xep_danh_sach_giang_vien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Sap_Xep_Danh_Sach_Giang_Vien {

    public static class giangVien {

        private String maGV;
        private String hoTen;
        private String boMon;

        public giangVien(String maGV, String hoTen, String boMon) {
            this.maGV = maGV;
            this.hoTen = hoTen;
            this.boMon = boMon;
        }

        public String getMaGV() {
            return maGV;
        }

        public void setMaGV(String maGV) {
            this.maGV = maGV;
        }

        public String getHoTen() {
            return hoTen;
        }

        public void setHoTen(String hoTen) {
            this.hoTen = hoTen;
        }

        public String getBoMon() {
            return boMon;
        }

        public void setBoMon(String boMon) {
            this.boMon = boMon;
        }
        
        public void check(){
            String s = this.boMon;
            String srr[] = s.split("\\s+");
            String x = "";
            for(int i = 0; i < srr.length; i++){
                x += srr[i].toUpperCase().charAt(0);
            }
            this.boMon = x;
        }
        
        public void in() {
            System.out.println(maGV + " " + hoTen + " " + boMon);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<giangVien> listSV = new ArrayList<giangVien>();
        int k = 0;
        while (t-- > 0) {
            k++;
            String hoTen = sc.nextLine();
            String boMon = sc.nextLine();
            String maGV = "GV" + String.format("%02d", k);
            giangVien a = new giangVien(maGV, hoTen, boMon);
            a.check();
            listSV.add(a);
            
        }
        Collections.sort(listSV, new Comparator<giangVien>() {
            @Override
            public int compare(giangVien o1, giangVien o2) {
                String srr1[] = o1.getHoTen().split("\\s+");
                String srr2[] = o2.getHoTen().split("\\s+");
                String x1 = srr1[srr1.length-1];
                String x2 = srr2[srr2.length-1];
                
                if (x1.compareTo(x2) > 0) {
                    return 1;

                } else if (x1.compareTo(x2) == 0 && o1.getMaGV().compareTo(o2.getMaGV()) > 0) {
                    return 1;
                } else {
                    return -1;
                }

            }
        });
        for (giangVien sinh : listSV) {
            sinh.in();
        }
    }

}
