

import java.io.*;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class main {
    public static class WordSet {
    private SortedSet<String> ts;

    public WordSet(String s) throws IOException {
        Scanner in = new Scanner(new File(s));
        SortedSet<String> ts = new TreeSet<>();
        while (in.hasNext())
            ts.add(in.next().toLowerCase());
        this.ts = ts;
    }

    @Override
    public String toString() {
        String ans = "";
        for (String s : ts)
            ans += s + "\n";
        return ans;
    }
}

    public static void main(String[] args) throws IOException {
        WordSet ws = new WordSet("VANBAN.in");
        System.out.println(ws);
    }
    public static void main4322604(String[] args) throws IOException {
        WordSet ws = new WordSet("VANBAN.in");
        System.out.println(ws);
    }
}