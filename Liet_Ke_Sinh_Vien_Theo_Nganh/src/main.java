
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
            s = s.toUpperCase();
            listLop.add(s);
        }
        for (String string : listLop) {
            System.out.println("DANH SACH SINH VIEN NGANH " + string + ":");
            
            for (thiSinh sinh : listSV) {
                if(string.equalsIgnoreCase("KE TOAN") && sinh.getMaSV().indexOf("DCKT") != -1){
                    sinh.in();
                }
                else if(string.equalsIgnoreCase("CONG NGHE THONG TIN") && sinh.getMaSV().indexOf("DCCN") != -1 && sinh.getMaLop().charAt(0) != 'E'){
                    sinh.in();
                }
                else if(string.equalsIgnoreCase("AN TOAN THONG TIN") && sinh.getMaSV().indexOf("DCAT") != -1 && sinh.getMaLop().charAt(0) != 'E'){
                    sinh.in();
                }
                else if(string.equalsIgnoreCase("VIEN THONG") && sinh.getMaSV().indexOf("DCVT") != -1){
                    sinh.in();
                }
                else if(string.equalsIgnoreCase("DIEN TU") && sinh.getMaSV().indexOf("DCDT") != -1){
                    sinh.in();
                }
            }
        }

    }
}
