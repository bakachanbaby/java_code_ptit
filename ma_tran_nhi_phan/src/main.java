
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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int t = Integer.parseInt(sc.nextLine());
//        while (t-- > 0) {
            int n = sc.nextInt();
            int a[][] = new int[n][3];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 3; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
            int dem = 0;
            int sum = 0;
            for (int i = 0; i < n; i++) {
                dem = 0;
                for(int j = 0; j < 3; j++){
                    if(a[i][j] == 1)
                        dem++;
                }
                if(dem > 1)
                    sum++;
            }
            System.out.println(sum);
        }
//    }

}
