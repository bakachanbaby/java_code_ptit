
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
    
    public static boolean Check1(String s) {
        for (int i = 0; i < s.length()-1; i++) {
            if(s.charAt(i) >= s.charAt(i+1))
                return false;
        }
        return true;
    }
    public static boolean Check2(String s) {
        for (int i = 0; i < s.length()-1; i++) {
            if(s.charAt(i) != s.charAt(i+1))
                return false;
        }
        return true;
    }
    public static boolean Check3(String s) {
        if(s.charAt(0) != s.charAt(1) || s.charAt(1) != s.charAt(2))
            return false;
        if(s.charAt(3) != s.charAt(4))
            return false;
        return true;
    }
    public static boolean Check4(String s) {
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != '6' && s.charAt(i) != '8')
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s = sc.nextLine();
            String x = "";
            for (int i = 5; i < s.length(); i++) {
                if(s.charAt(i) >= '0' && s.charAt(i) <= '9')
                    x += s.charAt(i);
            }
            if(Check1(x) || Check2(x) || Check3(x) || Check4(x))
                System.out.println("YES");
            else 
                System.out.println("NO");
        }
    }

}
