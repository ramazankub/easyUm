package lesson16.threads;

import java.util.concurrent.Semaphore;

public class SemaphoreExample {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1);
        CommonResource1 commonResource1 = new CommonResource1();

        new Thread(new CountThread1(commonResource1, "CountThread1", semaphore)).start();
        new Thread(new CountThread1(commonResource1, "CountThread2", semaphore)).start();
        new Thread(new CountThread1(commonResource1, "CountThread3", semaphore)).start();
    }
}

class CommonResource1 {
    int x = 0;
}

class CountThread1 implements Runnable {

    CommonResource1 commonResource1;
    Semaphore semaphore;
    String name;

    public CountThread1(CommonResource1 commonResource1, String name, Semaphore semaphore) {
        this.commonResource1 = commonResource1;
        this.name = name;
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        try {
            System.out.println(name + " ожидает разрешения");
            semaphore.acquire();
            commonResource1.x = 1;
            for (int i = 1; i < 5; i++) {
                System.out.println(this.name + " значение переменной X " + commonResource1.x);
                commonResource1.x++;
                Thread.sleep(100);

            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(name + " освобождает разрешение");
        semaphore.release();
    }
}

