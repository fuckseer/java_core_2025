package laba2;

abstract class Shape2 {
    public abstract double area();
    public abstract double perimeter();
}

class Circle2 extends Shape2 {
    private double radius; // Радиус круга

    public Circle2(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Круг: Радиус = " + radius + ", Площадь = " + area() + ", Периметр = " + perimeter();
    }
}

class Square2 extends Shape2 {
    private double side; // Сторона квадрата

    public Square2(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return 4 * side;
    }

    @Override
    public String toString() {
        return "Квадрат: Сторона = " + side + ", Площадь = " + area() + ", Периметр = " + perimeter();
    }
}

class Triangle2 extends Shape2 {
    private double base;
    private double height;
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle2(double base, double height, double sideA, double sideB, double sideC) {
        this.base = base;
        this.height = height;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double area() {
        return (base * height) / 2;
    }

    @Override
    public double perimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public String toString() {
        return "Треугольник: Основание = " + base + ", Высота = " + height +
                ", Площадь = " + area() + ", Периметр = " + perimeter();
    }
}

public class Task9 {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        Shape square = new Square(4.0);
        Shape triangle = new Triangle(3.0, 4.0, 3.0, 4.0, 5.0);

        System.out.println(circle);
        System.out.println(square);
        System.out.println(triangle);
    }
}
