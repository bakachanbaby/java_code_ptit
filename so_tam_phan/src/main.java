
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
            boolean flat = false;
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) != '0' && s.charAt(i) != '1' && s.charAt(i) != '2') 
                    flat = true;
            }
            if(flat)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
    
}
