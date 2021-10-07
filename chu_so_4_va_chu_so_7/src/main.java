
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
//        int t = Integer.parseInt(sc.nextLine());
//        while(t --> 0){
            String s = sc.nextLine();
            int dem = 0;
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == '4' || s.charAt(i) == '7') 
                    dem++;
            }
            if(dem != 4 && dem != 7)
                System.out.println("NO");
            else
                System.out.println("YES");
//        }
    }
    
}
