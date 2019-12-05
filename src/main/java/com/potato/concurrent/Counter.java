package com.potato.concurrent;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author dehuab
 */
@Slf4j
public class Counter {

    private static AtomicLong atomicCount = new AtomicLong();
    private static AtomicLong atomicCount1 = new AtomicLong();
    private static long count;
    private static int thread_count = 8;
    private static int compute_count = 1000000000;
    private static CountDownLatch latch = new CountDownLatch(thread_count);
    private static CountDownLatch latch1 = new CountDownLatch(compute_count);
    private static CountDownLatch latch2 = new CountDownLatch(thread_count);

    private static int CORE = Runtime.getRuntime().availableProcessors();
    private static final ThreadPoolExecutor threadPool = new ThreadPoolExecutor(
            CORE,
            CORE + 1,
            60,
            TimeUnit.SECONDS,
            new LinkedBlockingQueue<Runnable>(CORE << 4),
            new NamedThreadFactory("counter", false),
            new ThreadPoolExecutor.CallerRunsPolicy()
    );

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        for (int i = 1; i <= compute_count; i++) {
            count += i;
        }
        System.out.println("single thread cost " + (System.currentTimeMillis() - startTime));
        System.out.println(count);


        startTime = System.currentTimeMillis();
        for (int i = 0; i < thread_count; i++) {
            final int n = i;
            threadPool.execute(() -> {
                int start = 1 + n * (compute_count / thread_count);
                int c = 0;
                while (c < compute_count / thread_count) {
                    atomicCount.addAndGet(start);
                    start++;
                    c++;
                }
                latch.countDown();
            });
        }
        try {
            latch.await();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("\n" + thread_count + " thread atomic cost " + (System.currentTimeMillis() - startTime));
        System.out.println(atomicCount.get());


        startTime = System.currentTimeMillis();
        for (int i = 1; i <= compute_count; i++) {
            final int n = i;
            threadPool.execute(() -> {
                atomicCount1.addAndGet(n);
                latch1.countDown();
            });
        }
        try {
            latch1.await();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("\n" + compute_count + " thread atomic cost " + (System.currentTimeMillis() - startTime));
        System.out.println(atomicCount1.get());


        long[] resultArray = new long[thread_count];
        startTime = System.currentTimeMillis();
        for (int i = 0; i < thread_count; i++) {
            final int n = i;
            threadPool.execute(() -> {
                long start = 1 + n * (compute_count / thread_count);
                long c = 0;
                long sum = 0;
                while (c < compute_count / thread_count) {
                    sum += start;
                    start++;
                    c++;
                }
                resultArray[n] = sum;
                latch2.countDown();
            });
        }
        try {
            latch2.await();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        long s = 0;
        for (long i : resultArray) {
            s += i;
        }
        System.out.println("\n" + thread_count + " thread cost " + (System.currentTimeMillis() - startTime));
        System.out.println(s);

        threadPool.shutdown();
    }
}
