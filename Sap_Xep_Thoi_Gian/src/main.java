
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<String> list = new ArrayList<String>();
        int k = 0;
        while (t-- > 0) {
            String s = sc.nextLine();
            list.add(s);
        }
        Collections.sort(list);
        for (String element : list) {
            System.out.println(element);
        }
    }

}
