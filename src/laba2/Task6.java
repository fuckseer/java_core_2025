package laba2;

interface Shape {
    double area();
    double perimeter();
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
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

class Square implements Shape {
    private double side;

    public Square(double side) {
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

class Triangle implements Shape {
    private double base;
    private double height;
    private double sideA; // Сторона A
    private double sideB; // Сторона B
    private double sideC; // Сторона C

    public Triangle(double base, double height, double sideA, double sideB, double sideC) {
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


public class Task6 {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        Shape square = new Square(4.0);
        Shape triangle = new Triangle(3.0, 4.0, 3.0, 4.0, 5.0);

        System.out.println(circle);
        System.out.println(square);
        System.out.println(triangle);
    }
}