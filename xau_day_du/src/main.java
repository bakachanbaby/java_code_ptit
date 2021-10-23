
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
            String s = sc.nextLine();
            int k = Integer.parseInt(sc.nextLine());
            int n = s.length();
            if(n < 26)
                System.out.println("NO");
            else 
            {
                int a[] = new int[256];
                for(int i = 0; i < 256; i++)
                    a[i] = 0;
                for(int i = 0; i < s.length(); i++)
                    a[s.charAt(i)]++;
                int dem = 0;
                for(int i = 0; i < 256; i++)
                {
                    if(a[i] > 0)
                        dem++;
                }
                if(k >= 26-dem)
                    System.out.println("YES");
                else 
                    System.out.println("NO");
            }
        }
    }
    
}
