/*
*   bakachan
*/

import java.util.*;


public class main {
    static class Passenger {
        int t, d;

        public Passenger(int t, int d) {
            this.t = t;
            this.d = d;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Passenger> a = new ArrayList<>();
        for (int i = 0; i < n; i++) a.add(new Passenger(in.nextInt(), in.nextInt()));
        Collections.sort(a, new Comparator<Passenger>() {
            @Override
            public int compare(Passenger o1, Passenger o2) {
                if (o1.t > o2.t) return 1;
                else if (o1.t == o2.t && o1.d > o2.d) return 1;
                return -1;
            }
        });
        int res = 0;
        for (int i = 0; i < n; i++)
            res = Math.max(res, a.get(i).t) + a.get(i).d;
        System.out.print(" ");
    }
}
