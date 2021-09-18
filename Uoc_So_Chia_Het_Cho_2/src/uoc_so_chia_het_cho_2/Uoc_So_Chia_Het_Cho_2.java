/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uoc_so_chia_het_cho_2;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Uoc_So_Chia_Het_Cho_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {            
            long n = sc.nextLong();
            long dem = 0;
            for(long i = 1; i <= Math.sqrt(n); i++){
                if(Math.sqrt(n) == i && i%2==0)
                    dem++;
                if(Math.sqrt(n) != i)
                {
                    if(n%i==0 && i % 2 == 0)
                        dem++;
                    if(n % (n/i) == 0 && (n/i)%2==0)
                        dem++;
                }
            }
            System.out.println(dem);
            t--;
        }
    }
    
}
