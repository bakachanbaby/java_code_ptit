

import java.util.Scanner;
import java.util.Stack;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            String s = in.next();
            Stack<Integer> st = new Stack<>();
            st.push(-1);
            int res = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(')
                    st.push(i);
                else {
                    if (st.size() > 1 && s.charAt(st.peek()) == '(') {
                        st.pop();
                        res = Math.max(res, i - st.peek());
                    } else
                        st.push(i);
                }
            }
            System.out.println(res);
        }
        in.close();
    }
}
