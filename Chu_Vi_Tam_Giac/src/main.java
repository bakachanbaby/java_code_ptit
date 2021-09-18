
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

        public double getX3() {
            return x3;
        }

        public void setX3(double x3) {
            this.x3 = x3;
        }

        public double getY3() {
            return y3;
        }

        public void setY3(double y3) {
            this.y3 = y3;
        }

        public double dis(double x1, double y1, double x2, double y2){
            return Math.sqrt((Math.pow((x1-x2), 2)) + Math.pow((y1-y2), 2));
        }
        public void in(){
            double dis1 = dis(x1, y1, x2, y2);
            double dis2 = dis(x1, y1, x3, y3);
            double dis3 = dis(x3, y3, x2, y2);
            
            long abx = (long)(x2-x1);
            long aby = (long)(y2-y1);
            long acx = (long)(x3-x1);
            long acy = (long)(y3-y1);
            System.out.println(abx);
            System.out.println(aby);
            System.out.println(acx);
            System.out.println(acy);
            
            if(abx%acx == 0 || acx%abx == 0 || aby%acy == 0 || acy%aby == 0){
                System.out.print("INVALID");
            }
            else{
                System.out.printf("%.3f", dis1+dis2+dis3);
            }
            
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
