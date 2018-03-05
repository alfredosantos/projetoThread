package br.com.executor;

import br.com.threads.Horse;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Executor {
  public static void main(String[] args) throws ExecutionException, InterruptedException {
    // define threads
    int maxThreadCount = 10;
    ExecutorService executorService = Executors.newFixedThreadPool(maxThreadCount);

    executorService.execute(new Horse("Black"));
    executorService.execute(new Horse("White"));
    executorService.execute(new Horse("Knightly"));
    executorService.execute(new Horse("Brown"));

    Set<Callable<String>> callables = new HashSet<Callable<String>>();
    callables.add(new Horse("Hildago"));
    String result = executorService.invokeAny(callables);
    log.info("Result is: " +result);
    executorService.shutdown();

    if(!executorService.isShutdown()) {
      // force shutdown
      executorService.shutdownNow();
    }
  }
}
