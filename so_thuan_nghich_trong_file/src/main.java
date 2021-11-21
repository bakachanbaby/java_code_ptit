/*
*   BAKACHAN
*/
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.*;

public class main {
    static boolean isReversible(String s) {
        if (s.length() < 2) return false;
        if (s.length() % 2 == 0) return false;
        int l = 0, r = s.length() - 1;
        while (l <= r) {
            if (s.charAt(l) % 2 == 0 || s.charAt(r) % 2 == 0) return false;
            if (s.charAt(l++) != s.charAt(r--)) return false;
        }
        return true;
    }

    public static void main(String[] args) throws Exception {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> a = (ArrayList<Integer>) in.readObject();
        LinkedHashMap<Integer, Integer> lhm = new LinkedHashMap<>();
        for (Integer i : a)
            if (isReversible(String.valueOf(i))) {
                if (!lhm.containsKey(i)) lhm.put(i, 1);
                else lhm.put(i, lhm.get(i) + 1);
            }
        in = new ObjectInputStream(new FileInputStream("DATA2.in"));
        a = (ArrayList<Integer>) in.readObject();
        SortedSet<Integer> ts = new TreeSet<>();
        for (Integer i : a)
            if (lhm.containsKey(i)) {
                ts.add(i);
                lhm.put(i, lhm.get(i) + 1);
            }
        int cnt = 0;
        for (Integer i : ts) {
            System.out.println(i + " " + lhm.get(i));
            cnt++;
            if (cnt == 10) break;
        }

    }
}