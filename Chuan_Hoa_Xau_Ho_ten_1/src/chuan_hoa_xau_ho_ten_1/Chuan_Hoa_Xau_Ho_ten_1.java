/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuan_hoa_xau_ho_ten_1;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Chuan_Hoa_Xau_Ho_ten_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t > 0) {
            String s = sc.nextLine();
            String[] arr = s.split(" ");
            String newstring = "";
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].length() > 0) {
                    String y = arr[i].toLowerCase();
                    char x = arr[i].toUpperCase().charAt(0);
                    newstring += x + y.substring(1) + " " ;
                }
            }
            System.out.println(newstring);
            t--;
        }

    }

}
