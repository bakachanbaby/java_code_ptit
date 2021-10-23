
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

    public static class HocSinh implements Comparable<HocSinh> {

        private String ma, hoTen, xepLoai;
        private double diemTB;
        private int xepHang;

        public HocSinh(int stt, String hoTen, double diemTB) {
            this.ma = "HS" + String.format("%02d", stt);
            this.hoTen = hoTen;
            this.diemTB = diemTB;
            this.xepLoai = tinhXepLoai();
        }

        public String tinhXepLoai() {
            if (diemTB < 5) {
                return "Yeu";
            } else if (diemTB < 7) {
                return "Trung Binh";
            } else if (diemTB < 9) {
                return "Kha";
            } else {
                return "Gioi";
            }
        }

        @Override
        public int compareTo(HocSinh n) {
            if (this.diemTB < n.diemTB) {
                return 1;
            }

            return -1;
        }

        @Override
        public String toString() {
            return ma + " " + hoTen + " " + diemTB + " " + xepLoai + " " + xepHang;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<HocSinh> listXD = new ArrayList<>();
        ArrayList<HocSinh> listXD2 = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            HocSinh a = new HocSinh(i, sc.nextLine(), Double.parseDouble(sc.nextLine()));
            listXD.add(a);
            listXD2.add(a);
        }

        Collections.sort(listXD);
        listXD.get(0).xepHang = 1;
        for (int i = 1; i < listXD.size(); i++) {
            if (listXD.get(i).diemTB == listXD.get(i - 1).diemTB) {
                listXD.get(i).xepHang = listXD.get(i - 1).xepHang;
            } else {
                listXD.get(i).xepHang = i+1;
            }
        }
        for (HocSinh hocSinh : listXD2) {
            System.out.println(hocSinh);
        }
    }

}
