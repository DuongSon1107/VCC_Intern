package Concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimpleThreadPool {

    public static void main(String[] args) {

            ExecutorService executor = Executors.newFixedThreadPool(3);
            for (int i = 0; i < 10; i++) {
                Runnable numAbpple = new ThreadPool(i);
                executor.execute(numAbpple);
            }
            executor.shutdown();
            while (!executor.isTerminated()) {
            }
            System.out.println("Hoan thanh nhiem vu");
        }
    }
