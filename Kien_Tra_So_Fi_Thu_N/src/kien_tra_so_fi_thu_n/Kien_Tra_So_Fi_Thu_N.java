/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kien_tra_so_fi_thu_n;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Kien_Tra_So_Fi_Thu_N {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int t;
        Scanner sc = new Scanner(System.in);
        t = Integer.parseInt(sc.nextLine());
        long a[] = new long[100];
        a[0] = 0;
        a[1] = 1;
        for(int i = 2; i <= 92; i++)
        {
            a[i] = a[i-1]+a[i-2];
        }  
        while(t > 0)
        {
            int n;
            n = sc.nextInt();
            System.out.println(a[n]);
            t--;
        }
    }
    
    
}
