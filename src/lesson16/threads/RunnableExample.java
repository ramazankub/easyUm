package lesson16.threads;

public class RunnableExample implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " started");

        try
        {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName() + " finished");
    }
}

class Program {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " Main thread started");
        Thread runnableExampleThread = new Thread(new RunnableExample(), "RunnableExample");
        runnableExampleThread.start();
        System.out.println(Thread.currentThread().getName() + "Main thread finished");
    }
}
