package com.core.java;

public class ThreadLocal {
    public static class ThreadLocalRunnable implements Runnable {

        private java.lang.ThreadLocal<Integer> threadLocalInteger = new java.lang.ThreadLocal<>();

        @Override

        public void run() {
            threadLocalInteger.set((int) (Math.random() * 50D));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println(threadLocalInteger.get());

        }
    }

    public static void main(String[] args) {
        ThreadLocalRunnable th = new ThreadLocalRunnable();
        Thread t1 = new Thread(th);
        Thread t2 = new Thread(th);
        t1.start();
        t2.start();
        Runnable r = new Thread();
    }

    class TestThread extends Thread{

        public void run()
        {
            System.out.println("Running");
        }

    }
}
