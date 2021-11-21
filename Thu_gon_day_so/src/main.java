/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.*;

/**
 * @author Nguyen Van Khanh
 */

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Stack<Integer> st = new Stack<>();
        int val = in.nextInt();
        st.push(val);
        for (int i = 1; i < n; i++) {
            val = in.nextInt();
            if (!st.empty() && (val + st.peek()) % 2 == 0) st.pop();
            else st.push(val);
        }
        System.out.println(st.size());
    }
}
