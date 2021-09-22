
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

    public static class hocSinh {

        private String maHS;
        private String hoTen;
        private double diem1;
        private double diem2;
        private double diem3;
        private double diem4;
        private double diem5;
        private double diem6;
        private double diem7;
        private double diem8;
        private double diem9;
        private double diem10;
        private double dtb;
        private String xepHang;

        public hocSinh(String hoTen, double diem1, double diem2, double diem3, double diem4, double diem5, double diem6, double diem7, double diem8, double diem9, double diem10, String maHS) {
            this.hoTen = hoTen;
            this.diem1 = diem1;
            this.diem2 = diem2;
            this.diem3 = diem3;
            this.diem4 = diem4;
            this.diem5 = diem5;
            this.diem6 = diem6;
            this.diem7 = diem7;
            this.diem8 = diem8;
            this.diem9 = diem9;
            this.diem10 = diem10;
            this.maHS = maHS;
        }

        public String getMaHS() {
            return maHS;
        }

        public void setMaHS(String maHS) {
            this.maHS = maHS;
        }

        public double getDtb() {
            return dtb;
        }

        public void setDtb(double dtb) {
            this.dtb = dtb;
        }

        public void check() {
            this.dtb = (diem1 * 2 + diem2 * 2 + diem3 + diem4 + diem5 + diem6 + diem7 + diem8 + diem9 + diem10) / 12;
            this.dtb = Math.round(dtb * 10.0) / 10.0;
            if (dtb >= 9) {
                this.xepHang = "XUAT SAC";
            } else if (dtb >= 8) {
                this.xepHang = "GIOI";
            } else if (dtb >= 7) {
                this.xepHang = "KHA";
            } else if (dtb >= 5) {
                this.xepHang = "TB";
            } else {
                this.xepHang = "YEU";
            }
        }

        public void in() {
            System.out.print(maHS + " " + hoTen + " ");
            System.out.printf("%.1f ", dtb);
            System.out.println(xepHang);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<hocSinh> listHS = new ArrayList<hocSinh>();
        int k = 0;
        while (t-- > 0) {
            k++;
            String maHS = "HS" + String.format("%02d", k);
            hocSinh a = new hocSinh(sc.nextLine(), Double.parseDouble(sc.next()), Double.parseDouble(sc.next()), Double.parseDouble(sc.next()), Double.parseDouble(sc.next()), Double.parseDouble(sc.next()), Double.parseDouble(sc.next()), Double.parseDouble(sc.next()), Double.parseDouble(sc.next()), Double.parseDouble(sc.next()), Double.parseDouble(sc.nextLine()), maHS);
            a.check();
            listHS.add(a);
        }

        Collections.sort(listHS, new Comparator<hocSinh>() {
            @Override
            public int compare(hocSinh o1, hocSinh o2) {
                if (o1.getDtb() <= o2.getDtb()) {
                    return 1;
                } 
                
                return -1;
            }
        });
        for (hocSinh sinh : listHS) {
            sinh.in();
        }
    }

}
