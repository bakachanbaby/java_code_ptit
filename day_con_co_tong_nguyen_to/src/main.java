
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author LENOVO
 */
public class main {

    public static int t, n;
    public static int a[] = new int[100];
    public static int b[] = new int[100];
    public static int x[] = new int[100];
    public static boolean NT[] = new boolean[100005];

    public static void check() {
        for(int i = 0; i < 100005; i++)
            NT[i] = true;
        NT[0] = false;
        NT[1] = false;
        for (int i = 2; i * i <= Math.sqrt(100000); ++i) {
            if (NT[i] == true) {
                // Mark all the multiples of i as composite numbers
                for (int j = i * i; j <= 100000; j += i) {
                    NT[j] = false;
                }
            }
        }
    }

    public static void BackTrack(int i) {
        for (int j = 0; j <= 1; j++) {
            x[i] = j;
            if (i == n) {
                ArrayList<Integer> c = new ArrayList<>();
                int sum = 0;
                for (int l = 1; l <= n; l++) {
                    if (x[l] == 1) {
                        sum += a[l];
                        c.add(a[l]);
                    }
                }
                if (NT[sum]) {
                    for (int l = 0; l < c.size(); l++) {
                        System.out.print(c.get(l) + " ");
                    }
                    System.out.println();
                }
            } else {
                BackTrack(i + 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        check();
        while (t-- > 0) {
            n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                b[i] = sc.nextInt();
            }
            Arrays.sort(b, 0, n + 1);
            for (int i = 1; i <= n; i++) {
                a[i] = b[n - i + 1];
            }
            BackTrack(1);
        }
    }

}
