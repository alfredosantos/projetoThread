package br.com.threads;

public class Cavalo implements Runnable {
	String nome;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Cavalo(String nome) {
		super();
		this.nome = nome;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Cavalo =>  " + getNome() + " "+ i);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Cavalo => " + getNome() + " === C H E G O U ===");
	}
}