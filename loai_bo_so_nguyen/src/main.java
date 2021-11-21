/*
*   BAKACHAN
*/
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class main {
    static boolean isNotInt(String s) {
        try {
            Integer.parseInt(s);
            return false;
        } catch (NumberFormatException e) {
            return true;
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("DATA.in"));
        ArrayList<String> a = new ArrayList<>();
        while (in.hasNext()) {
            String s = in.next();
            if (isNotInt(s)) a.add(s);
        }
        Collections.sort(a);
        for (String s : a) System.out.print(s + " ");
    }
}
