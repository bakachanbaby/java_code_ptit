/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuan_hoa_xau_ho_ten_2;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Chuan_Hoa_Xau_Ho_Ten_2 {

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
            int n = arr.length;
            int flat = 0;
            int index = 0;
            for (int i = 0; i < n - 1; i++) {
                if(arr[i].length() > 0 && flat != 1)
                {
                    index = i;
                    flat = 1;
                    continue;
                }
                if (arr[i].length() > 0) {
                    String y = arr[i].toLowerCase();
                    char x = arr[i].toUpperCase().charAt(0);
                    newstring += x + y.substring(1) + " ";
                }
                
            }
            String y = arr[n - 1].toLowerCase();
            char x = arr[n - 1].toUpperCase().charAt(0);
            newstring += x + y.substring(1) + ", " + arr[index].toUpperCase();
            System.out.println(newstring);
            t--;
        }

    }

}
