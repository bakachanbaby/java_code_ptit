import java.util.ArrayList;
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

    public static class nhanVien {

        private String maNV;
        private String hoTen;
        private String chucVu;
        private int phuCapCV;
        private int luongCB;
        private int soNgay;
        private int luongChinh;
        private int tamUng;
        private int conLai;

        public nhanVien(String maNV, String hoTen, String chucVu, int luongCB, int soNgay) {
            this.maNV = maNV;
            this.hoTen = hoTen;
            this.chucVu = chucVu;
            this.luongCB = luongCB;
            this.soNgay = soNgay;
        }

        public String getMaNV() {
            return maNV;
        }

        public void setMaNV(String maNV) {
            this.maNV = maNV;
        }

        public String getHoTen() {
            return hoTen;
        }

        public void setHoTen(String hoTen) {
            this.hoTen = hoTen;
        }

        public String getChucVu() {
            return chucVu;
        }

        public void setChucVu(String chucVu) {
            this.chucVu = chucVu;
        }

        public int getLuongCB() {
            return luongCB;
        }

        public void setLuongCB(int luongCB) {
            this.luongCB = luongCB;
        }

        public int getSoNgay() {
            return soNgay;
        }

        public void setSoNgay(int soNgay) {
            this.soNgay = soNgay;
        }

        public int getLuongChinh() {
            return luongChinh;
        }

        public void setLuongChinh(int luongChinh) {
            this.luongChinh = luongChinh;
        }

        public int getTamUng() {
            return tamUng;
        }

        public void setTamUng(int tamUng) {
            this.tamUng = tamUng;
        }

        public int getConLai() {
            return conLai;
        }

        public void setConLai(int conLai) {
            this.conLai = conLai;
        }

        public int getPhuCapCV() {
            return phuCapCV;
        }

        public void setPhuCapCV(int phuCapCV) {
            this.phuCapCV = phuCapCV;
        }

        public void tinhPhuCapCV() {
            if (chucVu.equals("GD")) {
                this.phuCapCV = 500;
            } else if (chucVu.equals("PGD")) {
                this.phuCapCV = 400;
            } else if (chucVu.equals("TP")) {
                this.phuCapCV = 300;
            } else if (chucVu.equals("KT")) {
                this.phuCapCV = 250;
            } else {
                this.phuCapCV = 100;
            }
        }

        public void tinhLuong() {
            this.luongChinh = luongCB * soNgay;
        }

        public void tinhTamUng() {
            if ((phuCapCV + luongChinh) * 2 / 3 < 25000) {
                this.tamUng = (((phuCapCV + luongChinh) * 2 / 3) + 500) / 1000 * 1000;
            } else {
                this.tamUng = 25000;
            }
            this.conLai = phuCapCV + luongChinh - tamUng;
        }

        @Override
        public String toString() {
            return maNV + " " + hoTen + " " + phuCapCV + " " + luongChinh + " " + tamUng + " " + conLai;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<nhanVien> listNV = new ArrayList<nhanVien>();
        int k = 1;
        while (t-- > 0) {
            String hoTen = sc.nextLine();
            String chucVu = sc.nextLine();
            int luongCB = Integer.parseInt(sc.nextLine());
            int soNgay = Integer.parseInt(sc.nextLine());
            String maNV = "NV" + String.format("%02d", k++);
            nhanVien a = new nhanVien(maNV, hoTen, chucVu, luongCB, soNgay);
            a.tinhPhuCapCV();
            a.tinhLuong();
            a.tinhTamUng();
            listNV.add(a);
        }

        for (nhanVien vien : listNV) {
            System.out.println(vien.toString());
        }
    }

}