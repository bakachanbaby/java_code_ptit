/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kiem_tra_so_fi;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Kiem_tra_So_Fi {

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
            long n;
            boolean flat = false;
            n = sc.nextLong();
            for(int i = 0; i <= 92; i++)
            {
                if(n == a[i])
                {
                    flat = true;
                    System.out.println("YES");
                    break;
                }
            }
            if(flat == false)
                System.out.println("NO");
            t--;
        }
    }
    
}
