
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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        ThiSinh arr[] = new ThiSinh[t + 3];
        int k = 0;
        while (t-- > 0) {
            ThiSinh ts = new ThiSinh();
            ts.nhap(in);
            ts.check();
            arr[k++] = ts;
        }
        for (int i = 0; i < k - 1; i++) {
            for (int j = i + 1; j < k; j++) {
                if (arr[i].getMa().compareTo(arr[j].getMa()) < 0) {
                    ThiSinh x = arr[i];
                    arr[i] = arr[j];
                    arr[j] = x;
                }
            }
        }

        for (int i = 0; i < k - 1; i++) {
            for (int j = i + 1; j < k; j++) {
                if (arr[i].diemXetTuyen() < arr[j].diemXetTuyen()) {
                    ThiSinh x = arr[i];
                    arr[i] = arr[j];
                    arr[j] = x;
                }
            }
        }
        int p = Integer.parseInt(in.nextLine());
        float max = 0;
        for(int i = 0; i < p; i++)
            max = arr[i].getDiemThat();
        System.out.println(String.format("%.1f", max));
        for (int i = 0; i < k; i++) {
            arr[i].xuat();
            if (arr[i].getDiemThat() >= max) {
            System.out.println("TRUNG TUYEN");
            } else {
            System.out.println("TRUOT");
            }
        }
    }

}
