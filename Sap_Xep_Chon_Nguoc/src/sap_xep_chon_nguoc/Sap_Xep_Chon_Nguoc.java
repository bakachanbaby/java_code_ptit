/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sap_xep_chon_nguoc;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Sap_Xep_Chon_Nguoc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        t = Integer.parseInt(sc.nextLine());
//        int mx = 1000000000;
//        while (t > 0) {

        int n = sc.nextInt();
        int[] a = new int[n + 5];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        String s[] = new String[n+5];
        int dem = 0;
        int min_idx;
        for (int i = 0; i < n - 1; i++) {
            min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[min_idx]) {
                    min_idx = j;
                }
            }
            int tmp = a[min_idx];
            a[min_idx] = a[i];
            a[i] = tmp;
            s[dem] = "Buoc " + (i + 1) + ": ";
            //System.out.printf("Buoc " + (i + 1) + ": ");
            for (int k = 0; k < n; k++) {
                s[dem] = s[dem] + a[k] + " ";
                //System.out.printf(a[k] + " ");
            }
            dem++;
            //System.out.println();
        }
        for(int i = dem-1; i >= 0; i--){
            System.out.println(s[i]);
        }
    }

}
