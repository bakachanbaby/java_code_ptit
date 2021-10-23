
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
        String newS = "";
        while(sc.hasNextLine()){
            String s = sc.nextLine();
            s = s.trim();
            String arr[] = s.split("\\s+");
            String y = arr[0].toLowerCase();
            char x = arr[0].toUpperCase().charAt(0);
            newS += x + y.substring(1) + " ";
            for(int i = 1; i < arr.length; i++)
                if(arr[i].length() > 0)
                {
                    y = arr[i].toLowerCase();
                    newS +=y + " ";
                }
            newS += ".\n";
        }
        System.out.println(newS);
    }
    
}
