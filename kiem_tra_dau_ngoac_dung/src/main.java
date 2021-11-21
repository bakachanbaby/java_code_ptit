/*
*   BAKACHAN
*/
import java.util.Scanner;
import java.util.Stack;

public class main {

    public static boolean check(char x, char y) {
        if (x == '(' && y == ')')
            return true;
        if (x == '[' && y == ']')
            return true;
        if (x == '{' && y == '}')
            return true;
        return false;
    }

    public static boolean resolve(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (st.empty())
                st.push(c);
            else {
                if (check(st.peek(), c))
                    st.pop();
                else
                    st.push(c);
            }
        }
        return st.empty();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            String s = in.next();
            if (resolve(s))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        in.close();
    }
}
