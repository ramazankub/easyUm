package lesson16.threads;

import java.util.concurrent.Exchanger;

public class ExchangerExample {
    public static void main(String[] args) {
        Exchanger<String> exchanger = new Exchanger<>();

        new Thread(new PutThread(exchanger)).start();
        new Thread(new GetThread(exchanger)).start();

    }
}

class PutThread implements Runnable {
    Exchanger<String> exchanger;
    String message;

    public PutThread( Exchanger<String> exchanger) {
        this.exchanger = exchanger;
        message = "Hello world";
    }

    @Override
    public void run() {
        try {
            message = exchanger.exchange(message);
            System.out.println("PutThread получил сообщение " + message);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class GetThread implements Runnable {
    Exchanger<String> exchanger;
    String message;

    public GetThread( Exchanger<String> exchanger) {
        this.exchanger = exchanger;
        message = "Hello my little friend";
    }

    @Override
    public void run() {
        try {
            message = exchanger.exchange(message);
            System.out.println("GetThread получил сообщение " + message);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
