
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

    
    public static String daoTu(String s){
        StringBuilder str = new StringBuilder(s);
        return str.reverse().toString();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s = sc.nextLine();
            s.trim();
            String arr[] = s.split("\\s+");
            for(int i = 0; i < arr.length; i++)
                arr[i] = daoTu(arr[i]);
            for (String string : arr) {
                System.out.print(string + " ");
            }
            System.out.println();
        }
    }
    
}
