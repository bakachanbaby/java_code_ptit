
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t --> 0){
            String s = sc.nextLine();
            int dem = 0;
            int sum = 0;
            for(int i = 0; i < s.length()-1; i++){
                int x = s.charAt(i);
                int y = s.charAt(i+1);
                sum += (x-48);
                if(Math.abs(x-y) != 2)
                    dem = 1;
                
            }
            int x = s.charAt(s.length()-1);
            sum += (x-48);
            if(sum % 10 != 0)
                dem = 1;
            if(dem == 1)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
    
}
