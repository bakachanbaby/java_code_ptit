package BangDiemHocSinh;

import java.util.Scanner;

/**
 *
 * @author NguyenPhiTan
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DanhSachHocSinh dshs = new DanhSachHocSinh(in);
        dshs.input(in);
        dshs.output();
    }
}
