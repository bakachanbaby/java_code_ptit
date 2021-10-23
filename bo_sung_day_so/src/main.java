
import java.util.ArrayList;
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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        int n = t;
        ArrayList<Integer> a = new ArrayList<>();
        while (t > 0) {
            String s = sc.nextLine();
            s = s.trim();
            String arr[] = s.split("\\s+");
            for (String i : arr) {
                a.add(Integer.parseInt(i));
                t--;
            }
        }
        if (a.get(n - 1) == n) {
            System.out.println("Excellent!");
        } else {
            boolean flat = true;
            int dem = 0;
            for (int i = 1; i <= 200; i++) {
                
                flat = true;
                for (Integer integer : a) {
                    if (i == integer) {
                        dem++;
                        flat = false;
                        break;
                    }
                }
                if(dem == a.size())
                    break;
                if (flat) {
                    System.out.println(i);
                }
            }
        }

    }

}
