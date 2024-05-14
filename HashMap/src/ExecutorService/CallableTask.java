package ExecutorService;

import java.util.Random;
import java.util.concurrent.Callable;

public class CallableTask implements Callable<String> {

    @Override
    public String call() throws Exception {
        return "Hi";
    }
}
