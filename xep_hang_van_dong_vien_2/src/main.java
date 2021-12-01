/*
*   BAKACHAN
*/
import java.util.*;

public class main {

    public static class ThoiGian {

        private int gio, phut, giay;

        public ThoiGian(int gio, int phut, int giay) {
            this.gio = gio;
            this.phut = phut;
            this.giay = giay;
        }

        public ThoiGian truThoiGian(ThoiGian t) {
            int h = t.gio - this.gio;
            int p = t.phut - this.phut;
            int s = t.giay - this.giay;
            if (s < 0) {
                s += 60;
                p--;
            }
            if (p < 0) {
                p += 60;
                h--;
            }
            return new ThoiGian(h, p, s);
        }

        public int compareTo(ThoiGian t) {
            if (this.gio > t.gio) {
                return 1;
            } else if (this.gio == t.gio && this.phut > t.phut) {
                return 1;
            } else if (this.gio == t.gio && this.phut == t.phut && this.giay > t.giay) {
                return 1;
            } else if (this.gio == t.gio && this.phut == t.phut && this.giay == t.giay) {
                return 0;
            }
            return -1;
        }

        @Override
        public String toString() {
            return String.format("%02d", gio) + ":" + String.format("%02d", phut) + ":" + String.format("%02d", giay);
        }
    }

    public static class VanDongVien implements Comparable<VanDongVien> {

        private String ma, hoTen;
        private ThoiGian thanhTichThucTe, uuTien, thanhTichXepHang;

        public VanDongVien(int stt, String hoTen, String ngaySinh, String timeIn, String timeOut) {
            this.ma = "VDV" + String.format("%02d", stt);
            this.hoTen = hoTen;
            this.thanhTichThucTe = timThoiGian(timeIn, timeOut);
            this.uuTien = timUutien(ngaySinh);
            this.thanhTichXepHang = uuTien.truThoiGian(thanhTichThucTe);
        }

        public ThoiGian getThanhTichXepHang() {
            return thanhTichXepHang;
        }

        private ThoiGian timThoiGian(String timeIn, String timeOut) {
            String s1[] = timeIn.split(":");
            String s2[] = timeOut.split(":");
            ThoiGian t1 = new ThoiGian(Integer.parseInt(s1[0]), Integer.parseInt(s1[1]), Integer.parseInt(s1[2]));
            ThoiGian t2 = new ThoiGian(Integer.parseInt(s2[0]), Integer.parseInt(s2[1]), Integer.parseInt(s2[2]));
            return t1.truThoiGian(t2);
        }

        private ThoiGian timUutien(String ngaySinh) {
            String s[] = ngaySinh.split("/");
            int t = 2021 - Integer.parseInt(s[2]);
            if (t < 18) {
                return new ThoiGian(0, 0, 0);
            } else if (t < 25) {
                return new ThoiGian(0, 0, 1);
            } else if (t < 32) {
                return new ThoiGian(0, 0, 2);
            }
            return new ThoiGian(0, 0, 3);
        }

        public int compareTo(VanDongVien v) {
            if (this.thanhTichXepHang.compareTo(v.thanhTichXepHang) >= 0) {
                return 1;
            }
            return -1;
        }

        @Override
        public String toString() {
            return ma + " " + hoTen + " " + thanhTichThucTe + " " + uuTien + " " + thanhTichXepHang + " ";
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        ArrayList<VanDongVien> ds = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            ds.add(new VanDongVien(i, in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine()));
        }
        Collections.sort(ds);
        for (int i = 0; i < ds.size(); i++) {
            int inDex = i;
            while (inDex > 0 && ds.get(inDex).getThanhTichXepHang().compareTo(ds.get(inDex - 1).getThanhTichXepHang()) == 0) {
                inDex--;
            }
            System.out.println(ds.get(i) + " " + (inDex + 1));
        }
    }
}
