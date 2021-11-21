/*
*   BAKACHAN
*/

import java.io.File;
import java.util.Scanner;

public class main {
    public static boolean isInt(String s) {
        if (s.length() > 9) return false;
        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) < '0' || s.charAt(i) > '9') return false;
        return true;
    }

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("DATA.in"));
        long res = 0;
        while (in.hasNext()) {
            String s = in.next();
            if (isInt(s)) {
                int val = Integer.parseInt(s);
                if (val <= 2147483647) res += val;
            }
        }
        in.close();
        System.out.println(res);
    }
}