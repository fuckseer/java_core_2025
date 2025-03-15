package laba2;

public class Example2 {
    public static String getEncryptString(String encryptString, int shift) {
        char[] arrayChar = encryptString.toCharArray();
        long[] arrayInt = new long[arrayChar.length];
        char[] arrayCharNew = new char[arrayChar.length];
        for (int i = 0; i < arrayChar.length; i++) {
            arrayInt[i] = arrayChar[i] + shift;
            arrayCharNew[i] = (char) arrayInt[i];
        }
        encryptString = new String(arrayCharNew);
        return encryptString;
    }
}

class MyOtherClass {
    public static void main(String[] args) {
        Example2 myObject = new Example2();
        System.out.println("Cтрока до преобразования: java");
        System.out.println("Строка после" + myObject.getEncryptString("java", 2));
    }
}


