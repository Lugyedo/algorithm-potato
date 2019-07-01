package com.potato.concurrent;

import java.util.concurrent.TimeUnit;

class VolatileThread extends Thread {
    private boolean flag = true;

    @Override
    public void run() {
        System.out.println("子线程开始执行。。。");
        while (flag) {
            //System.out.println("在循环");
        }
        System.out.println("子线程结束执行。。。");
    }

    public boolean getFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}

public class Volatile1 {
    public static void main(String[] args) throws InterruptedException {
        VolatileThread volatileThread = new VolatileThread();
        volatileThread.start();

        Thread.sleep(3);
        volatileThread.setFlag(false);
        System.out.println("主线程结束。");
    }
}