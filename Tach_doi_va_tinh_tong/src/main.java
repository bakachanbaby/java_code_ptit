/*
* BAKACHAN
*/

import java.math.BigInteger;
import java.util.Scanner;
import java.io.*;

public class main {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("DATA.in");
        int i;
        String s = "";
        while ((i = fr.read()) != -1)
            s += (char) i;
        fr.close();
        BigInteger val;
        if (s.length() == 1) System.out.println(s);
        else {
            while (s.length() > 1) {
                BigInteger l, r;
                l = new BigInteger(s.substring(0, s.length() / 2));
                r = new BigInteger(s.substring(s.length() / 2));
                val = l.add(r);
                s = val.toString();
                System.out.println(val);
            }
        }
    }
}