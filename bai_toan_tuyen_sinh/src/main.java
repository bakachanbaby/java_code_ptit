
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

    public static class ThiSinh {

        private String ma, hoTen, trangThai;
        private double diemUT, tongDiem, diem1, diem2, diem3;
        
        public ThiSinh(String ma, String hoTen, double diem1, double diem2, double diem3) {
            this.ma = ma;
            this.hoTen = hoTen;
            this.diem1 = diem1;
            this.diem2 = diem2;
            this.diem3 = diem3;
        }

        public void timDiemUT(){
            String s = "";
            for(int i = 0; i <= 2; i++)
                s += this.ma.charAt(i);
            if(s.equals("KV1"))
                this.diemUT = 0.5;
            else if(s.equals("KV2"))
                this.diemUT = 1;
            else 
                this.diemUT = 2.5;
        }
        
        public void timTongDiem(){
            double diem = diem1+diem1+diem2+diem3;
            this.tongDiem = diem;
        }
        
        public void timTrangThai(){
            if(tongDiem+diemUT < 24)
                this.trangThai = "TRUOT";
            else 
                this.trangThai =  "TRUNG TUYEN";
        }

        @Override
        public String toString() {
            timDiemUT();
            timTongDiem();
            timTrangThai();
            int intDiemUT = (int) diemUT;
            int intTongDiem = (int) tongDiem;
            if(intDiemUT == diemUT){
                if(intTongDiem == tongDiem){
                    return  ma + " " + hoTen + " " + intDiemUT + " " + intTongDiem + " " + trangThai;
                }
                else{
                    return  ma + " " + hoTen + " " + intDiemUT + " " + tongDiem + " " + trangThai;
                }
            }
            else{
                if(intTongDiem == tongDiem){
                    return  ma + " " + hoTen + " " + diemUT + " " + intTongDiem + " " + trangThai;
                }
                else{
                    return  ma + " " + hoTen + " " + diemUT + " " + tongDiem + " " + trangThai;
                }
            }
            
        }
        
        

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int t = Integer.parseInt(in.nextLine());
        ArrayList<ThiSinh> listNV = new ArrayList<>();
//        for (int i = 1; i <= t; i++) {
            listNV.add(new ThiSinh(in.nextLine(), in.nextLine(), Double.parseDouble(in.nextLine()), Double.parseDouble(in.nextLine()), Double.parseDouble(in.nextLine())));
//        }
//        Collections.sort(listNV);
        
        for (ThiSinh thiSinh : listNV) {
            System.out.println(thiSinh);
        }
    }
}
