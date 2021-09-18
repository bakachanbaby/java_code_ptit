/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tich_ma_tran_chuyen_vi;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Tich_Ma_Tran_Chuyen_Vi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int x = 1;
        while (t > 0) {
            int n, m;
            n = scanner.nextInt();
            m = scanner.nextInt();

            int[][] a = new int[n + 5][m + 5];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = scanner.nextInt();
                }
            }
            int[][] b = new int[m + 5][n + 5];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    b[j][i] = a[i][j];
                }
            }
            int[][] c = new int[n + 5][n + 5];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    c[i][j] = 0;
                    for (int k = 0; k < m; k++) {
                        c[i][j] += a[i][k] * b[k][j];
                    }
                }
            }
            System.out.println("Test " + (x++) + ": ");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.printf(c[i][j] + " ");
                }
                System.out.println();
            }
            t--;
        }
    }
}
