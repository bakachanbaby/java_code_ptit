
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class main {

    public static class MatHang implements Comparable<MatHang> {

        private String ma, ten, donVi;
        private int giaMua, giaBan, loiNhuan;

        public MatHang(int stt, String ten, String donVi, int giaMua, int giaBan) {
            this.ma = "MH" + String.format("%03d", stt);
            this.ten = ten;
            this.donVi = donVi;
            this.giaMua = giaMua;
            this.giaBan = giaBan;
            this.loiNhuan = giaBan - giaMua;
        }

        public int compareTo(MatHang m) {
            if (this.loiNhuan <= m.loiNhuan) {
                return 1;
            }
            return -1;
        }

        @Override
        public String toString() {
            return ma + " "
                    + ten + " "
                    + donVi + " "
                    + giaMua + " " + giaBan + " " + loiNhuan;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        List<MatHang> l = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            l.add(new MatHang(i, in.nextLine(), in.nextLine(), Integer.parseInt(in.nextLine()),
                    Integer.parseInt(in.nextLine())));
        }
        Collections.sort(l);
        for (MatHang m : l) {
            System.out.println(m);
        }
    }
}
