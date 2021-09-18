/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rut_gon_xau_ky_tu;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author LENOVO
 */
public class Rut_Gon_Xau_Ky_Tu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Deque<Character> sta = new ArrayDeque<>();
        sta.offerLast(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            if (!sta.isEmpty()) {
                if (s.charAt(i) == sta.peekLast()) {
                    sta.pollLast();
                }
                else {
                sta.offerLast(s.charAt(i));
            }
            } 
            else {
                sta.offerLast(s.charAt(i));
            }
        }
        if (sta.isEmpty()) {
            System.out.println("Empty String");
        } else {
            while (sta.size() > 0) {
                System.out.print(sta.peekFirst ());
                sta.pollFirst();
            }
        }
    }

}
