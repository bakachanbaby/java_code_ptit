/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tong_uoc_so_2;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Tong_Uoc_So_2 {

    /**
     * @param args the command line arguments
     */
    public static boolean tong(int n) {
        long sum = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (Math.sqrt(n) == i) {
                sum += i;
                if (sum > 2 * n) {
                    return true;
                }
            }
            if (Math.sqrt(n) != i) {
                if (n % i == 0) {
                    sum += i;
                    if (sum > 2 * n) {
                        return true;
                    }
                }
                if (n % (n / i) == 0) {
                    sum += (n / i);
                    if (sum > 2 * n) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int dem = 0;
        for (int i = a; i <= b; i++) {
            if (tong(i)) {
                dem++;
            }
        }
        System.out.println(dem);

    }

}
