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

    public static class thiSinh implements Comparable<thiSinh>{

        private String maSV, hoTen, maLop, ngaySinh;
        private float gpa;

        public thiSinh(int stt, String hoTen, String maLop, String ngaySinh, float gpa) {
            this.maSV = "B20DCCN" + String.format("%03d", stt);
            this.hoTen = formatHoTen(hoTen);
            this.maLop = maLop;
            this.ngaySinh = format(ngaySinh);
            this.gpa = gpa;
        }

        public String format(String ngaySinh) {
            String s = ngaySinh;
            String srr[] = s.split("/");
            String x = "";
            for (int i = 0; i < srr.length - 1; i++) {
                if (srr[i].length() < 2) {
                    srr[i] = "0" + srr[i];
                }
                x += srr[i] + "/";
            }
            x += srr[srr.length - 1];
            return x;
        }

        public String formatHoTen(String hoTen) {
            String s = hoTen;
            s = s.trim();
            String[] arr = s.split("\\s+");
            String newstring = "";
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].length() > 0) {
                    String y = arr[i].toLowerCase();
                    char x = arr[i].toUpperCase().charAt(0);
                    newstring += x + y.substring(1) + " ";
                }
            }
            return newstring;
        }

        @Override
        public String toString() {
            return  maSV + " " + hoTen + maLop + " " + ngaySinh + " " + String.format("%.2f", gpa);
        }

        @Override
        public int compareTo(thiSinh o) {
            if (this.gpa < o.gpa) {
                    return 1;
            }
            return -1;
        }

        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<thiSinh> listSV = new ArrayList<thiSinh>();
       for(int i = 1; i <= t; i++) {
            thiSinh a = new thiSinh(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine()));
            listSV.add(a);
        }
        Collections.sort(listSV);
        
        for (thiSinh sinh : listSV) {
            System.out.println(sinh);
        }
    }

}