package br.com.executor;

import br.com.threads.Horse;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executor {
  public static void main(String[] args) {
    // define threads
    int maxThreadCount = 10;
    ExecutorService executorService = Executors.newFixedThreadPool(maxThreadCount);

    executorService.execute(new Horse("Black"));
    executorService.execute(new Horse("White"));
    executorService.execute(new Horse("Knightly"));
    executorService.execute(new Horse("Brown"));
    executorService.shutdown();

    if(!executorService.isShutdown()) {
      // force shutdown
      executorService.shutdownNow();
    }
  }
}
