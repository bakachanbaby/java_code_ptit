/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boi_so_nho_nhat;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Boi_So_Nho_Nhat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextInt();
        while (t > 0) {
            long n = sc.nextLong();
            long x = 1;
            for(long i = 1; i <= n; i++)
                x = BCNN(x, i);
            System.out.println(x);
            t--;
        }
    }

    public static long UCLN(long a, long b) {
        if (b == 0) {
            return a;
        }
        return UCLN(b, a % b);
    }

    public static long BCNN(long a, long b) {
        return (a * b) / UCLN(a, b);
    }

}
