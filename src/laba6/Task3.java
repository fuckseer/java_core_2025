package laba6;

public class Task3 {

    public static void main(String[] args) {
        Runnable evenTask = () -> {
            for (int i = 1; i <= 10; i++) {
                if (i % 2 == 0) {
                    System.out.println("четное число: " + i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println("поток четных чисел прерван");
                        Thread.currentThread().interrupt();
                        break;
                    }
                }
            }
        };

        Runnable oddTask = () -> {
            for (int i = 1; i <= 10; i++) {
                if (i % 2 != 0) {
                    System.out.println("нечетное число: " + i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println("поток нечетных чисел прерван");
                        Thread.currentThread().interrupt();
                        break;
                    }
                }
            }
        };

        Thread evenThread = new Thread(evenTask, "EvenNumberThread");
        Thread oddThread = new Thread(oddTask, "OddNumberThread");

        evenThread.start();
        oddThread.start();

        try {
            evenThread.join();
            oddThread.join();
        } catch (InterruptedException e) {
            System.out.println("основной поток прерван");
        }
    }
}