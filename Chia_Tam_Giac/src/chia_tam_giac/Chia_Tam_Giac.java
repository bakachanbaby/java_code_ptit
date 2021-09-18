/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chia_tam_giac;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Chia_Tam_Giac {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            double n = sc.nextDouble();
            double h = sc.nextDouble();
            for(double i = 1; i < n; i++)
            {
                double ct = h*Math.sqrt((double) i / n );
                System.out.printf("%.6f ", ct);
            }
            System.out.println();
        }
    }
    
}
