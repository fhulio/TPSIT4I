package Threads;

public class ProvaConteggio {
	public static void main(String args[]) {
		Thread tic=Thread.currentThread();
		tic.setName("Padre");
		System.out.println("Thread "+tic);
		Conteggio t1=new Conteggio(100, "figlio 1");
		Conteggio t2=new Conteggio(200, "figlio 2");
		Conteggio t3=new Conteggio(300, "figlio 3");
		
		t1.start();
		t2.start();
		t3.start();
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			System.out.println("Sono stato interrotto");
		
		}
		
		
		
		for(int i=0;i<10;i++) {
			System.out.println(i+" ");
		}
		System.out.println("primo thread terminato");
	}

}
