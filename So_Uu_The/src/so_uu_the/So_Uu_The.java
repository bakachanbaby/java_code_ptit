/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so_uu_the;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class So_Uu_The {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s = sc.nextLine();
            int demC = 0;
            int demL = 0;
            boolean flat = false;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                    int x = s.charAt(i) - 48;
                    if (x % 2 == 0) {
                        demC++;

                    } else {
                        demL++;
                    }
                } else {
                    flat = true;
                    break;
                }
            }
            if (flat) {
                System.out.println("INVALID");

            } else {
                if ((s.length() % 2 == 0 && demC > demL) || (s.length() % 2 != 0 && demL > demC)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }

}
