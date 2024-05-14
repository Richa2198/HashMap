package ExecutorService;

public class RunnableTask implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread name: "+ Thread.currentThread().getName());
    }
}
