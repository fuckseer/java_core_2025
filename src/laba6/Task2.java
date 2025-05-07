package laba6;

public class Task2 {

    public static void main(String[] args) {
        Runnable task = () -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("поток прерван");
                    return;
                }
            }
        };

        Thread numberThread = new Thread(task, "NumberPrinterThread");
        numberThread.start();

        try {
            numberThread.join();
        } catch (InterruptedException e) {
            System.out.println("основной поток прерван");
        }

    }
}