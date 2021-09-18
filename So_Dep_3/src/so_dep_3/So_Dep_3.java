/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so_dep_3;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class So_Dep_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t > 0) {
            String s = sc.nextLine();
            boolean flat = true;
            for (int i = 0; i < s.length(); i++) {
                int c = s.charAt(i);
                int d = s.charAt(s.length() - i - 1);
                int x = c-48;
                //System.out.println(x);
                if (c != d || (x != 2 && x != 3 && x != 5 && x != 7)) {
                    flat = false;
                    break;
                }
            }
            if (flat) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            t--;
        }
    }

}
