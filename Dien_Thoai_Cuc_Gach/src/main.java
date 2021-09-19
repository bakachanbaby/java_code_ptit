
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

    public static int check(char x){
        if(x == 'a' || x == 'b' || x == 'c')
            return 2;
        if(x == 'd' || x == 'e' || x == 'f')
            return 3;
        
        if(x == 'g' || x == 'h' || x == 'i')
            return 4;   
        if(x == 'j' || x == 'k' || x == 'l')
            return 5;
        if(x == 'm' || x == 'n' || x == 'o')
            return 6;
        if(x == 'p' || x == 'q' || x == 'r' || x == 's')
            return 7;
        if(x == 't' || x == 'u' || x == 'v')
            return 8;
        if(x == 'w' || x == 'x' || x == 'y' || x == 'z')
            return 9;
        else
            return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t -- > 0){
            String s = sc.nextLine();
            s = s.toLowerCase();
            String x = "";
            for(int i = 0; i < s.length(); i++){
                if(check(s.charAt(i)) != -1)
                    x += check(s.charAt(i));
            }
            StringBuffer str = new StringBuffer(x);
            String z = str.reverse().toString();
            if(x.compareToIgnoreCase(z) == 0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
    
}
