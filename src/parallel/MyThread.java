package parallel;

import javax.swing.*;

public class MyThread implements Runnable {
    private JProgressBar nameJProgressBar;
    private int value;
    private int mult;

    MyThread(JProgressBar nameJProgressBar, String name, int mult) {
        this.nameJProgressBar = nameJProgressBar;
        Thread t = new Thread();
        t.setName(name);
        this.mult = mult;

    }


    @Override
    public void run()
    {
        System.out.println("Start " + Thread.currentThread().getName());
        {
            while (nameJProgressBar.getValue() < 100) {
                value = value + this.mult;
                nameJProgressBar.setValue(nameJProgressBar.getValue() + value);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            Thread.interrupted();
            System.out.println("Kill " + Thread.currentThread().getName());
        }

    }
}


