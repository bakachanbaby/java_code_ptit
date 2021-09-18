/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tong_so_nguyen_lon_1;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Tong_So_Nguyen_Lon_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t --> 0) {
            String a = sc.next();
            String b = sc.next();
            BigInteger x = new BigInteger(a, 10);
            BigInteger y = new BigInteger(b, 10);
            System.out.println(x.add(y));
        }
    }
    
}
