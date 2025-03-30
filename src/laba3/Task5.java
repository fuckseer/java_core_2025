package laba3;

import java.util.HashMap;
import java.util.Map;

public class Task5 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(0, "Ноль");
        map.put(1, "Один");
        map.put(2, "Два");
        map.put(3, "Три");
        map.put(4, "Четыре");
        map.put(5, "Пять");
        map.put(6, "Шесть");
        map.put(7, "Семь");
        map.put(8, "Восемь");
        map.put(9, "Девять");

        System.out.println("с ключом > 5:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getKey() > 5) {
                System.out.println("ключ: " + entry.getKey() + ", значение: " + entry.getValue());
            }
        }

        System.out.println("\nстроки с ключом = 0");
        StringBuilder zeroKeyValues = new StringBuilder();
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getKey() == 0) {
                zeroKeyValues.append(entry.getValue()).append(", ");
            }
        }
        if (zeroKeyValues.length() > 0) {
            zeroKeyValues.setLength(zeroKeyValues.length() - 2);
            System.out.println(zeroKeyValues.toString());
        } else {
            System.out.println("нет строк с ключом=0");
        }

        int product = 1;
        boolean hasMultiplicands = false;
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getValue().length() > 5) {
                product *= entry.getKey();
                hasMultiplicands = true;
            }
        }
        if (hasMultiplicands) {
            System.out.println("\nпроизведение ключей, где длина строки > 5: " + product);
        } else {
            System.out.println("\nНет строк с длиной > 5 символов");
        }
    }
}
