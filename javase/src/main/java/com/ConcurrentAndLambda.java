package com;

import java.util.concurrent.*;

/**
 *
 *
 * @author Haozhigang
 *
 *  2019年03月30日16:39
 *
 */
public class ConcurrentAndLambda {
    public static void main(String[] args) {
        show1();
        show2();
        show3();

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 10, TimeUnit.SECONDS, new LinkedTransferQueue<>());

        //        ExecutorService executorService = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 10; i++) {
            threadPoolExecutor.getThreadFactory().newThread(() -> System.err.println(Thread.currentThread().getName()+"---"+Thread.currentThread().getId())).start();
        }

    }

    private static void show1() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + " is running~~~");
            }
        }).start();
    }

    private static void show2() {
        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + " is running~~~");
        }).start();
    }

    private static void show3() {
        new Thread(() -> System.out.println(Thread.currentThread().getName() + " is running ~~~")).start();
    }
}
