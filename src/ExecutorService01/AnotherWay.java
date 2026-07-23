package ExecutorService01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AnotherWay {
    static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(2);
        executorService.execute(()->{
            System.out.println("Task 1 started by : "+Thread.currentThread().getName());
            for (int i = 1; i <=50 ; i++) {
                System.out.println("Task 1: "+i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("Task 1 Completed by :"+Thread.currentThread().getName());
        });
        executorService.execute(()->{
            System.out.println("Task 2 started by : "+Thread.currentThread().getName());
            for (int i = 1; i <=50 ; i++) {
                System.out.println("Task 2: "+i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("Task 2 Completed by :"+Thread.currentThread().getName());
        });

        executorService.execute(()->{
            System.out.println("Task 3 started by : "+Thread.currentThread().getName());
            for (int i = 1; i <=50 ; i++) {
                System.out.println("Task 3: "+i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("Task 3 Completed by :"+Thread.currentThread().getName());
        });
    }
}
