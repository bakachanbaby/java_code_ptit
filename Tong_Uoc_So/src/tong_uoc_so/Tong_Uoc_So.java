/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tong_uoc_so;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Tong_Uoc_So {

    public static void main(String[] args) {
        int N = 2000000;
        long[] check = new long[N + 1];
        // Khởi tạo tất cả các số [2...N] đều là số nguyên tố
        for (int i = 2; i <= N; i++) {
            check[i] = 0;
        }

        // Thuật toán sàng nguyên tố
        // Nếu một số là số nguyên tố, thì tất cả các bội của nó không phải số nguyên tố
        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (check[i] == 0) {
                for (int j = i * i; j <= N; j += i) {
                    if (check[j] == 0) {
                        check[j] = i;
                    }
                }
            }
        }
        for (int i = 2; i <= N; i++) {
            if (check[i] == 0) {
                check[i] = i;
            }
        }
        Scanner sc = new Scanner(System.in);
        long t = sc.nextInt();
        long sum = 0;
        while (t > 0) {
            int n = sc.nextInt();
            while (n != 1) {
                sum += check[n];
                n /= check[n];
            }
            t--;
        }
        System.out.println(sum);
    }

}
