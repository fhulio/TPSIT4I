package minimo.vettore;

import Threads.Conteggio;

public class ProvaConteggio {
	
			 

	
	
	
	public static void main(String args[]) {
		Thread tic=Thread.currentThread();
		tic.setName("Padre");
		System.out.println("Thread "+tic);
		int vettore [];
		vettore=new int[100000];
		for(int i=0;i<100000;i++) {
			vettore[i]=(int) (Math.random()*10000);
		}
		
		
		ConteggioLista t1=new ConteggioLista(vettore,0,vettore.length/2);
		ConteggioLista t2=new ConteggioLista(vettore,vettore.length/2+1,vettore.length);
		
		t1.start();
		t2.start();
		
	}
}