
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            Queue<Integer> q = new LinkedList<>();
            q.add(9);
            while (true) {
                int tmp = q.poll();
                if (tmp % n == 0) {
                    System.out.println(tmp);
                    break;
                }
                q.add(tmp * 10);
                q.add(tmp * 10 + 9);
            }
        }
        in.close();
    }
}
