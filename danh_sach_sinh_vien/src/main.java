/*
*   BAKACHAN
*/

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class main {
    public static class SinhVien implements Comparable<SinhVien> {
    private String ma, ten, lop, email;

    public SinhVien(String ma, String ten, String lop, String email) {
        this.ma = ma;
        this.ten = chuanHoa(ten.trim());
        this.lop = lop;
        this.email = email;
    }

    private String chuanHoa(String ten) {
        String str[] = ten.split("\\s+");
        String ans = "";
        for (String s : str)
            ans += s.toUpperCase().charAt(0) + s.toLowerCase().substring(1) + " ";
        return ans;
    }

    public int compareTo(SinhVien s) {
        if (this.ma.compareTo(s.ma) > 0) return 1;
        return -1;
    }

    @Override
    public String toString() {
        return ma + " " + ten + lop + " " + email;
    }
}

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("SINHVIEN.in"));
        int t = Integer.parseInt(in.nextLine());
        ArrayList<SinhVien> a = new ArrayList<>();
        while (t-- > 0)
            a.add(new SinhVien(in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine()));
        Collections.sort(a);
        for (SinhVien s : a)
            System.out.println(s);
    }
}


