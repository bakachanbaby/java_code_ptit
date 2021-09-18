/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xau_khac_nhau_dai_nhat;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Xau_Khac_Nhau_Dai_Nhat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            int n = s1.length();
            int m = s2.length();
            int mx = 0;
            for (int i = 0; i < n - 1; i++) {
                for (int j = i+1; j <= n; j++) {
                    String tmp = s1.substring(i, j);
                    if (!s2.contains(tmp) && tmp.length() > mx) {
                        mx = tmp.length();
                    }
                }
            }
           for (int i = 0; i < m - 1; i++) {
                for (int j = i+1; j <= m; j++) {
                    String tmp = s2.substring(i, j);
                    if (!s1.contains(tmp) && tmp.length() > mx) {
                        mx = tmp.length();
                    }
                }
            }
            if (mx > 0) {
                System.out.println(mx);
            } else {
                System.out.println(-1);
            }

        }
    }

}
