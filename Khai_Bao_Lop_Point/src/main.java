
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

        public Point(double x1, double y1, double x2, double y2) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        }

        public double getX1() {
            return x1;
        }

        public void setX1(double x1) {
            this.x1 = x1;
        }

        public double getY1() {
            return y1;
        }

        public void setY1(double y1) {
            this.y1 = y1;
        }

        public double getX2() {
            return x2;
        }

        public void setX2(double x2) {
            this.x2 = x2;
        }

        public double getY2() {
            return y2;
        }

        public void setY2(double y2) {
            this.y2 = y2;
        }

        public void in(){
            double dis = Math.sqrt((Math.pow((x1-x2), 2)) + Math.pow((y1-y2), 2));
            System.out.printf("%.4f", dis);
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
            
            Point a = new Point(x1, y1, x2, y2);
            a.in();
         
        }
    }
    
}
