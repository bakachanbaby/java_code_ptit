/*
*   BAKACHAN
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.*;

public class main {

    public static void main(String[] args) throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        ArrayList<String> a = (ArrayList<String>) ois.readObject();
        LinkedHashMap<String, Integer> lhm1 = new LinkedHashMap<>();
        for (String s : a) {
            String Words[] = s.trim().toLowerCase().split("\\s+");
            for (String word : Words) {
                lhm1.put(word, 1);
            }
        }
        Scanner in = new Scanner(new File("VANBAN.in"));
        ArrayList<String> ans = new ArrayList<>();
        LinkedHashMap<String, Integer> lhm2 = new LinkedHashMap<>();
        while (in.hasNextLine()) {
            String Words[] = in.nextLine().trim().toLowerCase().split("\\s+");
            for (String s : Words) {
                if (lhm1.containsKey(s) && !lhm2.containsKey(s)) {
                    ans.add(s);
                    lhm2.put(s, 1);
                }
            }
        }
        for (String s : ans) {
            System.out.println(s);
        }
    }
}
