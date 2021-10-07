
import java.util.ArrayList;
import java.util.Collections;
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

    public static class GiaoVien implements Comparable<GiaoVien>{
        
        private String ma, hoTen, chucVu;
        private int luongCB, phuCap, thuNhap, bacLuong;

        public GiaoVien(String ma, String hoTen, int luongCB) {
            this.ma = ma;
            this.hoTen = hoTen;
            this.luongCB = luongCB;
            this.phuCap = tinhPhuCap();
            this.bacLuong = tinhBacLuong();
            this.thuNhap = luongCB*bacLuong+phuCap;
            this.chucVu = tinhChucVu();
        }
        
        private String tinhChucVu(){
            String s = "";
            for(int i = 0; i <= 1; i++)
                s += ma.charAt(i);
            return s;
        }
        
        private int tinhPhuCap(){
            String s = "";
            for(int i = 0; i <= 1; i++)
                s += ma.charAt(i);
            if(s.equals("HT")){
                return 2000000;
            }
            else if(s.equals("HP")){
                return 900000;
            }
            else 
                return 500000;
        }
        
        private int tinhBacLuong(){
            String s = "";
            for(int i = 2; i <= 3; i++)
                s += ma.charAt(i);
            return Integer.parseInt(s);
        }
        
        
        public int compareTo(GiaoVien n) {
//            if (this.dTB < n.dTB) {
//                return 1;
//            }
//            else if(this.dTB == n.dTB && this.ma.compareTo(n.ma) > 0)
//                return 1;
            return -1;
        }

        @Override
        public String toString() {
            return  ma + " " + hoTen + " " + bacLuong + " " + phuCap + " " + thuNhap;
        }

    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<GiaoVien> listNV = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            
            listNV.add(new GiaoVien(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
        }
//        Collections.sort(listNV);
        int dem1 = 0;
        int dem2 = 0;
        for (GiaoVien nhanVien : listNV) {
            if(nhanVien.chucVu.equals("HT"))
            {
                dem1++;
                if(dem1 <= 1)
                    System.out.println(nhanVien);
            }
            else if(nhanVien.chucVu.equals("HP"))
            {
                dem2++;
                if(dem2 <= 2)
                    System.out.println(nhanVien);
            }
            else{
                System.out.println(nhanVien);
            }
        }
    }
    
}
