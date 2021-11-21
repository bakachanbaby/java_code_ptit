/*
* BAKACHAN
*/

import java.math.BigInteger;
import java.util.*;

public class J03039 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            BigInteger a = new BigInteger(in.next());
            BigInteger b = new BigInteger(in.next());
            BigInteger zero = BigInteger.valueOf(0);
            if (a.remainder(b).equals(zero) || b.remainder(a).equals(zero)) System.out.println("YES");
            else System.out.println("NO");
        }
    }

}
