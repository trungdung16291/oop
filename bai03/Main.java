package bai03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Scanner sc = new Scanner(System.in);


        System.out.println("Nhập chiều rộng HCN: ");
        double width = sc.nextDouble();
        rectangle.setWidth(width);

        System.out.println("Nhập chiều dài HCN: ");
        double higth = sc.nextDouble();
        rectangle.setHeight(higth);

        sc.nextLine();
        System.out.println("Nhập màu sắc HCN: ");
        String color = sc.nextLine();
        rectangle.setColor(color);

        System.out.println("Chiều rộng HCN là: "+rectangle.getWidth());
        System.out.println("Chiều dài HCN là: "+rectangle.getHeight());
        System.out.println("Màu sắc HCN là: "+rectangle.getColor());
        System.out.println("Diện tích HCN la: "+rectangle.findArea());
        System.out.println("Chu vi HCN là: "+rectangle.findPerimeter());


    }
}
