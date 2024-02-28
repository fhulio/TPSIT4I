package Threads;

public class Conteggio extends Thread{
	int n;
	String nome;
	Conteggio(int n, String nome){
		this.n=n;
		this.nome=nome;
	}
	public void run() {
		System.out.println(nome);
		for(int i=n; i<n+10; i++) {
			System.out.println(i+1+" ");
			/*
			try {
				Thread.sleep(1000);
			} catch ( InterruptedException e) {
				System.out.println("Sono stato interrotto");
			}*/
		}
	}
}
