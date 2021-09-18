/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b1;

import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class mang {
    public static void main(String[] args) {
//        int[] a = {1,2,3};
//        System.out.println("for");
//        for(int i = 0; i < a.length; i++)
//        {
//            System.out.println(a[i] + " ");
//        }
//        
//        System.out.println("for2");
//        for (int i : a) {
//            System.out.println(a[i]);
//        }
//        
        ArrayList sinhVien = new ArrayList();
        sinhVien.add("Baka");
        sinhVien.add("Chan");
        sinhVien.add("BABY");
        System.out.println("Danh sách sinh viên: ");
//        Iterator itr = sinhVien.iterator();
//        while(itr.hasNext){
//            Object
//        }
        int[][] myNumbers ={{1,2,3,4},{4,3,2,1}};
        for(int i = 0; i < myNumbers.length; i++){
            for(int j = 0; j < myNumbers[i].length; j++)
                System.out.println(myNumbers[i][j]);
        }
                
                
    }
}
