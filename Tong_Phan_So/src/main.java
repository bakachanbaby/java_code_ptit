
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

    public static class phan_so {

        private long tuSo1;
        private long mauSo1;
        private long tuSo2;
        private long mauSo2;        
        private long tuSoTong;
        private long mauSoTong;   

        public phan_so(long tuSo1, long mauSo1, long tuSo2, long mauSo2) {
            this.tuSo1 = tuSo1;
            this.mauSo1 = mauSo1;
            this.tuSo2 = tuSo2;
            this.mauSo2 = mauSo2;
        }

        public long getTuSo1() {
            return tuSo1;
        }

        public void setTuSo1(long tuSo1) {
            this.tuSo1 = tuSo1;
        }

        public long getMauSo1() {
            return mauSo1;
        }

        public void setMauSo1(long mauSo1) {
            this.mauSo1 = mauSo1;
        }

        public long getTuSo2() {
            return tuSo2;
        }

        public void setTuSo2(long tuSo2) {
            this.tuSo2 = tuSo2;
        }

        public long getMauSo2() {
            return mauSo2;
        }

        public void setMauSo2(long mauSo2) {
            this.mauSo2 = mauSo2;
        }

        public long getTuSoTong() {
            return tuSoTong;
        }

        public void setTuSoTong(long tuSoTong) {
            this.tuSoTong = tuSoTong;
        }

        public long getMauSoTong() {
            return mauSoTong;
        }

        public void setMauSoTong(long mauSoTong) {
            this.mauSoTong = mauSoTong;
        }
        
        
        public long ucln(long tuSo, long mauSo) {
            if (mauSo == 0) {
                return tuSo;
            }
            return ucln(mauSo, (tuSo % mauSo));
        }
        
        public void tong(){
            tuSoTong = tuSo1*mauSo2+tuSo2*mauSo1;
            mauSoTong = mauSo1*mauSo2;
            
            long u = ucln(tuSoTong, mauSoTong);
            tuSoTong /=u;
            mauSoTong /=u;
            System.out.println(tuSoTong + "/" + mauSoTong);
        }
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long tuSo1 = sc.nextLong();
        long mauSo1 = sc.nextLong();
        long tuSo2 = sc.nextLong();
        long mauSo2 = sc.nextLong();
        phan_so p = new phan_so(tuSo1, mauSo1, tuSo2, mauSo2);
        
        p.tong();
    }
    
}
