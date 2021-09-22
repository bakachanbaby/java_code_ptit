
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

        private String hoTen;
        private String ngaySinh;
        private int ngay;
        private int thang;
        private int nam;

        public nhanVien(String hoTen, String ngaySinh) {
            this.hoTen = hoTen;
            this.ngaySinh = ngaySinh;
        }

        public String getHoTen() {
            return hoTen;
        }

        public void setHoTen(String hoTen) {
            this.hoTen = hoTen;
        }

        public String getNgaySinh() {
            return ngaySinh;
        }

        public void setNgaySinh(String ngaySinh) {
            this.ngaySinh = ngaySinh;
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

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<nhanVien> listNV = new ArrayList<nhanVien>();
        int k = 0;
        while (t-- > 0) {
            k++;
            String s = sc.nextLine();
            String srr[] = s.split("\\s+");
            String hoTen = srr[0];
            String ngaySinh = srr[1];
            nhanVien a = new nhanVien(hoTen, ngaySinh);
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
        System.out.println(listNV.get(k-1).getHoTen());
        System.out.println(listNV.get(0).getHoTen());


    }

}
