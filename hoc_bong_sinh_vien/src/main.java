
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

    public static class HocBong implements Comparable<HocBong>{

        private String hoTen, xepLoai;
        private double TBC, RL;

        public HocBong(String hoTen, double TBC, double RL) {
            this.hoTen = hoTen;
            this.TBC = TBC;
            this.RL = RL;
        }

        public void tinhXepHang(){
            if(TBC >= 3.6 && RL >= 90)
                this.xepLoai = "XUATSAC";
            else if(TBC >= 3.2 && RL >= 80)
                this.xepLoai = "GIOI";
            else if(TBC >= 2.5 && RL >= 70)
                this.xepLoai = "KHA";
            else 
                this.xepLoai = "KHONG";
        }

        @Override
        public int compareTo(HocBong n) {
            if (this.TBC < n.TBC) {
                return 1;
            }
            return -1;
        }

        @Override
        public String toString() {
            return  hoTen + ": " + xepLoai;
        }
        
        

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String p = sc.nextLine();
        String arr1[] = p.split("\\s+");
        long t = Long.parseLong(arr1[0]);        
        long n = Long.parseLong(arr1[1]);
        ArrayList<HocBong> listXD = new ArrayList<>();        
        ArrayList<HocBong> listXD2 = new ArrayList<>();

        for (long i = 1; i <= t; i++) {
            String x = sc.nextLine();
            String s = sc.nextLine();
            String arr2[] = s.split("\\s+");
            HocBong a = new HocBong(x, Double.parseDouble(arr2[0]), Double.parseDouble(arr2[1]));
            a.tinhXepHang();
            listXD.add(a);
            listXD2.add(a);
        }
        
        Collections.sort(listXD);
        boolean flat = false;
        n--;
        if(n <= 0)
            {
                if(listXD.get(0).TBC == listXD.get(1).TBC && flat == false)
                    flat = false;
                else{
                    flat = true;
                    listXD.get(0).xepLoai = "KHONG";
                }
                    
            }
        for(int i = 1; i < listXD.size(); i++){
            n--;
            if(n <= 0)
            {
                if(listXD.get(i).TBC == listXD.get(i-1).TBC && flat == false)
                    continue;
                else{
                    flat = true;
                    listXD.get(i).xepLoai = "KHONG";
                }
                    
            }
        }
        if(n == 0 && flat == true)
            listXD.get(listXD.size()-1).xepLoai = "KHONG";
//        for (HocBong hocBong : listXD) {
//            System.out.println(hocBong);
//        }
        for (HocBong hocBong : listXD2) {
            System.out.println(hocBong);
        }
    }

}
