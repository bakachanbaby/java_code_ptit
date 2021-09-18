/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hinh_chu_nhat;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Hinh_chu_nhat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if(n <= 0 || m <= 0)
            System.out.println(0);
        else 
            System.out.println((n+m)*2 + " " + n*m);
        
    }
    
}
