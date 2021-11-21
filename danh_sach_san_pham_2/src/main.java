/*
*   BAKACHAN
*/

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class main {
    public static class SanPham implements Comparable<SanPham> {
    private String ma, ten;
    private int gia, baoHanh;

    public SanPham(String ma, String ten, int gia, int baoHanh) {
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
        this.baoHanh = baoHanh;
    }

    public int compareTo(SanPham s) {
        if (this.gia < s.gia) return 1;
        else if (this.gia == s.gia && this.ma.compareTo(s.ma) > 0) return 1;
        return -1;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + gia + " " + baoHanh;
    }
}
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("SANPHAM.in"));
        int t = Integer.parseInt(in.nextLine());
        ArrayList<SanPham> a = new ArrayList<>();
        while (t-- > 0) a.add(new SanPham(in.nextLine(), in.nextLine(), Integer.parseInt(in.nextLine()),
                Integer.parseInt(in.nextLine())));
        Collections.sort(a);
        for (SanPham s : a)
            System.out.println(s);
    }
}




