
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

    public static class ThuKhoa implements Comparable<ThuKhoa>{
        private int stt;
        private String tenHang, nhomHang, loiNhuan;
        private double giaMua, giaBan, LN;

        public ThuKhoa( int stt, String tenHang, String nhomHang, double giaMua, double giaBan) {
            this.tenHang = tenHang;
            this.nhomHang = nhomHang;
            this.stt = stt;
            this.giaMua = giaMua;
            this.giaBan = giaBan;
            this.loiNhuan = String.format("%.2f", this.giaBan-this.giaMua);
            this.LN = this.giaBan-this.giaMua;
        }
        
        public int compareTo(ThuKhoa n) {
            if (this.LN < n.LN) {
                return 1;
            }
            return -1;
        }

        @Override
        public String toString() {
            return  stt + " " + tenHang + " " + nhomHang + " " + loiNhuan;
        }

        
        
        
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<ThuKhoa> listNV = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            
            listNV.add(new ThuKhoa(i, sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(listNV);
        for (ThuKhoa nhanVien : listNV) {
            System.out.println(nhanVien);
        }
    }
    
}
