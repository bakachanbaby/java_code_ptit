/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t>0) {
            long n = in.nextLong();
            long dem = 0;
            if(n % 2 == 0) dem++;
            for(long i=2 ; i<=Math.sqrt(n) ; i++) {
                if(n % i == 0)
                {
                    if( i % 2 == 0 ) dem++;
                }
                if(n % (n/i) == 0 && (n/i) % 2 == 0)    dem++;
            }
            System.out.println(dem);
            t--;
        }
    }
}
