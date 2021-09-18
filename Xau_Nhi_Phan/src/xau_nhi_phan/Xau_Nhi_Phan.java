/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xau_nhi_phan;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Xau_Nhi_Phan {

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
            int n = sc.nextInt();
            long k = sc.nextLong();
            System.out.println(Fi(n, k, a));
            t--;
        }
    }
    
    public static String Fi(int n, long k, long a[]){
        if(n == 1)
            return "0";
        if(n == 2)
            return "1";
        if(k <= a[n-2])
            return Fi(n-2, k, a);
        return Fi(n-1 ,k - a[n-2], a);
    }
}
