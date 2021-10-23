
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

    /**
     * @param args the command line arguments
     */
    public static int n;
    public static int x[] = new int[105];
    public static int b[] = new int[105];

    public static void print() {
        boolean flat = true;
        for (int j = 1; j < n; j++) {
            if (Math.abs(x[j] - x[j + 1]) == 1) {
                flat = false;
                break;
            }
        }
        if (flat) {
            for (int i = 1; i <= n; i++) {
                System.out.print(x[i]);
            }
            System.out.println();
        }
    }

    public static void BackTrack(int i) {
        for (int j = 1; j <= n; j++) {
            if (b[j] == 1) {
                x[i] = j;
                b[j] = 0;
                if (i == n) {
                    print();
                } else {
                    BackTrack(i + 1);
                }
                b[j] = 1;
            }
        }
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            n = Integer.parseInt(sc.nextLine());
            for (int i = 1; i <= n; i++) {
                b[i] = 1;
            }
            BackTrack(1);
        }
    }

}
