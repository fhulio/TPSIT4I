package minimo.vettore;

import java.util.Random;

public class ConteggioLista extends Thread{
	int [] vettore;
	int inizio;
	int fine;
	int minimo=vettore[0];
	ConteggioLista(int []vettore, int inizio, int fine){
		this.vettore=vettore.clone();
		this.inizio=inizio;
		this.fine=fine;
	}
	
	public void run() {
		
		for(int i=inizio; i<fine;i++) {
			if(vettore[i]<minimo) {
				minimo=vettore[i];
			}
			System.out.println(minimo);
		}
		
			}
	public int getMinimo() {
		return minimo;
	}
		
		
	}
	
