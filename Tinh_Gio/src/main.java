
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

    public static class time {

        private String ma;
        private String hoTen;
        private String gioVao;
        private String gioRa;
        private int tongG;
        private int tongP;

        public time(String ma, String hoTen, String gioVao, String gioRa) {
            this.ma = ma;
            this.hoTen = hoTen;
            this.gioVao = gioVao;
            this.gioRa = gioRa;
        }

        public int getTongG() {
            return tongG;
        }

        public void setTongG(int tongG) {
            this.tongG = tongG;
        }

        public int getTongP() {
            return tongP;
        }

        public void setTongP(int tongP) {
            this.tongP = tongP;
        }

        public void format() {
            String s = gioVao;
            String srr[] = s.split(":");;
            int gV = Integer.parseInt(srr[0]);
            int pV = Integer.parseInt(srr[1]);

            s = gioRa;
            String srr1[] = s.split(":");
            int gR = Integer.parseInt(srr1[0]);
            int pR = Integer.parseInt(srr1[1]);

            this.tongG = gR - gV;
            this.tongP = pR - pV;
            
            if(tongP < 0){
                this.tongG--;
                this.tongP+=60;
            }
        }

        @Override
        public String toString() {
            return ma + " " + hoTen + " " + tongG + " gio " + tongP + " phut";
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<time> listT = new ArrayList<time>();
        while (t-- > 0) {
            String ma = sc.nextLine();
            String hoTen = sc.nextLine();
            String gioVao = sc.nextLine();
            String gioRa = sc.nextLine();
            time a = new time(ma, hoTen, gioVao, gioRa);
            a.format();
            listT.add(a);
        }
        
         Collections.sort(listT, new Comparator<time>() {
            @Override
            public int compare(time o1, time o2) {
                if (o1.getTongG() < o2.getTongG()) {
                    return 1;
                } else if (o1.getTongG()== o2.getTongG()&& o1.getTongP() < o2.getTongP()) {
                    return 1;
                }
                return -1;
            }
        });
        for (time object : listT) {
            System.out.println(object.toString());
        }
    }

}
