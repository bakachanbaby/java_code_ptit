
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
        private String hoTen, ngaySinh;
        private double d1, d2, d3, tD;

        public ThuKhoa( int stt, String hoTen, String ngaySinh, double d1, double d2, double d3) {
            this.hoTen = hoTen;
            this.ngaySinh = ngaySinh;
            this.stt = stt;
            this.d1 = d1;
            this.d2 = d2;
            this.d3 = d3;
            this.tD = d1+d2+d3;
        }
        
        public int compareTo(ThuKhoa n) {
            if (this.tD < n.tD) {
                return 1;
            }
            else if(this.tD == n.tD && this.stt > n.stt){
                return 1;
            }
            return -1;
        }

        @Override
        public String toString() {
            return  stt + " " + hoTen + " " + ngaySinh + " " + tD ;
        }
        
        
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<ThuKhoa> listNV = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            
            listNV.add(new ThuKhoa(i, sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(listNV);
        double diemTK = listNV.get(0).tD;
        for (ThuKhoa nhanVien : listNV) {
            if(diemTK == nhanVien.tD)
            System.out.println(nhanVien);
        }
    }
    
}
