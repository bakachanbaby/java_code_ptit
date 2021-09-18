/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dem_so_lan_xuat_hien;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */


public class Dem_so_lan_xuat_hien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        t = Integer.parseInt(sc.nextLine());
        int k = 1;
        int mx = 1000000000;
        while (t > 0) {
            
            
            int n = sc.nextInt();
            int[] a = new int[n + 5];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            System.out.println("Test " + k++ + ":");
            for(int i = 0; i < n; i++)
            {
                int dem = 1;
                for(int j = i+1; j < n; j++)
                {
                    if(a[i] == a[j])
                    {
                        dem++;
                        a[j]=mx;
                    }
                }
                if(a[i] != mx)
                    System.out.println(a[i] + " xuat hien " + dem + " lan");
            }
            t--;
        }
    }

}
