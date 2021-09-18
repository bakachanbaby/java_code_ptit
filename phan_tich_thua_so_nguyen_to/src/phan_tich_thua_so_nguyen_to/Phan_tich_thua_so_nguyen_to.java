/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phan_tich_thua_so_nguyen_to;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Phan_tich_thua_so_nguyen_to {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        t = Integer.parseInt(sc.nextLine());
        int k = 1;
        while(t > 0)
        {
            
            int n = Integer.parseInt(sc.nextLine());
            int s = n;
            System.out.printf("Test " + k + ": ");
            for(int i = 2; i <= Math.sqrt(n); i++)
            {
                int dem = 0;
                while(s % i == 0)
                {
                    dem++;
                    s/=i;
                }
                if(dem > 0)
                    System.out.printf( i + "(" + dem + ") ");
            }
            if(s > 1)
                System.out.printf(s + "(1)");
            System.out.println();
            t--;
            k++;
        }
    }
    
}
