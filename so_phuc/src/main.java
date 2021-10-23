
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author LENOVO
 */
public class main {

    public static class soPhuc {

        private int a, b;

        public soPhuc(int a, int b) {
            this.a = a;
            this.b = b;
        }

        public soPhuc congSP(soPhuc sp2) {
            int thuc = a + sp2.a;
            int ao = b + sp2.b;
            return new soPhuc(thuc, ao);
        }

        public soPhuc nhanSP(soPhuc sp2) {
            int thuc = a * sp2.a - b * sp2.b;
            int ao = a * sp2.b + sp2.a * b;
            return new soPhuc(thuc, ao);
        }

        @Override
        public String toString() {
            if(b > 0)
            return a + " + " + b + "i";
            return a + " - " + -b + "i";
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s[] = sc.nextLine().trim().split("\\s+");
            soPhuc a = new soPhuc(Integer.parseInt(s[0]), Integer.parseInt(s[1]));
            soPhuc b = new soPhuc(Integer.parseInt(s[2]), Integer.parseInt(s[3]));
            soPhuc c1 = a.congSP(b);
            soPhuc c = c1.nhanSP(a);
            soPhuc d = c1.nhanSP(c1);
            System.out.println(c + ", " + d);
        }
    }

}
