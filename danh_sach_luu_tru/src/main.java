/*
*   BAKACHAN
*/

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class main {
    
    public static class KhachHang implements Comparable<KhachHang> {
    private String ma, ten, maPhong;
    private long SoNgay;

    public KhachHang(int stt, String ten, String maPhong, String ngayDen, String ngayDi) throws ParseException {
        this.ma = "KH" + String.format("%02d", stt);
        this.ten = ten;
        this.maPhong = maPhong;
        Date den = new SimpleDateFormat("dd/MM/yyyy").parse(ngayDen);
        Date di = new SimpleDateFormat("dd/MM/yyyy").parse(ngayDi);
        this.SoNgay = ((di.getTime() - den.getTime()) / (1000 * 60 * 60 * 24)) % 365;
    }

    public int compareTo(KhachHang k) {
        if (this.SoNgay <= k.SoNgay) return 1;
        return -1;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + maPhong + " " + SoNgay;
    }
}
    
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("KHACH.in"));
        int t = Integer.parseInt(in.nextLine());
        ArrayList<KhachHang> a = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            a.add(new KhachHang(i, in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine()));
        }
        Collections.sort(a);
        for (KhachHang k : a)
            System.out.println(k);
    }
}

