/*
*   BAKACHAN
*/

import java.io.File;
import java.util.*;

public class main {
    public static void main(String[] args) throws Exception {
        File file = new File("DATA.in");
        Scanner sc = new Scanner(file);
        List<Integer> l = new ArrayList<>();
        int used[] = new int[1005];
        while (sc.hasNext()) {
            used[sc.nextInt()]++;
        }
        sc.close();
        for (int i = 0; i < 1000; i++)
            if (used[i] > 0)
                System.out.println(i + " " + used[i]);
    }
}