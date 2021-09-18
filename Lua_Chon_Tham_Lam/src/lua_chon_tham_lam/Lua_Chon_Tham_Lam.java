/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lua_chon_tham_lam;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Lua_Chon_Tham_Lam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int s = sc.nextInt();
        int a[] = new int[m + 5];
        if (m == 1 && s == 0) {
            System.out.println(0 + " " + 0);
        } else if (s == 0 || s > m * 9) {
            System.out.println(-1 + " " + -1);
        } else {
            int sum = s;
            for (int i = 1; i <= m; i++) {
                a[i] = 0;
            }
            for (int i = m; i >= 1; i--) {
                for (int j = 9; j >= 0; j--) {
                    if (sum - j > 0) {
                        a[i] = j;
                        sum -= j;
                        break;
                    }
                    if (sum - j >= 0 && i == 1) {
                        a[i] = j;
                        sum -= j;
                        break;
                    }
                }
            }
            for (int i = 1; i <= m; i++) {
                System.out.print(a[i]);
            }
            System.out.print(" ");
            sum = s;
            for (int i = 1; i <= m; i++) {
                a[i] = 0;
            }
            for (int i = 1; i <= m; i++) {
                for (int j = 9; j >= 0; j--) {
                    if (sum - j >= 0) {
                        a[i] = j;
                        sum -= j;
                        break;
                    }
                }
            }
            for (int i = 1; i <= m; i++) {
                System.out.print(a[i]);
            }
        }
    }

}
