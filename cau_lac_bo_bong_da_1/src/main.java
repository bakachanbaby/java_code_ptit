
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

    public static class CLB {

        protected String ma, tenCLB;
        protected long giaVe, soLuong, thanhTien;

        public CLB(String ma, String tenCLB, long giaVe) {
            this.ma = ma;
            this.tenCLB = tenCLB;
            this.giaVe = giaVe;

        }

        @Override
        public String toString() {
            thanhTien = soLuong * giaVe;
            return tenCLB + " " + thanhTien;
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
                    System.out.print(arr[0] + " ");
                    System.out.println(clb);
                    break;
                }
            }

        }
    }

}
