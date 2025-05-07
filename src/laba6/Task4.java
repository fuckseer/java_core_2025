package laba6;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Task4 {

    static class NumberPrinter implements Runnable {
        private final int number;

        public NumberPrinter(int number) {
            this.number = number;
        }

        @Override
        public void run() {
            System.out.println("Поток номер: " + number);
        }
    }

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(10);

        for (int i = 1; i <= 10; i++) {
            executor.submit(new NumberPrinter(i));
        }
        executor.shutdown();
        try {
            if (!executor.awaitTermination(5, TimeUnit.SECONDS)) {
                executor.shutdownNow();
            }
        } catch (InterruptedException e) {
            executor.shutdownNow();
        }

        System.out.println("Все потоки завершены");
    }
}
