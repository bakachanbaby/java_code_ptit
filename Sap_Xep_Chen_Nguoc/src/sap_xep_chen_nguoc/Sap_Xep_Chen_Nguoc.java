/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sap_xep_chen_nguoc;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Sap_Xep_Chen_Nguoc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        t = Integer.parseInt(sc.nextLine());
//        int mx = 1000000000;
//        while (t > 0) {

        int n = sc.nextInt();
        int[] a = new int[n + 5];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        String s[] = new String[n+5];
        int dem = 0;
        int pos, x;
        s[dem++] = "Buoc 0: " + a[0];
        //System.out.println("Buoc 0: " + a[0]);
        for (int i = 1; i < n; i++) {
            x = a[i]; // lưu lại giá trị của x tránh bị ghi đè khi dịch chuyển các phần tử
            pos = i - 1;
            // tìm vị trí thích hợp để chèn x
            while (pos >= 0 && a[pos] > x) {
                // kết hợp với dịch chuyển phần tử sang phải để chừa chỗ cho x
                a[pos + 1] = a[pos];
                pos--;
            }
            // chèn x vào vị trí đã tìm được
            a[pos + 1] = x;
            s[dem] = "Buoc " + i + ": ";
            //System.out.printf("Buoc " + i + ": ");
            for (int j = 0; j <= i; j++) {
                s[dem] += a[j] + " ";
                //System.out.printf(a[j] + " ");
            }
            dem++;
            //System.out.println();
        }
        for (int i = dem - 1; i >= 0; i--) {
                    System.out.println(s[i]);
                }
    }

}
