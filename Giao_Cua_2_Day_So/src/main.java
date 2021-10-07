
import java.util.ArrayList;
import java.util.Collections;
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
    public static Boolean tuTN(String s) {
        StringBuffer srr = new StringBuffer(s);
        String x = srr.reverse().toString();
        if (x.compareToIgnoreCase(s) == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        int mx = 0;
//        int t = Integer.parseInt(sc.nextLine());
        while (sc.hasNext()) {
            String s = sc.nextLine();
            s = s.trim();
            String[] arr = s.split("\\s+");
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].length() > 0) {
                    if (tuTN(arr[i])) {
                        list.add(arr[i]);
                    }
                }
            }
        }
        for (String string : list) {
            mx = Integer.max(mx, string.length());
        }
        int dem = 0;
        String x;
        for (int i = 0; i < list.size(); i++) {
            dem = 0;
            x = "";
            if (list.get(i) != "0") {
                for (int j = i; j < list.size(); j++) {
                    if (j != i) {
                        if (list.get(j).length() == mx && list.get(j).compareTo(list.get(i)) == 0) {
                            dem++;
                            x = list.get(j);
                            list.set(j, "0");
                        }
                    }
                    else{
                        if (list.get(j).length() == mx) {
                            dem++;
                            x = list.get(j);
                        }
                    }

                }
                if (x.compareTo("") != 0) {
                    System.out.println(x + " " + dem);
                }
            }
        }
    }

}
