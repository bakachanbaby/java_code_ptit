/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.*;

/**
 * @author Nguyen Van Khanh
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int edge_a = 1, edge_b = 1;
        for (int i = 2; i < n; i++) {
            int s = in.nextInt();
            int e = in.nextInt();
            if (s == a ) edge_a++;
            if (s == b ) edge_b++;
        }
        if (edge_a == n - 1 || edge_b == n - 1) System.out.println("Yes");
        else System.out.println("No");
    }
}