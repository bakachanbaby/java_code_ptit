/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tong_giai_thua;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Tong_Giai_Thua {

    public static long tinhGiaithua(int n) {
        if (n > 0) {
            return n * tinhGiaithua(n - 1);
        } else {
            return 1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 0;
        for(int i = 1; i <= n; i++){
            sum += tinhGiaithua(i);
        }
        System.out.println(sum);
    }
    
}
