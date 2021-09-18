
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

    public static class thiSinh{
        private String hoTen;
        private String maLop;
        private String ngaySinh;
        private float gpa;

        public thiSinh(String hoTen, String maLop, String ngaySinh, float gpa) {
            this.hoTen = hoTen;
            this.maLop = maLop;
            this.ngaySinh = ngaySinh;
            this.gpa = gpa;
        }

        public String getHoTen() {
            return hoTen;
        }

        public void setHoTen(String hoTen) {
            this.hoTen = hoTen;
        }

        public String getMaSV() {
            return maLop;
        }

        public void setMaSV(String maLop) {
            this.maLop = maLop;
        }

        public String getNgaySinh() {
            return ngaySinh;
        }

        public void setNgaySinh(String ngaySinh) {
            this.ngaySinh = ngaySinh;
        }

        public float getGpa() {
            return gpa;
        }

        public void setGpa(float gpa) {
            this.gpa = gpa;
        }
        public void format(){
            String s = ngaySinh;
            String srr[] = s.split("/");
            String x = "";
            for(int i = 0; i < srr.length-1; i++){
                if(srr[i].length() < 2){
                    srr[i] = "0" + srr[i];
                }
                x += srr[i] + "/";
            }
            x += srr[srr.length-1];
            this.ngaySinh = x;
            
        }
        public void in(){
            System.out.print("B20DCCN001 " + hoTen + " " + maLop + " " + ngaySinh + " ");
            System.out.printf("%.2f", gpa);
        }
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hoTen = sc.nextLine();
        String maLop = sc.nextLine();
        String ngaySinh = sc.nextLine();
        Float gpa = Float.parseFloat(sc.nextLine());
        thiSinh a = new thiSinh(hoTen,maLop, ngaySinh, gpa);
        a.format();
        a.in();
        
    }
    
}
