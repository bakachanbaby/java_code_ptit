
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

    public static class nhanVien {

        private String maNV;
        private String hoTen;
        private String gioiTinh;
        private String ngaySinh;
        private String diaChi;
        private String maSoThue;
        private String ngayKHD;

        private int ngay;
        private int thang;
        private int nam;

        public nhanVien(String maNV, String hoTen, String gioiTinh, String ngaySinh, String diaChi, String maSoThue, String ngayKHD) {
            this.maNV = maNV;
            this.hoTen = hoTen;
            this.gioiTinh = gioiTinh;
            this.ngaySinh = ngaySinh;
            this.diaChi = diaChi;
            this.maSoThue = maSoThue;
            this.ngayKHD = ngayKHD;
        }

        public String getHoTen() {
            return hoTen;
        }

        public void setHoTen(String hoTen) {
            this.hoTen = hoTen;
        }

        public String getGioiTinh() {
            return gioiTinh;
        }

        public void setGioiTinh(String gioiTinh) {
            this.gioiTinh = gioiTinh;
        }

        public String getNgaySinh() {
            return ngaySinh;
        }

        public void setNgaySinh(String ngaySinh) {
            this.ngaySinh = ngaySinh;
        }

        public String getDiaChi() {
            return diaChi;
        }

        public void setDiaChi(String diaChi) {
            this.diaChi = diaChi;
        }

        public String getMaSoThue() {
            return maSoThue;
        }

        public void setMaSoThue(String maSoThue) {
            this.maSoThue = maSoThue;
        }

        public String getNgayKHD() {
            return ngayKHD;
        }

        public void setNgayKHD(String ngayKHD) {
            this.ngayKHD = ngayKHD;
        }

        public int getNgay() {
            return ngay;
        }

        public void setNgay(int ngay) {
            this.ngay = ngay;
        }

        public int getThang() {
            return thang;
        }

        public void setThang(int thang) {
            this.thang = thang;
        }

        public int getNam() {
            return nam;
        }

        public void setNam(int nam) {
            this.nam = nam;
        }

        public void format() {
            String s = ngaySinh;
            String srr[] = s.split("/");
            String x = "";
            this.ngay = Integer.parseInt(srr[0]);
            this.thang = Integer.parseInt(srr[1]);
            this.nam = Integer.parseInt(srr[2]);

        }

        public void in() {
            System.out.println(maNV + " " + hoTen + " " + gioiTinh + " " + ngaySinh + " " + diaChi + " " + maSoThue + " " + ngayKHD);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<nhanVien> listNV = new ArrayList<nhanVien>();
        int k = 0;
        while (t-- > 0) {
            k++;
            String hoTen = sc.nextLine();
            String gioiTinh = sc.nextLine();
            String ngaySinh = sc.nextLine();
            String diaChi = sc.nextLine();
            String maSoThue = sc.nextLine();
            String ngayKHD = sc.nextLine();
            String maNV = String.format("%05d", k);
            nhanVien a = new nhanVien(maNV, hoTen, gioiTinh, ngaySinh, diaChi, maSoThue, ngayKHD);
            a.format();
            listNV.add(a);
        }
        Collections.sort(listNV, new Comparator<nhanVien>() {
            @Override
            public int compare(nhanVien o1, nhanVien o2) {
                if (o1.getNam() > o2.getNam()) {
                    return 1;
                } else if (o1.getNam() == o2.getNam() && o1.getThang() > o2.getThang()) {
                    return 1;
                } else if (o1.getNam() == o2.getNam() && o1.getThang() == o2.getThang() && o1.getNgay() > o2.getNgay()) {
                    return 1;
                }
                return -1;
            }
        });
        
        for (nhanVien vien : listNV) {
            vien.in();
        }

    }

}
