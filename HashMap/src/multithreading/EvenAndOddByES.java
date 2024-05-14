package multithreading;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

//using executor service and completable future
public class EvenAndOddByES {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(2);
        IntStream.rangeClosed(1, 10).forEach(nums -> {
            CompletableFuture<Integer> oddCompletableFuture = CompletableFuture.completedFuture(nums)
                    .thenApplyAsync(i -> {
                        if (i % 2 != 0)
                            System.out.println("Thread name: " + Thread.currentThread().getName() + " : " + i);

                        return i;
                    }, es);
            oddCompletableFuture.join();
            CompletableFuture<Integer> evenCompletableFuture = CompletableFuture.completedFuture(nums)
                    .thenApplyAsync(x -> {
                        if (x % 2 == 0) {
                            System.out.println("Thread Name " + Thread.currentThread().getName() + " : " + x);
                        }
                        return nums;
                    }, es);
            evenCompletableFuture.join();
        });
        es.shutdown();
    }
    public void doIt(){
        ExecutorService executorService= Executors.newFixedThreadPool(2);
        IntStream.rangeClosed(1, 10).forEach(x -> {
            CompletableFuture<Integer> oddCompletable = CompletableFuture.completedFuture(x)
                    .thenApplyAsync(i -> {
                        if (i % 2 != 0) {
                            System.out.println("Thread : " + Thread.currentThread().getName() + " " + i);
                        }
                        return i;
                    }, executorService);
            oddCompletable.join();
            CompletableFuture<Integer> evenCompletable = CompletableFuture.completedFuture(x)
                    .thenApplyAsync(i -> {
                        if (i % 2 == 0) {
                            System.out.println("Thread : " + Thread.currentThread().getName() + " " + i);
                        }
                        return i;
                    }, executorService);
            evenCompletable.join();
        });
        executorService.shutdown();
    }
}

