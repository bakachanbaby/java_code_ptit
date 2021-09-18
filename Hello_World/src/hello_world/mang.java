/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello_world;

/**
 *
 * @author LENOVO
 */
public class mang {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        System.out.println("for");
        for(int i = 0; i < a.length; i++)
        {
            System.out.println(a[i] + " ");
        }
        
        System.out.println("for2");
        for (int i : a) {
            System.out.println(a[i]);
        }
    }
}
