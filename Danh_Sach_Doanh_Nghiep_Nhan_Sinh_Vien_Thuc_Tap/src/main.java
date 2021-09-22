
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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

    public static class doanhNghiep{
        private String maDN;
        private String tenDN;
        private int soSV;

        public doanhNghiep(String maDN, String tenDN, int soSV) {
            this.maDN = maDN;
            this.tenDN = tenDN;
            this.soSV = soSV;
        }

        public String getMaDN() {
            return maDN;
        }

        public void setMaDN(String maDN) {
            this.maDN = maDN;
        }

        public String getTenDN() {
            return tenDN;
        }

        public void setTenDN(String tenDN) {
            this.tenDN = tenDN;
        }

        public int getSoSV() {
            return soSV;
        }

        public void setSoSV(int soSV) {
            this.soSV = soSV;
        }

        @Override
        public String toString() {
            return  maDN + " " + tenDN + " " + soSV;
        }
        
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<doanhNghiep> list = new ArrayList<doanhNghiep>();
        while(t --> 0){
            String maDN = sc.nextLine();
            String tenDN = sc.nextLine();
            int soSV = Integer.parseInt(sc.nextLine());
            doanhNghiep a = new doanhNghiep(maDN, tenDN, soSV);
            list.add(a);
        }
        
        Collections.sort(list, new Comparator<doanhNghiep>() {
            @Override
            public int compare(doanhNghiep o1, doanhNghiep o2) {
                
                if (o1.getSoSV() < o2.getSoSV()) {
                    return 1;

                } else if (o1.getSoSV() == o2.getSoSV() && o1.getMaDN().compareTo(o2.getMaDN()) > 0) {
                    return 1;
                } else {
                    return -1;
                }

            }
        });
        
        for (doanhNghiep nghiep : list) {
            System.out.println(nghiep.toString());
        }
    }
    
}
