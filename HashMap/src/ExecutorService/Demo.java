package ExecutorService;

import java.util.concurrent.*;

public class Demo {
    public static void main(String[] args) {
        for (int i = 1; i < 50; i++) {
//            ExecutorService service = Executors.newFixedThreadPool(10);
//            try {
//                Future<Integer> f1 = service.submit(getOrderTask());
//                Integer t1 = f1.get();//blocking
//
//                Future<Integer> f2 = service.submit(performPaymentTask());
//                Integer t2 = f2.get();
//
//                Future<Integer> f3 = service.submit(dispatch());
//                Integer t3 = f3.get();
//            } catch (InterruptedException | ExecutionException e) {
//                e.printStackTrace();
//            }
//
  //           CompletableFuture.supplyAsync(()->new Order())
//                   .thenApply(t->performPayment(t))
//                   .thenApply(t->dispatch(t))
//                   .thenAccept(t->sendEmail(t));
   }

        }

    }
