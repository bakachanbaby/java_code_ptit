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
public class SoN {

    private int n;
    private Scanner sc = new Scanner(System.in);

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void nhapN() {
        System.out.print("Nhap n = ");
        n = Integer.parseInt(sc.nextLine());
    }

    public void tongN() {
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Tong tu 1 toi " + n + " = " + sum);
    }

    public void tinhGiaiThua() {
        double tich = 1;
        for (int i = 1; i <= n; i++) {
            tich *= i;
        }
        System.out.println(n + "!= " + tich);
    }

    public void kiemTraSoThuanNghich() {
        double result = 0;
        int m = n;
        while (m > 0) {
            result = result * 10 + (m % 10);
            m /= 10;
        }
        if (result == n) {
            System.out.println(n + " la so thuan ngich");
        } else {
            System.out.println(n + " khong la so thuan nghich");
        }
    }
}
