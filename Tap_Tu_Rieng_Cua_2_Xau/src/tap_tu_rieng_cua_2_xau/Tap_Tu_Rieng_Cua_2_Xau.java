/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tap_tu_rieng_cua_2_xau;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Tap_Tu_Rieng_Cua_2_Xau {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String x = sc.nextLine();
            String y = sc.nextLine();
            String a[] = x.split(" ");
            Arrays.sort(a);
            String b[] = y.split(" ");
            Arrays.sort(b);
            String c[] = new String[a.length+5];
            int dem = 0;
            for (int i = 0; i < a.length; i++) {
                boolean flat = true;
                for (int j = 0; j < b.length; j++) {
                    if (a[i].compareTo(b[j]) == 0) {
                        flat = false;
                        break;
                    }
                }
                if (flat && a[i].length() > 0) {
                    c[dem++] = a[i];
                }
            }
            for(int i = 0; i < dem-1; i++)
                if(c[i].compareTo(c[i+1]) != 0)
                    System.out.print(c[i] + " ");
            System.out.println(c[dem-1]);
        }
    }

}
