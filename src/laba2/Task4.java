package laba2;

class Person {
    private String name;
    private int age;
    private String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public String toString() {
        return "Имя: " + name + ", Возраст: " + age + ", Пол: " + gender;
    }
}

public class Task4 {
    public static void main(String[] args) {

        Person person = new Person("Ксю", 22, "Женский");

        System.out.println(person);

        person.setAge(31);

        System.out.println("После обновления возраста:");
        System.out.println(person);
    }
}