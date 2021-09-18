/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tim_so_du;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Tim_So_Du {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t --> 0){
            String s = sc.nextLine();
            long sum = 0;
            for(int i = 0; i < s.length(); i++)
            {
                int x = s.charAt(i)-48;
                sum = (sum*10 + x)%4;
            }
            if(sum % 4 == 0)
                System.out.println(4);
            else 
                System.out.println(0);
            
        }
    }
    
}
