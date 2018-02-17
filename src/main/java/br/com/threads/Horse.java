package br.com.threads;

import java.util.Random;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Horse implements Runnable {

  String nome;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Horse(String nome) {
    super();
    this.nome = nome;
  }

  public void run() {
    log.info("Running");
    for (int i = 0; i < 10; i++) {
      log.info("Horse =>  " + getNome() + " " + i);
      try {
        Thread.sleep(randInt(1000, 5000));

      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        log.error("Error is ", e);
      }
    }
    log.info("Horse => " + getNome() + " === F I N I S H ===");
  }

  public static int randInt(int min, int max) {

    // Usually this can be a field rather than a method variable
    Random rand = new Random();

    // nextInt is normally exclusive of the top value,
    // so add 1 to make it inclusive
    int randomNum = rand.nextInt((max - min) + 1) + min;

    return randomNum;
  }

}