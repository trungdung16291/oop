package bai03;

public class Rectangle {
    double width;
    double height;
    String color;

    public Rectangle() {
    }

    public Rectangle(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double findArea(){
        double area = width*height;
        return area;
    }

    public double findPerimeter(){
        double perimeter = 2*(width+height);
        return perimeter;
    }


}
