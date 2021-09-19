
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
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

    public static class thoiGian {

        private int gio;
        private int phut;
        private int giay;

        public thoiGian(int gio, int phut, int giay) {
            this.gio = gio;
            this.phut = phut;
            this.giay = giay;
        }

        public int getGio() {
            return gio;
        }

        public void setGio(int gio) {
            this.gio = gio;
        }

        public int getPhut() {
            return phut;
        }

        public void setPhut(int phut) {
            this.phut = phut;
        }

        public int getGiay() {
            return giay;
        }

        public void setGiay(int giay) {
            this.giay = giay;
        }

        @Override
        public String toString() {
            return gio + " " + phut + " " + giay;
        }

        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());

        ArrayList<thoiGian> listTime = new ArrayList<>();

        while (t-- > 0) {
            listTime.add(new thoiGian(sc.nextInt(), sc.nextInt(), sc.nextInt()));
        }
        Collections.sort(listTime, new Comparator<thoiGian>() {
            @Override
            public int compare(thoiGian o1, thoiGian o2) {
                if (o1.getGio() > o2.getGio()) {
                    return 1;
                } else if (o1.getGio() == o2.getGio() && o1.getPhut() > o2.getPhut()) {
                    return 1;
                } else if (o1.getGio() == o2.getGio() && o1.getPhut() == o2.getPhut() && o1.getGiay() > o2.getGiay()) {
                    return 1;
                }
                return -1;
            }
        });
        
        for (thoiGian gian : listTime) {
            System.out.println(gian.toString());
        }
    }

}
