package it.edu.iisgubbio.threads.esercizio;

public class Principale extends Thread{

	public static void main(String[] args) {
		Thread1 t1= new Thread1();
		Thread2 t2 = new Thread2();
		t1.start();
		try {
			t1.sleep(500);
		}catch (InterruptedException e) {
			System.out.println("Errore");
	
	}
		t2.start();
	}
}
