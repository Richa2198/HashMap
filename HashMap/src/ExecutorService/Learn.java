package ExecutorService;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Learn {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(10);
        Future<String> future = service.submit(new CallableTask());
        Future<?> submit = service.submit(new RunnableTask());
        try{
            String result = future.get();
            System.out.println("Result: "+ result);
        }catch(InterruptedException| ExecutionException e){
            e.printStackTrace();
        }
    }

}
