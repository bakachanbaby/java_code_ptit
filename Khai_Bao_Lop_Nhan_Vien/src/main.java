
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

    public static class nhanVien{
        private String hoTen;
        private String gioiTinh;
        private String ngaySinh;
        private String diaChi;
        private String maSoThue;
        private String ngayKHD;

        public nhanVien(String hoTen, String gioiTinh, String ngaySinh, String diaChi, String maSoThue, String ngayKHD) {
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

        public void in(){
            System.out.println("00001 " + hoTen + " " + gioiTinh + " " + ngaySinh + " " + diaChi + " " + maSoThue + " " + ngayKHD);
        }
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hoTen = sc.nextLine();
        String gioiTinh = sc.nextLine();
        String ngaySinh = sc.nextLine();
        String diaChi = sc.nextLine();
        String maSoThue = sc.nextLine();
        String ngayKHD = sc.nextLine();
        nhanVien a = new nhanVien(hoTen, gioiTinh, ngaySinh, diaChi, maSoThue, ngayKHD);
        a.in();
        
    }
    
}
