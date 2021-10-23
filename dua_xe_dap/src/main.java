
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

    public static class DuaXe implements Comparable<DuaXe>{
        private String ma,  hoTen, donVi, thoiDiem;
        private double tocDo;

        public DuaXe(String hoTen, String donVi, String thoiDiem) {
            this.hoTen = hoTen;
            this.donVi = donVi;
            this.thoiDiem = thoiDiem;
            this.ma = tinhMa(hoTen, donVi);
            this.tocDo = tinhTocDo(thoiDiem);
        }

        private String tinhMa(String hoTen, String donVi){
            String a[] = hoTen.split("\\s+");
            String b[] = donVi.split("\\s+");
            String s = "";
            for (String string : b) {
                s += string.charAt(0);
            }
            for (String string : a) {
                s +=string.charAt(0);
            }
            return s;
        }
        
        private double tinhTocDo(String thoiDiem){
            String arr[] = thoiDiem.split(":");
            double x = Double.parseDouble(arr[0]);
            double y = Double.parseDouble(arr[1]);
            double z = x-6+y/60;
            return 120/z;
            
        }
        
        
        private String tinhXH(double tongDiem){
            if(tongDiem < 18)
                return "LOAI";
            else 
                return "TRUNG TUYEN";
        }
        private double tinhDiemUT(String maXT){
            char x = maXT.charAt(1);
            if(x == '1')
                return 2;
            else if(x == '2')
                return 1.5;
            else if(x == '3')
                return 1;
            else 
                return 0;
            
        }
        
        @Override
        public int compareTo(DuaXe n) {
            if (this.tocDo < n.tocDo) {
                return 1;
            }
            else if(this.tocDo == n.tocDo && this.ma.compareTo(n.ma) > 0)
                return 1;
//            else if(this.tongDiem == n.tongDiem&& this.ma.compareTo(n.ma) > 0)
//                return 1;
            return -1;
        }

        @Override
        public String toString() {
            
            return ma + " " + hoTen + " " + donVi + " " + String.format("%.0f", tocDo) + " Km/h";
        }

        

        
   
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = Integer.parseInt(sc.nextLine());
        ArrayList<DuaXe> listXD = new ArrayList<>();
        for (long i = 1; i <= t; i++) {
            
            listXD.add(new DuaXe(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(listXD);
        listXD.forEach(nhanVien -> {
            System.out.println(nhanVien);
        });
    }
    
}
