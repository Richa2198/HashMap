package ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunRunnableTask {
    public static void main(String[] args) {
        //so here java  will create new thread say t0 and will assign task and then run normal main thread execution
        /*Thread thread1 = new Thread(new RunnableTask());
        thread1.start();
        System.out.println("Thread name: "+ Thread.currentThread().getName());*/

        //what if I want to have 10 task print the same?

       /* for(int i=0;i<10;i++){
            Thread thread = new Thread(new RunnableTask());
            thread.start();
            System.out.println("Thread name: "+ Thread.currentThread().getName());
        }*/

        //so here in above for loop it has created 10 new thread and assigned task to it.
        //what if I have 100 threads then it will create 100 new threads and will assign task. Not good approach

        //instead we can have a thread pool with fi-xed number of threads and can assign task to it : ExecutorService

        ExecutorService service = Executors.newFixedThreadPool(10);
        for(int i=0;i<100;i++){
            service.execute(new RunnableTask());
        }
        System.out.println("Thread: "+ Thread.currentThread().getName());
    }
}
