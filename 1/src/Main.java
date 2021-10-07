
import java.util.Scanner;

/**
 *
 * @author NguyenPhiTan
 */

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        ThiSinh arr[] = new ThiSinh[t+3];
        int k = 0;
        while( t --> 0 ) {
            ThiSinh ts = new ThiSinh();
            ts.nhap(in);
            arr[k++] = ts;
        }
        
        for(int i=0 ; i<k-1 ; i++) {
            for(int j=i+1 ; j<k ; j++) {
                if( arr[i].getMa().compareTo(arr[j].getMa()) < 0 ) {
                    ThiSinh x = arr[i];
                    arr[i] = arr[j];
                    arr[j] = x;
                }
            }
        }
        
        for(int i=0 ; i<k-1 ; i++) {
            for(int j=i+1 ; j<k ; j++) {
                if( arr[i].diemXetTuyen() < arr[j].diemXetTuyen() ) {
                    ThiSinh x = arr[i];
                    arr[i] = arr[j];
                    arr[j] = x;
                }
            }
        }
        
        for(int i=0 ; i<k ; i++) {
            arr[i].xuat();
        }
    }
}