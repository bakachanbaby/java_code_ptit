/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diem_can_bang;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Diem_Can_Bang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int a[] = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                a[i] = sc.nextInt();
            }
//            boolean flat = false;
//            if (n == 1) {
//                System.out.println(n);
//                continue;
//            }
//            if (n == 2) {
//                System.out.println(-1);
//                continue;
//            }
//            int x = a[2];
            int sumL = a[1];
            int sumR = 0;
            for (int i = 3; i <= n; i++) {
                sumR += a[i];
            }
            if (sumL == sumR) {
                System.out.println(2);
                continue;
            }
            int x = -1;
            for (int i = 3; i <= n; i++) {
                sumL += a[i - 1];
                sumR -= a[i];
                if (sumL == sumR) {
//                    flat = true;
//                    System.out.println();
                    x = i;
                    break;
                }
            }
//            if (flat == false) {
//                System.out.println(-1);
//            }
            System.out.println(x);
            t--;
        }
    }

}
