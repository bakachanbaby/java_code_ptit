/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sap_xep_chon;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Sap_Xep_Chon {

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
        
        int min_idx;
    for (int i = 0; i < n - 1; i++)
    {
        min_idx = i;
        for (int j = i + 1; j < n; j++)
            if (a[j] < a[min_idx])
                min_idx = j;
        int tmp = a[min_idx];
        a[min_idx] = a[i];
        a[i] = tmp;
        System.out.printf("Buoc " + (i + 1) + ": ");
        for(int k = 0; k < n; k++)
            System.out.printf(a[k] + " ");
        System.out.println();
    }
    }
    
}
