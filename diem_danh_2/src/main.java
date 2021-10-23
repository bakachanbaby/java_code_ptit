
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

    public static class SinhVien implements Comparable<SinhVien> {

        private String ma, hoTen, Lop, xepLoai, diemDanh;
        private int chuyenCan;

        public SinhVien(String ma, String hoTen, String Lop) {
            this.ma = ma;
            this.hoTen = hoTen;
            this.Lop = Lop;
            
        }

        public void tinhCC(String diemDanh){
            int dem1 = 0, dem2 = 0;
            for (int i = 0; i < diemDanh.length(); i++) {
                if(diemDanh.charAt(i) == 'm')
                    dem1++;
                else if(diemDanh.charAt(i) == 'v')
                    dem2++;
            }
            int diem = 10-dem1-dem2*2;
            if(diem <= 0)
                diem = 0;
            this.chuyenCan = diem;
        }
        
        public void tinhXL(){
            if(this.chuyenCan == 0)
                this.xepLoai = "KDDK";
            else
            this.xepLoai = "";
        }
        

        @Override
        public int compareTo(SinhVien n) {
//            if (this.diemTB < n.diemTB) {
//                return 1;
//            }

            return -1;
        }

        @Override
        public String toString() {
            return  ma + " " + hoTen + " " + Lop + " " + chuyenCan + " " + xepLoai ;
        }

        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> listXD = new ArrayList<>();
        
        for (int i = 1; i <= t; i++) {
            SinhVien a = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine());
            listXD.add(a);
        }

//        Collections.sort(listXD);
        for(int i = 1; i <= t; i++){
            String s[] = sc.nextLine().trim().split("\\s+");
            String ma = s[0], diemDanh = s[1];
            for (SinhVien j: listXD) {
                if(j.ma.equalsIgnoreCase(ma)){
                    j.tinhCC(diemDanh);
                    j.tinhXL();
                    break;
                }
            }
        }
        String x = sc.nextLine();
        for (SinhVien sinhVien : listXD) {
            if(x.equalsIgnoreCase(sinhVien.Lop))
            System.out.println(sinhVien);
        }
    }

}
