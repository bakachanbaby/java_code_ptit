/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phuong_trinh_bac_nhat;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Phuong_Trinh_Bac_Nhat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        float c = (float) -b / a;
        if (a == 0 && b != 0) {
            System.out.println("VN");
        } else if (a == 0 && b == 0) {
            System.out.println("VSN");
        } else {
            System.out.printf("%.2f", c);
        }
    }

}
