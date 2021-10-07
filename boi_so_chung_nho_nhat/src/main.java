
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
        while(t --> 0){
            String a = sc.nextLine();
            String b = sc.nextLine();
            BigInteger x = new BigInteger(a, 10);
            BigInteger y = new BigInteger(b, 10);
            BigInteger z = x.gcd(y);
            BigInteger k = (x.multiply(y)).divide(z);
            System.out.println(k);
            
        }
    }
    
}
