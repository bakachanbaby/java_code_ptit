/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

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
        int n = Integer.parseInt(sc.nextLine());
        int a[][] = new int[n][n];
        int b[] = new int[n * n];
        int k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
                b[k++] = a[i][j];
            }
        }
        Arrays.sort(b);
        // Chuyển 1D lại thành 2D theo quy luật xoắn ốc
        int B_2[][] = new int[n][n];
        int B_Index = 0;
        int B_Row_Index = 0;
        int B_Col_Index = 0;
        int Row = n;
        int Col = n;

        while (B_Row_Index < Row && B_Col_Index < Col) {

            // 1. Duyệt dòng đầu tiên của ma trận B
            for (int i = B_Col_Index; i < Col; i++) {
                B_2[B_Row_Index][i] = b[B_Index];
                B_Index++;
            }

            B_Row_Index++;

            // 2. Duyệt cột cuối cùng của ma trận B
            for (int i = B_Row_Index; i < Row; i++) {
                B_2[i][Col - 1] = b[B_Index];
                B_Index++;
            }

            Col--;

            // 3. Duyệt dòng cuối cùng của ma trận B
            if (B_Row_Index < Row) {
                for (int i = Col - 1; i >= B_Col_Index; i--) {
                    B_2[Row - 1][i] = b[B_Index];
                    B_Index++;
                }
                Row--;
            }

            // 4. Duyệt dòng còn lại của ma trận B
            if (B_Col_Index < Col) {
                for (int i = Row - 1; i >= B_Row_Index; i--) {
                    B_2[i][B_Col_Index] = b[B_Index];
                    B_Index++;
                }
                B_Col_Index++;
            }

        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(B_2[i][j] + " ");
            }
            System.out.println("");
        }
    }

}
