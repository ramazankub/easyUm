package lesson16.threads;

import java.util.concurrent.Semaphore;

public class PhilosopherExample {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(2);

        for (int i = 1; i < 6; i++) {
            new Philosopher(semaphore, i).start();
        }
    }
}

class Philosopher extends Thread {
    Semaphore semaphore;
    int num = 0;
    int id;

    public Philosopher(Semaphore semaphore, int id) {
        this.semaphore = semaphore;
        this.id = id;
    }

    @Override
    public void run() {
        try {
            while (num < 3) {
                semaphore.acquire();
                System.out.println("Философ " + id + "ест");
                sleep(500);
                num++;
                System.out.println("Философ " + id + "уходит");
                semaphore.release();
                sleep(500);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
