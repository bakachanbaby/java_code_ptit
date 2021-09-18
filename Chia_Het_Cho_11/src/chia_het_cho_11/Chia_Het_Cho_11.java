/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chia_het_cho_11;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Chia_Het_Cho_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t --> 0) {
            String a = sc.next();
            long sum = 0;
            for(int i = 0; i < a.length(); i++)
            {
                long x = a.charAt(i);
                sum = (sum * 10 + (x-48)) % 11;
            }
            if(sum%11==0)
                System.out.println(1);
            else 
                System.out.println(0);
        }
    }
    
}
