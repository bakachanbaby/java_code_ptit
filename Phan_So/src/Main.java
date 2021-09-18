
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
public class Main {

    public static class phan_so {

        private long tuSo;
        private long mauSo;

        public long getTuSo() {
            return tuSo;
        }

        public void setTuSo(long tuSo) {
            this.tuSo = tuSo;
        }

        public long getMauSo() {
            return mauSo;
        }

        public void setMauSo(long mauSo) {
            this.mauSo = mauSo;
        }

        public phan_so(long tuSo, long mauSo) {
            this.tuSo = tuSo;
            this.mauSo = mauSo;
        }

        public phan_so() {

        }
        public long ucln(long tuSo, long mauSo) {
            if (mauSo == 0) {
                return tuSo;
            }
            return ucln(mauSo, (tuSo % mauSo));
        }

        public void rutgon() {
            long u = ucln(tuSo, mauSo);
            this.tuSo /= u;
            this.mauSo /= u;
            System.out.println(tuSo + "/" + mauSo);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long tuSo = sc.nextLong();
        long mauSo = sc.nextLong();

        phan_so p = new phan_so(tuSo, mauSo);
        p.rutgon();
    }

}
