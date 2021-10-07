
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

        private long tuA, tuB, tuC, tuD, mauA, mauB, mauC, mauD;

        public phan_so(long tuA, long mauA, long tuB, long mauB) {
            this.tuA = tuA;
            this.tuB = tuB;
            this.mauA = mauA;
            this.mauB = mauB;
        }
        
        
        
        public long ucln(long tuSo, long mauSo) {
            if (mauSo == 0) {
                return tuSo;
            }
            return ucln(mauSo, (tuSo % mauSo));
        }
        
        public void tinhC(){
            this.tuC = tuA*mauB+tuB*mauA;
            this.mauC = mauA*mauB;
            this.tuC = (long) Math.pow(tuC, 2);
            this.mauC = (long) Math.pow(mauC, 2);
            long u = ucln(tuC, mauC);
            this.tuC /= u;
            this.mauC /= u;
        }
        
        public void tinhD(){
            this.tuD = tuA*tuB*tuC;
            this.mauD = mauA*mauB*mauC;
            long u = ucln(tuD, mauD);
            this.tuD /=u;
            this.mauD /=u;
        }

        @Override
        public String toString() {
            tinhC();
            tinhD();
            return  tuC + "/" + mauC + " " + tuD + "/" + mauD ;
        }
        
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t --> 0){
            phan_so p = new phan_so(sc.nextLong(), sc.nextLong(), sc.nextLong(), sc.nextLong());
            
            System.out.println(p);
        }
        
        
    }
    
}
