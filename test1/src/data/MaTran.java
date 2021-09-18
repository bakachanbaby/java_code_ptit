/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class MaTran {

    private int a[][];
    private Scanner sc = new Scanner(System.in);

    public int[][] getA() {
        return a;
    }

    public void setA(int a[][]) {
        this.a = a;
    }

    public void nhapN() {
        int n;
        System.out.println("Nhap kich thuoc cho ma tran n*n");
        n = Integer.parseInt(sc.nextLine());
        a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("a[" + i + "][" + j + "] = ");
                a[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        System.out.println("Ma tran ban vua nhap la ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void duongCheoChinh() {
        System.out.println("Cac phan tu duong cheo chinh la ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (i == j) {
                    System.out.println("a[" + i + "][" + j + "] = " + a[i][j]);
                }
            }
        }
    }

    private boolean check(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void soNguyenTo() {
        System.out.println("Cac phan tu la so nguyen to trong ma tran la");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (check(a[i][j]) == true) {
                    System.out.println("a[" + i + "][" + j + "] = " + a[i][j]);
                }
            }
        }
    }

    public void dinhThucMaTranVuong() {

    }
}
