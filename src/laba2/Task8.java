package laba2;

class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void makeSound() {
        System.out.println("Животное издает звук");
    }
}

class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Гав-гав!");
    }

    public void displayInfo() {
        System.out.println("Собака: " + getName() + ", Возраст: " + getAge() + ", Порода: " + breed);
    }
}

class Cat extends Animal {
    private String favoriteFood; // Любимый корм

    public Cat(String name, int age, String favoriteFood) {
        super(name, age);
        this.favoriteFood = favoriteFood;
    }

    @Override
    public void makeSound() {
        System.out.println("Мяу!");
    }

    public void displayInfo() {
        System.out.println("Кошка: " + getName() + ", Возраст: " + getAge() + ", Любимый корм: " + favoriteFood);
    }
}

class Bird extends Animal {
    private boolean canFly;

    public Bird(String name, int age, boolean canFly) {
        super(name, age);
        this.canFly = canFly;
    }

    @Override
    public void makeSound() {
        System.out.println("Чирик-чирик!");
    }

    public void displayInfo() {
        System.out.println("Птица: " + getName() + ", Возраст: " + getAge() + ", Может летать: " + (canFly ? "Да" : "Нет"));
    }
}

public class Task8 {
    public static void main(String[] args) {
        Dog dog = new Dog("Рекс", 5, "Немецкая овчарка");
        Cat cat = new Cat("Мурка", 3, "Курица");
        Bird bird = new Bird("Кеша", 2, true);

        dog.displayInfo();
        dog.makeSound();

        System.out.println();

        cat.displayInfo();
        cat.makeSound();

        System.out.println();

        bird.displayInfo();
        bird.makeSound();
    }
}