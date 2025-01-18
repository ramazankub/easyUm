package lesson16.threads;

public class ThreadExample {
    public static void main(String[] args) {
        //Вывод текущего потока
        System.out.println("Main thread started");

        newThread newThread = new newThread("Thread example");
        newThread.start();
        try{
            newThread.join();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println("Main thread finished");

//        for (int i = 0; i < 5; i++) {
//            new newThread ("Thread example" + i).start();
//        }
    }
}

class newThread extends Thread {
    public newThread(String name) {
        super(name);
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + " started its work");

        try{
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName() + " finished its work");
    }
}
