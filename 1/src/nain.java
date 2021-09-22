J05024/Main.java
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05024;

import java.util.*;

/**
 * @author Nguyen Van Khanh
 */

public class Main {
    public static boolean check(char c, String s) {
        if (c == 'C' || c == 'A') {
            if (s.charAt(0) == 'E') return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        ArrayList<SinhVien> a = new ArrayList<>();
        while (t-- > 0) {
            a.add(new SinhVien(in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine()));
        }
        int q = Integer.parseInt(in.nextLine());
        while (q-- > 0) {
            String nganh = in.nextLine().toUpperCase();
            char c = nganh.charAt(0);
            int inDex = 0;
            for (int i = inDex; i < a.size(); i++) {
                if (a.get(i).getMa().charAt(5) == c && check(c, a.get(i).getLop())) {
                    System.out.println("DANH SACH SINH VIEN NGANH " + nganh + ":");
                    for (int j = inDex; j < a.size(); j++) {
                        if (a.get(j).getMa().charAt(5) == c && check(c, a.get(j).getLop()))
                            System.out.println(a.get(j));
                    }
                    break;
                }
            }
        }
    }
}

J05024/SinhVien.java
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05024;

/**
 * @author Nguyen Van Khanh
 */

public class SinhVien {
    private String ma, hoTen, lop, email;

    public SinhVien(String ma, String hoTen, String lop, String email) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.lop = lop;
        this.email = email;
    }

    public String getMa() {
        return this.ma;
    }
    public String getLop(){
        return this.lop;
    }

    @Override
    public String toString() {
        return ma + " " + hoTen + " " + lop + " " + email;
    }
}