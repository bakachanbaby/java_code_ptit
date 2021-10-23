/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class main {

    public static int t, n, k;
    public static int a[] = new int[100];
    public static int b[] = new int[100];
    public static int x[] = new int[100];
    public static ArrayList<ArrayList<Integer>> ve = new ArrayList<ArrayList<Integer>>();
    public static void BackTrack(int i) {
        for (int j = 0; j <= 1; j++) {
            x[i] = j;
            if (i == n) {
                ArrayList<Integer> c = new ArrayList<>();
                int sum = 0;
                for (int l = 1; l <= n; l++) {
                    if (x[l] == 1) {
                        c.add(a[l]);
                    }
                }
                if (c.size() == k) {
                    boolean flat = true;
                    for (int l = 0; l < c.size() - 1; l++) {
                        if (c.get(l) > c.get(l+1)) {
                            flat = false;
                            break;
                        }
                    }
                    if (flat) {
                        ve.add(c);
                    }
                }
            } else {
                BackTrack(i + 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while (t-- > 0) {
            n = sc.nextInt();
            k = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a, 0, n + 1);
            BackTrack(1);
            for(int i = ve.size()-1; i >= 0; i--){
                for(int j = 0; j < ve.get(i).size(); j++){
                    System.out.print(ve.get(i).get(j) + " ");
                }
                System.out.println();
            }
            ve.removeAll(ve);
        }
    }

}
