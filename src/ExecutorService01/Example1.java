package ExecutorService01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Example1 implements Runnable{
    private int taskId;

    public Example1(int taskId) {
        this.taskId = taskId;
    }
    @Override
    public void run() {
        System.out.println("Task: "+ taskId + "starting by :"+ Thread.currentThread().getName());
        for (int i = 1; i <=50 ; i++) {
            System.out.println("Task : "+taskId+" : "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Task " + taskId +
                " completed by " + Thread.currentThread().getName());
    }

    static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(2);
        executorService.execute(new Example1(1));
        executorService.execute(new Example1(3));
        executorService.execute(new Example1(2));


        executorService.shutdown();
    }
}
