/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boi_chung_uoc_chung;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Boi_Chung_Uoc_Chung {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextInt();
        while(t > 0){
            long a = sc.nextInt();
            long b = sc.nextInt();
            System.out.println(BCNN(a, b) + " " + UCLN(a, b));
            t--;
        }
    }
    
    public static long UCLN(long a, long b){
        if(b == 0)
            return a;
        return UCLN(b, a % b);
    }
    
    public static long BCNN(long a, long b) {
        return (a*b)/UCLN(a, b);
    }
}
