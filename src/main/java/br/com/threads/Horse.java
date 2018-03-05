package br.com.threads;

    import java.util.Random;
    import java.util.Timer;
    import java.util.concurrent.Callable;
    import java.util.concurrent.TimeUnit;

    import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Horse implements Runnable, Callable {

  String nome;

  public String getNome() {
    return nome;
  }

  public Horse(String nome) {
    super();
    this.nome = nome;
  }

  public void run() {
    log.info("Running Horse: " + getNome());
    try {
      TimeUnit.MILLISECONDS.sleep(randInt(1000, 5000));
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      log.error("Error is ", e);
    }
    log.info("Horse => " + getNome() + " === F I N I S H ===");
  }

  public static int randInt(int min, int max) {

    // Usually this can be a field rather than a method variable
    Random rand = new Random();

    // nextInt is normally exclusive of the top value,
    // so add 1 to make it inclusive
    return rand.nextInt((max - min) + 1) + min;
  }

  public Object call() throws Exception {
    log.info("Running Horse with call: " + getNome());
    try {
      TimeUnit.MILLISECONDS.sleep(randInt(1000, 5000));
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      log.error("Error is ", e);
    }
    log.info("Horse => " + getNome() + " === F I N I S H ===");
    return getNome();
  }
}