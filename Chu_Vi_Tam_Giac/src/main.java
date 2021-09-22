
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

    public static class Point{
        private double x1;
        private double y1;
        
        private double x2;
        private double y2;
        
        private double x3;
        private double y3;


        public Point(double x1, double y1, double x2, double y2, double x3, double y3) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
            this.x3 = x3;
            this.y3 = y3;
        }

        public double dis(double x1, double y1, double x2, double y2){
            return Math.sqrt((Math.pow((x1-x2), 2)) + Math.pow((y1-y2), 2));
        }
        public void in(){
            double dis1 = dis(x1, y1, x2, y2);
            double dis2 = dis(x1, y1, x3, y3);
            double dis3 = dis(x3, y3, x2, y2);
            
            if(dis1 + dis2 > dis3 && dis1 + dis3 > dis2 && dis2 + dis3 > dis1){
                System.out.printf("%.3f", dis1+dis2+dis3);
            }
            else
               System.out.print("INVALID");
            System.out.println();
        }
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t -->0){
            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();
            double x2 = sc.nextDouble();
            double y2 = sc.nextDouble();
            double x3 = sc.nextDouble();
            double y3 = sc.nextDouble();
            Point a = new Point(x1, y1, x2, y2, x3, y3);
            a.in();
         
        }
    }
    
}
