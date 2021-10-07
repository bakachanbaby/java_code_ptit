
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

    public static class btNhom {

        private String maSV;
        private String hoTen;
        private String soDT;
        private String soTT;

        public btNhom(String maSV, String hoTen, String soDT, String soTT) {
            this.maSV = maSV;
            this.hoTen = hoTen;
            this.soDT = soDT;
            this.soTT = soTT;
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

        public String getSoDT() {
            return soDT;
        }

        public void setSoDT(String soDT) {
            this.soDT = soDT;
        }

        public String getSoTT() {
            return soTT;
        }

        public void setSoTT(String soTT) {
            this.soTT = soTT;
        }

        public void in() {
            System.out.println(maSV + " " + hoTen + " " + soDT);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int t = Integer.parseInt(sc.nextLine());        
//        int m = Integer.parseInt(sc.nextLine());
        String p = sc.nextLine();
        String pp[] = p.split("\\s+");
        int t = Integer.parseInt(pp[0]);
        int m = Integer.parseInt(pp[1]);
        ArrayList<btNhom> listSV = new ArrayList<btNhom>();
        ArrayList<String> listLop = new ArrayList<String>();
        ArrayList<String> listBT = new ArrayList<String>();

        while (t --> 0) {
            String maSV = sc.nextLine();
            String hoTen = sc.nextLine();
            String soDT = sc.nextLine();
            String soTT = sc.nextLine();
            btNhom a = new btNhom(maSV, hoTen, soDT, soTT);
            listSV.add(a);
        }
        String s = "";
        while (m --> 0) {
            s = sc.nextLine();
            listBT.add(s);
        }
//        for (btNhom nhom : listSV) {
//            nhom.in();
//        }
        String x = sc.nextLine();
        int n = Integer.parseInt(x);
        for(int i = 0; i < n; i++){
            String k = sc.nextLine();
            System.out.println("DANH SACH NHOM " + k + ":");
            for (btNhom nhom : listSV) {
                if(nhom.getSoTT().compareTo(k) == 0){
                    nhom.in();
                }
            }
            int o = Integer.parseInt(k);
            System.out.println("Bai tap dang ky: " + listBT.get(o-1));
        }
        
    }
}
