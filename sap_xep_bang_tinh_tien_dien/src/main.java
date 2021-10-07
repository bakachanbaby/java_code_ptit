
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
    
    public static class TienDien implements Comparable<TienDien> {
        
        private String sD, maKH;
        private int chiSoCu, chiSoMoi, heSo, thanhtien, phuTroi, tongTien;
        
        public TienDien(int sTT, String sD, int chiSoCu, int chiSoMoi) {
            this.maKH = "KH" + String.format("%02d", sTT);
            this.chiSoCu = chiSoCu;
            this.chiSoMoi = chiSoMoi;
            this.heSo = tinhHeSo(sD);
            this.thanhtien = (chiSoMoi - chiSoCu) * this.heSo * 550;
            this.phuTroi = tinhPhuTroi(chiSoMoi, chiSoCu, this.thanhtien);
            this.tongTien = this.phuTroi + this.thanhtien;
        }

        private static int tinhHeSo(String sD) {
            if (sD.equals("KD")) {
                return 3;
            } else if (sD.equals("NN")) {
                return 5;
            } else if (sD.equals("TT")) {
                return 4;
            } else {
                return 2;
            }
        }

        private static int tinhPhuTroi(int chiSoMoi, int chiSoCu, int thanhTien) {
            int chiSo = chiSoMoi - chiSoCu;
            if (chiSo < 50) {
                return 0;
            } else if (chiSo <= 100) {
                float x = (float) (thanhTien * 0.35);
                x = Math.round(x);
                return (int) (x);
            } else {
                return thanhTien;
            }
            
        }

        public int compareTo(TienDien n) {
            if (this.tongTien <= n.tongTien) {
                return 1;
            }
            return -1;
        }

        @Override
        public String toString() {
            return maKH + " " + heSo + " " + thanhtien + " " + phuTroi + " " + tongTien;
        }
        
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        ArrayList<TienDien> listTD = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            listTD.add(new TienDien(i, in.nextLine(), Integer.parseInt(in.nextLine()), Integer.parseInt(in.nextLine())));
        }
        Collections.sort(listTD);
        for (TienDien tienDien : listTD) {
            System.out.println(tienDien);
        }
    }
}
