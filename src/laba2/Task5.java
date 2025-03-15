package laba2;

class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double area() {
        return length * width;
    }

    public double perimeter() {
        return 2 * (length + width);
    }

    public String toString() {
        return "Длина: " + length + ", Ширина: " + width +
                ", Площадь: " + area() + ", Периметр: " + perimeter();
    }
}

public class Task5 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.0, 3.0);

        System.out.println(rectangle);

        rectangle.setLength(6.0);
        rectangle.setWidth(4.0);

        System.out.println("После изменения размеров:");
        System.out.println(rectangle);
    }
}