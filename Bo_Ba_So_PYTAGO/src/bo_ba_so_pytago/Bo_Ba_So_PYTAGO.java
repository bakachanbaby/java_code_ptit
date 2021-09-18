/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo_ba_so_pytago;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Bo_Ba_So_PYTAGO {

    /**
     * @param args the command line arguments
     */
    static boolean check(long[] a, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (Arrays.binarySearch(a, a[i] + a[j]) >= 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                long x = sc.nextInt();
                a[i] = x * x;
            }
            Arrays.sort(a);
            if (check(a, n)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

}
