/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mang_doi_xung;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Mang_doi_xung {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        t = Integer.parseInt(sc.nextLine());
        while(t > 0)
        {
            int n = sc.nextInt();
            int[] a = new int[n+5];
            for(int i = 0 ; i < n; i++)
                a[i] = sc.nextInt();
            boolean flat = false;
            for(int i = 0; i < n; i++)
            {
                if(a[i] != a[n-i-1])
                {
                    flat = true;
                    break;
                }
            }
            if(flat)
                System.out.println("NO");
            else
                System.out.println("YES");
            t--;
        }
    }
    
}
