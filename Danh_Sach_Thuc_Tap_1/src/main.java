
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
        
        private int stt;
        private String maSV;
        private String hoTen;
        private String maLop;
        private String email;
        private String doanhNghiep;

        public thiSinh(int stt, String maSV, String hoTen, String maLop, String email, String doanhNghiep) {
            this.stt = stt;
            this.maSV = maSV;
            this.hoTen = hoTen;
            this.maLop = maLop;
            this.email = email;
            this.doanhNghiep = doanhNghiep;
            
            
        }

        public int getStt() {
            return stt;
        }

        public void setStt(int stt) {
            this.stt = stt;
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

        public String getDoanhNghiep() {
            return doanhNghiep;
        }

        public void setDoanhNghiep(String doanhNghiep) {
            this.doanhNghiep = doanhNghiep;
        }
        
        public void in() {
            System.out.println(stt + " " +  maSV + " " + hoTen + " " + maLop + " " + email + " " + doanhNghiep);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<thiSinh> listSV = new ArrayList<thiSinh>();
        ArrayList<String> listLop = new ArrayList<String>();
        int k = 1;
        while (t-- > 0) {
            int stt = k++;
            String maSV = sc.nextLine();
            String hoTen = sc.nextLine();
            String maLop = sc.nextLine();
            String email = sc.nextLine();
            String doanhNghiep = sc.nextLine();
            thiSinh a = new thiSinh(stt, maSV, hoTen, maLop, email, doanhNghiep);
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
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            String s = sc.nextLine();
            listLop.add(s);
        }
        for (String string : listLop) {
            for (thiSinh sinh : listSV) {
                if(sinh.getDoanhNghiep().compareTo(string) == 0){
                    sinh.in();
                }
            }
        }

    }
}
