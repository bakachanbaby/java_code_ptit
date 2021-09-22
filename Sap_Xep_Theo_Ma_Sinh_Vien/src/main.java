
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
        ArrayList<thiSinh> listSV = new ArrayList<thiSinh>();
        while (sc.hasNext()) {
            String maSV = sc.nextLine();
            String hoTen = sc.nextLine();
            String maLop = sc.nextLine();
            String email = sc.nextLine();
            thiSinh a = new thiSinh(maSV, hoTen, maLop, email);
            listSV.add(a);
        }
        Collections.sort(listSV, new Comparator<thiSinh>() {
            @Override
            public int compare(thiSinh o1, thiSinh o2) {
                if (o1.getMaSV().compareTo(o2.getMaSV()) > 0) {
                    return 1;
                } else {
                    return -1;
                }

            }
        });
        for (thiSinh sinh : listSV) {
            sinh.in();
        }
    }
}
