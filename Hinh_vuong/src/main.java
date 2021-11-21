
/*
* Nguyễn Trần Kiên
*/

import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, mina = Integer.MAX_VALUE, maxa = Integer.MIN_VALUE, minb = Integer.MAX_VALUE, maxb = Integer.MIN_VALUE;
        for (int i = 0; i < 4; i++) {
            a = in.nextInt();
            b = in.nextInt();
            mina = Math.min(a, mina);
            maxa = Math.max(a, maxa);
            minb = Math.min(b, minb);
            maxb = Math.max(b, maxb);
        }
        int res = Math.max((maxa - mina), (maxb - minb));
        System.out.println(res * res);
    }
}
