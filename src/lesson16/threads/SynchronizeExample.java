package lesson16.threads;

public class SynchronizeExample {
    public static void main(String[] args) {
        CommonResource commonResource = new CommonResource();
        for (int i = 1; i < 6; i++) {
            Thread thread = new Thread(new CountThread(commonResource));
            thread.setName("Thread " + i);
            thread.start();
        }
    }
}

class CommonResource {
    int x = 0;
}

class CountThread implements Runnable {

    CommonResource commonResource;

    public CountThread(CommonResource commonResource) {
        this.commonResource = commonResource;
    }

    @Override
    public void run() {
        synchronized (commonResource) {
            commonResource.x = 1; //для каждого нового потока X сбрасывается к начальному значению
            for (int i = 1; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + " значение переменной X " + commonResource.x++);

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}