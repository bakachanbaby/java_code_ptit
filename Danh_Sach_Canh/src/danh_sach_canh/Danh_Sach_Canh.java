/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package danh_sach_canh;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Danh_Sach_Canh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[][] = new int[1000][1000];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++)
            {
                a[i][j] = sc.nextInt();
                if(a[i][j] == 1 && j > i)
                    System.out.println("(" + (i+1) + "," + (j+1) + ")");
            }
                
        }
    }
    
}
