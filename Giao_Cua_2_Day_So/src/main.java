
import java.util.Arrays;
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
    public static void printUnionSort(int[] A, int[] B, int n, int m) {
        Arrays.sort(A);
        Arrays.sort(B);
        int index_a = 0, index_b = 0;
        while (index_a < n && index_b < m) {
            if (A[index_a] == B[index_b]) {
                System.out.print(A[index_a] + " ");
                index_a++;
                index_b++;
            } else if (A[index_a] > A[index_b]) {
                index_b++;
            } else {
                index_a++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int A[] = new int[n];
        int B[] = new int[m];
        
        for(int i = 0; i < n; i++)
            A[i] = sc.nextInt();
        for(int i = 0; i < m; i++)
            B[i] = sc.nextInt();
        Arrays.sort(A);
        Arrays.sort(B);
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(A[i] == B[j]){
                    System.out.print(A[i] + " ");
                    break;
                }
                    
            }
        }
//        printUnionSort(A, B, n, m);
    }

}
