
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
        while(t-->0){
            double x = Double.parseDouble(sc.nextLine());
            if(Math.sqrt(x) - Math.floor(Math.sqrt(x))==0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
    
}
