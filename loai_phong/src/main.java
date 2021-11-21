/*
*   BAKACHAN
*/

import java.util.Scanner;
import java.util.Collections;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class main {
    public static class LoaiPhong implements Comparable<LoaiPhong> {
    private String ma, ten, gia, phi;

    public LoaiPhong(String s) {
        String str[] = s.split(" ");
        this.ma = str[0];
        this.ten = str[1];
        this.gia = str[2];
        this.phi = str[3];
    }

    public int compareTo(LoaiPhong l) {
        if (this.ten.compareTo(l.ten) >= 0) return 1;
        return -1;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + gia + " " + phi;
    }
}
    public static void main(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while(n-->0){
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for(LoaiPhong tmp : ds){
            System.out.println(tmp);
        }
    }
    public static void main4881822(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while(n-->0){
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for(LoaiPhong tmp : ds){
            System.out.println(tmp);
        }
    }
}


