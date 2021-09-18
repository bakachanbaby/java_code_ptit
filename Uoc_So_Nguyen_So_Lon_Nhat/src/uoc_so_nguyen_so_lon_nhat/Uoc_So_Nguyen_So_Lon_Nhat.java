/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uoc_so_nguyen_so_lon_nhat;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Uoc_So_Nguyen_So_Lon_Nhat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        int sum = 0;
        while (t > 0) {
            
            long n = sc.nextLong();
            long s = n;
            long mx = 0;
            for (long i = 2; i <= Math.sqrt(n); i++) {
                while (s % i == 0) {
                    if(mx < i)
                        mx = i;
                    s /= i;
                }
            }
            if (s > 1 && mx < s) {
                mx = s;
            }
            System.out.println(mx);
            t--;
        }
    }
    
}
