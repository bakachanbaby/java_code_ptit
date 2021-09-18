/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sap_xep_noi_bot_nguoc;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Sap_Xep_Noi_Bot_Nguoc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        t = Integer.parseInt(sc.nextLine());
//        int mx = 1000000000;
//        while (t > 0) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n + 5];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            String s[] = new String[n + 5];
            int dem = 0;
            int i, j;
            boolean haveSwap = false;
            for (i = 0; i < n - 1; i++) {
                // i phần tử cuối cùng đã được sắp xếp
                haveSwap = false;
                for (j = 0; j < n - i - 1; j++) {
                    if (a[j] > a[j + 1]) {
                        int tmp = a[j];
                        a[j] = a[j + 1];
                        a[j + 1] = tmp;
                        haveSwap = true; // Kiểm tra lần lặp này có swap không
                    }
                }
                // Nếu không có swap nào được thực hiện => mảng đã sắp xếp. Không cần in
                if (haveSwap) {
                    s[dem] = "Buoc " + (i + 1) + ": ";
                    //System.out.printf("Buoc " + (i + 1) + ": ");
                    for (int k = 0; k < n; k++) {
                        s[dem] += a[k] + " ";
                        //System.out.printf(a[k] + " ");
                    }
                    dem++;
                    //System.out.println();
                }

            }
            for (i = dem - 1; i >= 0; i--) {
                System.out.println(s[i]);
            }
        }

    }

}
