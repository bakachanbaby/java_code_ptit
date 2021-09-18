/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tinh_so_fi;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */

final 
public class Tinh_so_fi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int t;
        Scanner sc = new Scanner(System.in);
        t = Integer.parseInt(sc.nextLine());
        while(t > 0)
        {
            long n;
            n = Long.parseLong(sc.nextLine());
            fi(n);
            t--;
        }
    }
    
    public static void fi(long n){
        long a = 0;
        long b = 1;
        
        for(long i = 1; i <= n; i++){
            long sum = a+b;
            a = b;
            b = sum;
        }
        System.out.println(a);
    } 
    
}
