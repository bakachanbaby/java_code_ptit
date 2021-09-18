/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so_dep_2;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class So_Dep_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t > 0) {
            String s = sc.nextLine();
            boolean flat = true;
            int a = s.charAt(0)-48;
            int b = s.charAt(s.length() - 1)-48;
            int sum = 0;
            if(a != 8 || b != 8)
            {
                flat = false;
            }
                
            for (int i = 0; i < s.length(); i++) {
                int x = s.charAt(i);
                int c = s.charAt(i);
                int d = s.charAt(s.length() - i - 1);
                if (c != d) {
                    flat = false;
                    break;
                }
                sum += (x-48);
            }
            if(sum % 10 != 0)
            {
                flat = false;
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
