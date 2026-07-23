package ExecutorService01;

public class Demo {
    static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        MyThread m1=new MyThread();
        MyThread m2=new MyThread();
        MyThread m3=new MyThread();
        m1.start();
        m2.start();
        m3.start();
    }
}
class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
