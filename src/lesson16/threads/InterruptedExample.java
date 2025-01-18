package lesson16.threads;


public class InterruptedExample {
    public static void main(String[] args) {
        //Вывод текущего потока
        System.out.println("Main thread started");

        newThreadInterrupted newThread = new newThreadInterrupted("Thread example");
        newThread.start();
        try{
            Thread.sleep(50);
            newThread.interrupt();
            Thread.sleep(50);
        } catch (Exception e) {
            System.out.println("Thread has been interrupted");
            throw new RuntimeException(e);
        }

        System.out.println("Main thread finished");
    }
}

class newThreadInterrupted extends Thread {
    public newThreadInterrupted(String name) {
        super(name);
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + " started its work");

        try{
            int counter = 1;
            while (!isInterrupted()) {
                System.out.println("Loop " + counter++);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName() + " finished its work");
    }
}

