
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author NguyenPhiTan
 */

public class Main {

    public static class thiSinh {

        private String maSV;
        private String hoTen;
        private String maLop;
        private String ngaySinh;
        private float gpa;

        public thiSinh(String maSV, String hoTen, String maLop, String ngaySinh, float gpa) {
            this.maSV = maSV;
            this.hoTen = hoTen;
            this.maLop = maLop;
            this.ngaySinh = ngaySinh;
            this.gpa = gpa;
        }

        public String getHoTen() {
            return hoTen;
        }

        public void setHoTen(String hoTen) {
            this.hoTen = hoTen;
        }

        public String getmaLop() {
            return maLop;
        }

        public void setmaLop(String maLop) {
            this.maLop = maLop;
        }

        public String getNgaySinh() {
            return ngaySinh;
        }

        public void setNgaySinh(String ngaySinh) {
            this.ngaySinh = ngaySinh;
        }

        public float getGpa() {
            return gpa;
        }

        public void setGpa(float gpa) {
            this.gpa = gpa;
        }

        public void format() {
            String s = ngaySinh;
            String srr[] = s.split("/");
            String x = "";
            for (int i = 0; i < srr.length - 1; i++) {
                if (srr[i].length() < 2) {
                    srr[i] = "0" + srr[i];
                }
                x += srr[i] + "/";
            }
            x += srr[srr.length - 1];
            this.ngaySinh = x;

        }

        public void formatHoTen() {
            String s = hoTen;
            s = s.trim();
            String[] arr = s.split("\\s+");
            String newstring = "";
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].length() > 0) {
                    String y = arr[i].toLowerCase();
                    char x = arr[i].toUpperCase().charAt(0);
                    newstring += x + y.substring(1) + " ";
                }
            }
            this.hoTen = newstring;
        }

        public void in() {
            System.out.print(maSV + " " + hoTen + maLop + " " + ngaySinh + " ");
            System.out.printf("%.2f", gpa);
            System.out.println("");
        }
    }

    public static class dssv {

        private ArrayList<thiSinh> listSV;

        public ArrayList<thiSinh> getListSV() {
            return listSV;
        }

        public void setListSV(ArrayList<thiSinh> listSV) {
            this.listSV = listSV;
        }

        public dssv(ArrayList<thiSinh> listSV) {
            this.listSV = listSV;
        }

        public dssv() {
            this.listSV = new ArrayList<thiSinh>();
        }

        public void themSV(thiSinh sv) {
            listSV.add(sv);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        int k = 1;
        ArrayList<thiSinh> listSV = new ArrayList<thiSinh>();
        while (t-- > 0) {
            String hoTen = sc.nextLine();
            String maLop = sc.nextLine();
            String ngaySinh = sc.nextLine();
            Float gpa = Float.parseFloat(sc.nextLine());
            String maSV = "B20DCCN" + String.format("%03d", k);
            thiSinh a = new thiSinh(maSV, hoTen, maLop, ngaySinh, gpa);
            a.format();
            a.formatHoTen();
            listSV.add(a);
            k++;
        }
        Collections.sort(listSV, new Comparator<thiSinh>() {
            @Override
            public int compare(thiSinh o1, thiSinh o2) {
               if (o1.getGpa() < o2.getGpa()) {
                    return 1;
                } else {
                    if (o1.getGpa() == o2.getGpa()) {
                        return 0;
                    } else {
                        return -1;
                    }
                }
            }
        });
        
        for(int i = 0; i < listSV.size(); i++){
            listSV.get(i).in();
        }
    }
}