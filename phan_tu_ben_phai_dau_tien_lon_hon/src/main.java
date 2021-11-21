
import java.util.Scanner;
import java.util.Stack;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = in.nextInt();
            int res[] = new int[n];
            res[n - 1] = -1;
            Stack<Integer> st = new Stack<>();
            st.push(a[n - 1]);
            for (int i = n - 2; i >= 0; i--) {
                while (!st.empty() && a[i] >= st.peek())
                    st.pop();
                if (st.empty())
                    res[i] = -1;
                else
                    res[i] = st.peek();
                st.push(a[i]);
            }
            for (int i = 0; i < n; i++)
                System.out.print(res[i] + " ");
            System.out.println();
        }
        in.close();
    }
}
