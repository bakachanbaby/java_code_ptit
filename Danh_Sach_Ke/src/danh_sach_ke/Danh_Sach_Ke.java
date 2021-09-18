/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package danh_sach_ke;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Danh_Sach_Ke {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[][] = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++)
                a[i][j] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            System.out.print("List(" + (i+1) + ") = ");
            for(int j = 0; j < n; j++)
            {
                if(a[i][j] == 1)
                    System.out.print(j+1 + " ");
            }
            System.out.println();
        }
    }
    
}
