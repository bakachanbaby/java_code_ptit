
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

    public static class thiSinh {

        private String maSV;
        private String hoTen;
        private String maLop;

        private float d1;
        private float d2;
        private float d3;

        public thiSinh(String maSV, String hoTen, String maLop, float d1, float d2, float d3) {
            this.maSV = maSV;
            this.hoTen = hoTen;
            this.maLop = maLop;
            this.d1 = d1;
            this.d2 = d2;
            this.d3 = d3;
        }

        public String getMaSV() {
            return maSV;
        }

        public void setMaSV(String maSV) {
            this.maSV = maSV;
        }

        public String getHoTen() {
            return hoTen;
        }

        public void setHoTen(String hoTen) {
            this.hoTen = hoTen;
        }

        public String getMaLop() {
            return maLop;
        }

        public void setMaLop(String maLop) {
            this.maLop = maLop;
        }

        public float getD1() {
            return d1;
        }

        public void setD1(float d1) {
            this.d1 = d1;
        }

        public float getD2() {
            return d2;
        }

        public void setD2(float d2) {
            this.d2 = d2;
        }

        public float getD3() {
            return d3;
        }

        public void setD3(float d3) {
            this.d3 = d3;
        }

        public void in() {
            System.out.println(maSV + " " + hoTen + " " + maLop + " " + d1 + " " + d2 + " " + d3);

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<thiSinh> listSV = new ArrayList<thiSinh>();
        while (t-- > 0) {
            String maSV = sc.nextLine();
            String hoTen = sc.nextLine();
            String maLop = sc.nextLine();
            float d1 = Float.parseFloat(sc.nextLine());
            float d2 = Float.parseFloat(sc.nextLine());
            float d3 = Float.parseFloat(sc.nextLine());
            thiSinh a = new thiSinh(maSV, hoTen, maLop, d1, d2, d3);
            listSV.add(a);
        }
        Collections.sort(listSV, new Comparator<thiSinh>() {
            @Override
            public int compare(thiSinh o1, thiSinh o2) {
                
                if (o1.getHoTen().compareTo(o2.getHoTen()) > 0) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });
        int k = 1;
        for (thiSinh sinh : listSV) {
            System.out.print((k++) + " ");
            sinh.in();
        }
    }

}
