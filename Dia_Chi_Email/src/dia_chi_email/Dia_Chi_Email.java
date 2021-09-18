/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia_chi_email;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Dia_Chi_Email {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        String a[] = new String[100];
        int n = 0;
        while (t > 0) {
            String s = sc.nextLine();
            String[] arr = s.split(" ");
            String newstring = "";
            int len = arr.length;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i].length() > 0) {
                    char x = arr[i].toLowerCase().charAt(0);
                    newstring += x;
                }
            }
            newstring = arr[len - 1].toLowerCase() + newstring;
            System.out.print(newstring);
            int dem = 1;
            for (int i = 0; i < n; i++) {
                if (a[i].compareTo(newstring) == 0) {
                    dem++;
                }
            }
            a[n++] = newstring;
            if (dem > 1) {
                System.out.print(dem);
            }
            System.out.println("@ptit.edu.vn");
            t--;
        }

    }

}
