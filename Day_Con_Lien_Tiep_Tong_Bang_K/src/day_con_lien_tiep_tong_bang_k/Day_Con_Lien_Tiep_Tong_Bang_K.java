/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day_con_lien_tiep_tong_bang_k;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Day_Con_Lien_Tiep_Tong_Bang_K {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            long a[] = new long[n + 5];
            for (int i = 1; i <= n; i++) {
                a[i] = sc.nextLong();
            }
            boolean flat = false;
            int iL = 1;
            int iR = iL;
            long sum = a[1];
            while (iR <= n) {
                if (sum == k) {
                    flat = true;
                    break;
                } else if (sum < k) {
                    iR++;
                    sum += a[iR];
                } else {
                    sum = sum - a[iL++];
                    if (iL > iR) {
                        iR = iL;
                        sum = a[iL];
                    }
                }
            }
            if (flat) {
                System.out.println("YES");
            } else {
                System.out.println("NO");

            }
        }
    }

}
