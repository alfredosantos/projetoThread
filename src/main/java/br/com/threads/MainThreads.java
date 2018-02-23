package br.com.threads;

public class MainThreads {

  public static void main(String[] args) {
    Runnable r1 = new Cavalo("Black");
    Runnable r2 = new Cavalo("White");
    Runnable r3 = new Cavalo("Knightly");
    Runnable r4 = new Cavalo("Brown");

    Thread t1 = new Thread(r1);
    Thread t2 = new Thread(r2);
    Thread t3 = new Thread(r3);
    Thread t4 = new Thread(r4);

    t1.start();
    t2.start();
    t3.start();
    t4.start();
  }
}
