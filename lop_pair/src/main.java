/*
*   BAKACHAN
 */

import java.util.*;

public class main {

    public static class Pair {

        private int first, second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }

        public static boolean prime(int n) {
            if (n < 2) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }

        public boolean isPrime() {
            if (prime(this.first) && prime(this.second)) {
                return true;
            }
            return false;
        }

        @Override
        public String toString() {
            return first + " " + second;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            boolean check = false;
            for (int i = 2; i <= 2 * Math.sqrt(n); i++) {
                Pair p = new Pair(i, n - i);
                if (p.isPrime()) {
                    System.out.println(p);
                    check = true;
                    break;
                }
            }
            if (!check) {
                System.out.println(-1);
            }
        }
    }

}
