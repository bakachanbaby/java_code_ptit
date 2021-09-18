/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hieu_so_nguyen_lon_2;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Hieu_So_Nguyen_Lon_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        while (t --> 0) {
            String a = sc.next();
            String b = sc.next();
            BigInteger x = new BigInteger(a, 10);
            BigInteger y = new BigInteger(b, 10);
            System.out.println(x.subtract(y));
//        }
    }
    
}
