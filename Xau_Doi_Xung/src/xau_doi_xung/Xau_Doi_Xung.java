/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xau_doi_xung;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Xau_Doi_Xung {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String a = sc.next();
            int dem = 0;
            for(int i = 0; i < a.length(); i++){
                if(a.charAt(i) != a.charAt(a.length()-i-1))
                    dem++;
            }
            if(dem == 2 || (dem == 0 && a.length() % 2 != 0))
                System.out.println("YES");
            else 
                System.out.println("NO");
        }
    }

}
