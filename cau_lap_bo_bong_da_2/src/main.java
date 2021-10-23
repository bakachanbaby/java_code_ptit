
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

    public static class CLB implements Comparable<CLB>{

        protected String ma, tenCLB, maDoi;
        protected long giaVe, soLuong, thanhTien;

        public CLB(String ma, String tenCLB, long giaVe) {
            this.ma = ma;
            this.tenCLB = tenCLB;
            this.giaVe = giaVe;

        }

        @Override
        public int compareTo(CLB n) {
            if (this.thanhTien < n.thanhTien) {
                return 1;
            }
            else if(this.thanhTien == n.thanhTien && this.tenCLB.compareTo(n.tenCLB) > 0)
                return 1;

            return -1;
        }
        
        @Override
        public String toString() {
            return maDoi + " "+ tenCLB + " " + thanhTien;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = Long.parseLong(sc.nextLine());
        ArrayList<CLB> listXD = new ArrayList<>();
        for (long i = 1; i <= t; i++) {
//            String s = sc.nextLine();
//            String arr[] = s.split("\\s+");
            listXD.add(new CLB(sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine())));
        }

        t = Long.parseLong(sc.nextLine());
        while (t-- > 0) {
            String s = sc.nextLine();
            String arr[] = s.split("\\s+");
            String x = "";
            for (int i = 1; i <= 2; i++) {
                x += arr[0].charAt(i);
            }
            for (CLB clb : listXD) {
                if (x.equals(clb.ma)) {
                    long sL = Long.parseLong(arr[1]);
                    clb.soLuong = sL;
                    clb.maDoi = arr[0];
                    clb.thanhTien = clb.soLuong*clb.giaVe;
                    break;
                }
            }
        }
        Collections.sort(listXD);
        for (CLB clb : listXD) {
            System.out.println(clb);
        }
    }

}
