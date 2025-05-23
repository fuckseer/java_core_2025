package laba7;

import java.io.*;
import java.util.Scanner;

public class Task2_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя персоны:");
        String name = scanner.nextLine();

        System.out.println("Введите возраст персоны:");
        int age;
        try {
            age = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Ошибка ввода возраста. Используется значение по умолчанию 0.");
            age = 0;
        }

        Person1 person = new Person1(name, age);

        try {
            FileOutputStream fileOut = new FileOutputStream("src/laba7/person.json");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(person);
            out.close();
            fileOut.close();
            System.out.println("Сериализованные данные сохранены в person.json");

            System.out.println("Сохраненные данные:");
            System.out.println("Имя: " + person.getName());
            System.out.println("Возраст: " + person.getAge());
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Хотите удалить файл? (да/нет):");
        String answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("да")) {
            File file = new File("src/laba7/person.json");
            if (file.delete()) {
                System.out.println("Файл удален: src/laba7/person.json");
            } else {
                System.out.println("Не удалось удалить файл: src/laba7/person.json");
            }
        } else {
            System.out.println("Файл сохранен.");
        }

        scanner.close();
    }
}

class Person1 implements Serializable {
    private String name;
    private int age;

    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
