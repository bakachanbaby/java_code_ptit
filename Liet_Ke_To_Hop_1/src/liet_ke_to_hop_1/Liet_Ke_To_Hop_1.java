/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liet_ke_to_hop_1;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Liet_Ke_To_Hop_1 {

    public static int n, k, dem = 0;
    public static int a[] = new int[100];
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        for (int i = 0; i < 100; i++) {
            a[i] = 0;
        }
        backTrack(1);
        System.out.println("Tong cong co " + dem + " to hop");

    }
    
    public static void backTrack(int i){
        for(int j = a[i-1]+1; j <= n - k +i; j++){
            a[i] = j;
            if(i == k)
                in();
            else 
                backTrack(i+1);
        }
    }
    
    public static void in(){
        for(int i = 1; i <=k; i++)
        {
            System.out.print(a[i] + " ");
        }
        dem++;
        System.out.println();
    }
}
