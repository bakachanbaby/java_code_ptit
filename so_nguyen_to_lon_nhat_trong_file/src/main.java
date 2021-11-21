/*
*   BAKACHAN
*/
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.*;

public class main {
    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++)
            if (n % i == 0) return false;
        return true;
    }

    public static void main(String[] args) throws Exception {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> a = (ArrayList<Integer>) in.readObject();
        SortedSet<Integer> ts = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 < o2) return 1;
                return -1;
            }
        });
        LinkedHashMap<Integer, Integer> lhm = new LinkedHashMap();
        for (Integer i : a) {
            if (!lhm.containsKey(i)) {
                lhm.put(i, 1);
                if (isPrime(i)) ts.add(i);
            } else lhm.put(i, lhm.get(i) + 1);
        }
        int cnt = 0;
        for (Integer i : ts) {
            System.out.println(i + " " + lhm.get(i));
            cnt++;
            if (cnt == 10) break;
        }
    }
}
