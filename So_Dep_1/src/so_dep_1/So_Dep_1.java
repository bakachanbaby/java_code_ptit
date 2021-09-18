/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so_dep_1;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class So_Dep_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t > 0){
            String s = sc.nextLine();
            boolean flat = true;
            
            for(int i = 0; i < s.length(); i++)
            {
                int x = s.charAt(i);
                char c = s.charAt(i);
                char d = s.charAt(s.length()-i-1);
                if((Character.toString(c).equals(d) == false) && (x%2!=0)){
                    flat = false;
                    break;
                }
            }
            if(flat)
                System.out.println("YES");
            else 
                System.out.println("NO");
            t--;
        }
    }
    
}
