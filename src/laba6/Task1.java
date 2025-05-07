package laba6;

import java.time.LocalTime;

public class Task1 {

    public static void main(String[] args) {
        Runnable task = () -> {
            while (!Thread.currentThread().isInterrupted()) {
                String threadName = Thread.currentThread().getName();
                LocalTime currentTime = LocalTime.now();
                System.out.println(threadName + ", Время: " + currentTime);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        };

        Thread thread1 = new Thread(task, "поток 1");
        Thread thread2 = new Thread(task, "поток 2");

        thread1.start();
        thread2.start();

        try {
            Thread.sleep(10_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread1.interrupt();
        thread2.interrupt();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}