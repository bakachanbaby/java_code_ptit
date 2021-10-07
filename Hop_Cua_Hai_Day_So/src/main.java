
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

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
        Set<Integer> setA = new HashSet<Integer>();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            setA.add(x);
        }
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            setA.add(x);
        }
        int A[] = new int[setA.size()];
        
        int k = 0, l = 0;
        for (Integer integer : setA) {
            A[k++] = integer;
        }
        
        Arrays.sort(A);
        for(int i = 0; i < k; i++){
            System.out.print(A[i] + " ");
        }
    }

}
