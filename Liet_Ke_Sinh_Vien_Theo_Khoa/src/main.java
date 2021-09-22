
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
        private String email;

        public thiSinh(String maSV, String hoTen, String maLop, String email) {
            this.maSV = maSV;
            this.hoTen = hoTen;
            this.maLop = maLop;
            this.email = email;
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

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public void in() {
            System.out.println(maSV + " " + hoTen + " " + maLop + " " + email + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<thiSinh> listSV = new ArrayList<thiSinh>();
        ArrayList<String> listLop = new ArrayList<String>();
        while (t-- > 0) {
            String maSV = sc.nextLine();
            String hoTen = sc.nextLine();
            String maLop = sc.nextLine();
            String email = sc.nextLine();
            thiSinh a = new thiSinh(maSV, hoTen, maLop, email);
            listSV.add(a);
        }
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            String s = sc.nextLine();
            listLop.add(s);
        }
        for (String string : listLop) {
            System.out.println("DANH SACH SINH VIEN KHOA " + string + ":");
            char x1 = string.charAt(2);
            char y1 = string.charAt(3);
            
            for (thiSinh sinh : listSV) {
                char x2 = sinh.getMaLop().charAt(1);
                char y2 = sinh.getMaLop().charAt(2);
                if(x1 == x2 && y1 == y2){
                    sinh.in();
                }
            }
        }

    }
}
