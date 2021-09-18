/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap_so_co_tong_bang_k;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Cap_So_Co_Tong_Bang_K {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            long dem = 0;
            int[] a = new int[n];

            HashMap<Integer, Integer> mp = new HashMap<>();
            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
                if (mp.containsKey(k - a[j]) == false) {
                    mp.put(k - a[j], 1);
                } else {
                    mp.put(k - a[j], mp.get(k - a[j]) + 1);
                }
            }
            for (int x = 0; x < n; x++) {
                if (mp.containsKey(a[x])) {
                    dem += (long) mp.get(a[x]);
                }
                if (a[i] + a[i] == k && mp.get(a[i]) >= 2) {
                    dem--;
                }
            }
            System.out.println(dem / 2);

        }
    }

}
