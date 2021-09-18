/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b1;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class string {
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        String[] arr = s.split(" ");
        for (String string : arr) {
            System.out.println(string);
        }
    }
}
