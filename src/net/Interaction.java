package net;

public class Interaction {
    public static void main(String[] args) {
//сервер
        new Thread(new Runnable() {
            @Override
            public void run() {
                new Server();
            }
        }).start();

//клиент
        new Thread(new Runnable() {
            @Override
            public void run() {
                new Client();
            }
        }).start();
    }
}
