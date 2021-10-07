
import java.util.ArrayList;
import java.util.Collections;
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

    public static class XepHang implements Comparable<XepHang>{
        private String hoTen;
        private int ac, sub;

        public XepHang(String hoTen, int ac, int sub) {
            this.hoTen = hoTen;
            this.ac = ac;
            this.sub = sub;
        }
        
        public int compareTo(XepHang n) {
            if (this.ac < n.ac) {
                return 1;
            }
            else if(this.ac == n.ac && this.sub > n.sub){
                return 1;
            }
            else if(this.ac == n.ac && this.sub == n.sub && this.hoTen.compareTo(n.hoTen) > 0){
                return 1;
            }
            return -1;
        }

        @Override
        public String toString() {
            return  hoTen + " " + ac + " " + sub ;
        }
        
        
    }
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        ArrayList<XepHang> listNV = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            String hoTen = in.nextLine();
            String a = in.nextLine();  
            String arr[] = a.split("\\s+");
            int ac = Integer.parseInt(arr[0]);
            int sub = Integer.parseInt(arr[1]);
            listNV.add(new XepHang(hoTen, ac, sub));
        }
        Collections.sort(listNV);
        for (XepHang nhanVien : listNV) {
            System.out.println(nhanVien);
        }
    }
    
}
