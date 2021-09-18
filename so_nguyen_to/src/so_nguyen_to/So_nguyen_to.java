/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so_nguyen_to;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class So_nguyen_to {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        t = Integer.parseInt(sc.nextLine());
        while(t > 0)
        {
            int n;
            n = Integer.parseInt(sc.nextLine());
            if(NT(n) == 1)
            System.out.println("YES");
        else 
            System.out.println("NO");
            t--;
        }
        
    }
    
    public static int NT(int n){
        if(n < 2)
            return 0;
        for(int i = 2; i <= Math.sqrt(n); i++)
            if(n%i==0)
                return 0;
        return 1;
    }
}
