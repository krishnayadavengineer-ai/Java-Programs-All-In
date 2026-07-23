package ExecutorService01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ex1 {
    static void main(String[] args) {
       ExecutorService executorService= Executors.newFixedThreadPool(2);
       executorService.execute(()->{
           for (int i = 0; i <=50 ; i++) {
               System.out.println(i);
           }
       });

    }
}
