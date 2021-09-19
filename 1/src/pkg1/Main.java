/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class pkg1 {
    private int n;
//    private int a[]=new int[100];
//    private int b[]=new int[100];
    
    Scanner sc=new Scanner(System.in);
    
    public SoNguyen(){}

    public SoNguyen(int n) {
        this.n = n;
    }

    public void nhap(Scanner sc){
        System.out.println("Nhập vào số nguyên:");
        this.n = Integer.parseInt(sc.nextLine());
    }
    public void chia3(){
        
        System.out.println("Số chẵn chia hết cho 3 là:");
        for(int i=0;i<=n;i++){
            if(i%2==0 && i%3==0)
                System.out.print(i+" ");
        }
        System.out.println();
        
    }
    public void hoanVi(){
        int a[]=new int[100];
        int b[]=new int[100];
//        for(int i=1;i<=n;i++){
//            a[i]=i;
//	}
//        for(int i=1;i<=n;i++){
//            b[i]=1;
//	}
        backTrack(1,n,a,b);
        System.out.println();
    }
    public void backTrack(int i,int n,int []a,int []b){
        for(int j=1;j<=n;j++){
            if(b[j]==0){
		a[i]=j;
		b[j]=1;
		if(i==n) {
                   for(int k=1;k<=n;k++){
                       System.out.print(a[i]);
                    }
                    System.out.print(" ");
                }
		else backTrack(i+1,n,a,b);
		b[j]=0;
            }
        }
    }
    
}
