
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

        public void check() {
            String s = this.boMon;
            String srr[] = s.split("\\s+");
            String x = "";
            for (int i = 0; i < srr.length; i++) {
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
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            String srr[] = s.split("\\s+");
            String x = "";
            for (int j = 0; j < srr.length; j++) {
                x += srr[j].toUpperCase().charAt(0);
            }
            System.out.println("DANH SACH GIANG VIEN BO MON " + x + ":");
            for (giangVien sinh : listSV) {
                if(sinh.boMon.equalsIgnoreCase(x))
                    sinh.in();
            }
        }

    }

}
