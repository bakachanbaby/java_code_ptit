
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

    public static class Rectangle {

        private int width;
        private int height;
        private String color;

        public Rectangle(int width, int height, String color) {
            this.width = width;
            this.height = height;
            this.color = color;
        }

        public int getWidth() {
            return width;
        }

        public void setWidth(int width) {
            this.width = width;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public int findArea() {
            return width * height;
        }

        public int findPerimeter() {
            return (width + height) * 2;
        }

        public void in() {
            System.out.println(findPerimeter() + " " + findArea() + " " +  color);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int width = sc.nextInt();
        int height = sc.nextInt();
        String color = sc.next();
        if (width > 0 && height > 0) {
            String s = "";
            String y = color.toLowerCase();
            char x = color.toUpperCase().charAt(0);
            s = x + y.substring(1);
            Rectangle a = new Rectangle(width, height, s);
            a.in();
        } else {
            System.out.println("INVALID");
        }

    }

}
