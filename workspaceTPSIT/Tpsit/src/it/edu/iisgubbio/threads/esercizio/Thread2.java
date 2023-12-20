package it.edu.iisgubbio.threads.esercizio;

public class Thread2 extends Thread{
	public void run(){
		for(int i =50;i<=100;i++) {
			System.out.println(i);
		}
	}

}
