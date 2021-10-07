
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
            String x = "";
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == '8')
                    x += '0';
                else if(s.charAt(i) == '9')
                    x += '0';
                else if(s.charAt(i) == '0' || s.charAt(i) == '1')
                    x += s.charAt(i);
                else{
                    flat = true;
                    break;
                }
            }
            if(flat){
                System.out.println("INVALID");
            }
            else{
                long n = Long.parseLong(x);
                if(n == 0)
                    System.out.println("INVALID");
                else
                System.out.println(n);
            }
        }
    }
    
}
