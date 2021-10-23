
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
        private String ma,  tenHang;
        private long soLuong,giaBan, tienCK, tongTien;

        public ThuKhoa( String ma, String tenHang,long soLuong, long giaBan, long tienCK) {
            this.tenHang = tenHang;
            this.ma = ma;
            this.soLuong =soLuong;
            this.giaBan = giaBan;
            this.tienCK = tienCK;
            this.tongTien = giaBan*soLuong-this.tienCK;
        }
        
        public int compareTo(ThuKhoa n) {
            if (this.tongTien< n.tongTien) {
                return 1;
            }
            return -1;
        }

        @Override
        public String toString() {
            return  ma + " " + tenHang + " " + soLuong + " " + giaBan + " " + tienCK + " " + tongTien;
        }


        
        
        
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = Integer.parseInt(sc.nextLine());
        ArrayList<ThuKhoa> listNV = new ArrayList<>();
        for (long i = 1; i <= t; i++) {
            
            listNV.add(new ThuKhoa(sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine())));
        }
        Collections.sort(listNV);
        for (ThuKhoa nhanVien : listNV) {
            System.out.println(nhanVien);
        }
    }
    
}
