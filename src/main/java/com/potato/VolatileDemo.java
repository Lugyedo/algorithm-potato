package com.potato;

/**
 * Volatile demo
 *
 * @author dehuab
 * <p>
 * https://www.cnblogs.com/stevenczp/p/7978554.html
 * 内存可见性，指令重排序，JIT
 */
public class VolatileDemo {
    public static void main(String[] args) throws InterruptedException {
        VolatileThread volatileThread = new VolatileThread();
        volatileThread.start();

        //TimeUnit.MILLISECONDS.sleep(3);
        volatileThread.setFlag(false);
        System.out.println("主线程结束。");
    }

    static class VolatileThread extends Thread {
        private boolean flag = true;

        @Override
        public void run() {
            System.out.println("子线程开始执行。。。");
            while (flag) {
                System.out.println("在循环");
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
}

