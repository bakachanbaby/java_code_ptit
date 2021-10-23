
import java.math.BigInteger;
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
        while (t --> 0) {
            String s = sc.nextLine();
            s = s.trim();
            String arr[] = s.split("\\s+");
            String a = arr[0];
            String b = arr[1];
            BigInteger x = new BigInteger(a, 10);
            BigInteger y = new BigInteger(b, 10);
            BigInteger res = x.divide(y);
            BigInteger res2 = y.divide(x);
            System.out.println(x.divide(y) + " " + y.divide(x));
            BigInteger z = new BigInteger("0");
            if(res.compareTo(z)== 0 || res2.compareTo(z) == 0)
                System.out.println("YES");
            else 
                System.out.println("NO");
        }
    }
    
}
