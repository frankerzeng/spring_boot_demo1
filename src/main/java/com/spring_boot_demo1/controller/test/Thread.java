package com.spring_boot_demo1.controller.test;

class Thread extends java.lang.Thread {

    private Object obj;

    public Thread(String name) {
        super(name);
    }

    public void run() {
        synchronized (obj) {
            try {
                for (int i = 0; i < 10; i++) {
                    System.out.printf("%s: %d\n", this.getName(), i);
                    // i能被4整除时，休眠100毫秒
                    if (i % 4 == 0)
                        java.lang.Thread.sleep(100);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread("t1");
        Thread t2 = new Thread("t2");
        t1.start();
        t2.start();
    }
}