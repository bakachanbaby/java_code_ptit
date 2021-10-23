

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

    public static class KhachHang implements Comparable<KhachHang> {

        private String ma, hoTen;
        private long chiSoCu, chiSoMoi, donGia,phuPhi, soM3, thanhTien;

        public KhachHang(long stt, String hoTen, long chiSoCu, long chiSoMoi) {
            this.ma = "KH" + String.format("%02d", stt);
            this.hoTen = hoTen;
            this.chiSoCu = chiSoCu;
            this.chiSoMoi = chiSoMoi;
            this.soM3 = chiSoMoi-chiSoCu;
            this.thanhTien = tinhThanhTien(soM3);
        }

        private long tinhThanhTien(long soM3){
            if(soM3 <= 50)
                return Math.round((100*soM3)*1.02);
            else if(soM3 <=100)
                return Math.round(((100*50)+((soM3-50)*150))*1.03);
            else 
                return Math.round(((100*50)+(50*150)+((soM3-100)*200))*1.05);
        }

        @Override
        public int compareTo(KhachHang n) {
            if (this.thanhTien < n.thanhTien) {
                return 1;
            }
//            else if(this.tocDo == n.tocDo && this.ma.compareTo(n.ma) > 0)
//                return 1;

            return -1;
        }

        @Override
        public String toString() {
            return  ma + " " + hoTen + " " + thanhTien;
        }

        

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = Integer.parseInt(sc.nextLine());
        ArrayList<KhachHang> listXD = new ArrayList<>();
        for (long i = 1; i <= t; i++) {

            listXD.add(new KhachHang(i, sc.nextLine(),Long.parseLong(sc.nextLine()),Long.parseLong(sc.nextLine())));
        }
        Collections.sort(listXD);
        listXD.forEach(nhanVien -> {
            System.out.println(nhanVien);
        });
    }

}
