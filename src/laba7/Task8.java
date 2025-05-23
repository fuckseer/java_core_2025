package laba7;

import java.io.*;
import java.util.Scanner;


class Person2 implements Serializable {
    private static final long serialVersionUID = 1L;


    private String name;
    private int age;
    private String email;
    private boolean isEmployed;

    public Person2(String name, int age, String email, boolean isEmployed) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.isEmployed = isEmployed;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public boolean isEmployed() {
        return isEmployed;
    }

    @Override
    public String toString() {
        return "Имя: " + name +
                "\nВозраст: " + age +
                "\nEmail: " + email +
                "\nРаботает: " + (isEmployed ? "Да" : "Нет");
    }
}

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Введите имя:");
            String name = scanner.nextLine();

            System.out.println("Введите возраст:");
            int age = Integer.parseInt(scanner.nextLine());

            System.out.println("Введите email:");
            String email = scanner.nextLine();

            System.out.println("Работает? (да/нет):");
            boolean isEmployed = scanner.nextLine().equalsIgnoreCase("да");

            Person2 person = new Person2(name, age, email, isEmployed);

            System.out.println("Введите имя файла для сохранения объекта:");
            String fileName = scanner.nextLine();

            try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))) {
                out.writeObject(person);
                System.out.println("Объект успешно сохранен в файл " + fileName);
            } catch (IOException e) {
                System.out.println("Ошибка при сохранении объекта: " + e.getMessage());
                return;
            }

            try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))) {
                Person2 restoredPerson = (Person2) in.readObject();
                System.out.println("\nОбъект успешно восстановлен из файла " + fileName);
                System.out.println("\nЗначения полей восстановленного объекта:");
                System.out.println(restoredPerson);
            } catch (IOException | ClassNotFoundException e) {
                System.out.println("Ошибка при восстановлении объекта: " + e.getMessage());
            }

        } catch (NumberFormatException e) {
            System.out.println("Ошибка: Неверный формат числа");
        } finally {
            scanner.close();
        }
    }
}
