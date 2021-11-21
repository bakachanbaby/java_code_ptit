/*
*   BAKACHAN
*/

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.SortedSet;
import java.util.TreeSet;

public class main {
    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) throws Exception {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> a1 = (ArrayList<Integer>) in.readObject();
        LinkedHashMap<Integer, Integer> lhm1 = new LinkedHashMap<>();
        in.close();
        in = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> a2 = (ArrayList<Integer>) in.readObject();
        LinkedHashMap<Integer, Integer> lhm2 = new LinkedHashMap<>();
        for (Integer i : a1)
            lhm1.put(i, 1);
        for (Integer i : a2)
            lhm2.put(i, 1);
        in.close();
        SortedSet<Integer> ts = new TreeSet<>(a1);
        for (Integer i : ts) {
            if (i < 500000 && !lhm2.containsKey(i)) {
                int j = 1000000 - i;
                if (j > i && lhm1.containsKey(j) && !lhm2.containsKey(j)) {
                    if (isPrime(i) && isPrime(j)) System.out.println(i + " " + j);
                }
            }
        }
    }
}