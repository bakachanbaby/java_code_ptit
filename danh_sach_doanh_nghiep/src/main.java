
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class main {
    
    public static class DoanhNghiep implements Comparable<DoanhNghiep> {
    private String ma, ten, soSV;

    public DoanhNghiep(String ma, String ten, String soSV) {
        this.ma = ma;
        this.ten = ten;
        this.soSV = soSV;
    }

    public int compareTo(DoanhNghiep d) {
        if (this.ma.compareTo(d.ma) > 0) return 1;
        return -1;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + soSV;
    }
}
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("DN.in"));
        int t = Integer.parseInt(in.nextLine());
        ArrayList<DoanhNghiep> a = new ArrayList<>();
        while (t-- > 0) {
            a.add(new DoanhNghiep(in.nextLine(), in.nextLine(), in.nextLine()));
        }
        Collections.sort(a);
        for (DoanhNghiep d : a)
            System.out.println(d);
    }
}

