/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sap_xep_doi_cho_truc_tiep_nguoc;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Sap_Xep_Doi_Cho_Truc_Tiep_Nguoc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        int t;
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
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (a[i] > a[j]) {
                        int tmp = a[i];
                        a[i] = a[j];
                        a[j] = tmp;
                    }
                }
                s[dem] = "Buoc " + (i + 1) + ": ";
                //System.out.printf("Buoc " + (i + 1) + ": ");
                for (int k = 0; k < n; k++) {
                    s[dem] += a[k] + " ";
                    //System.out.printf(a[k] + " ");
                }
                dem++;
                //System.out.println();
                
            }
            for (int i = dem - 1; i >= 0; i--) {
                    System.out.println(s[i]);
                }
        }

//        }
    }

}
