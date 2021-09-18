/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tinh_tong;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Tinh_Tong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            long n = sc.nextInt();
            System.out.println((n*(n+1))/2);
            t--;
        }
    }
    
}
