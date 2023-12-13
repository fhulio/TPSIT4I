package it.edu.iisgubbio.threads;

/**
 * Un thrad in Java può essere utilizzato in vari modi:
 * faccio una classe che estende la classe nativa di Java 
 * thread che ha due metodi principali:
 * start() : fa partire il thread
 * run () : contiene il codice che deve essere eseguito dal thread
 *
 */
public class HelloThreads extends Thread{
	public static void main (String args []) {
		HelloThreads t1 = new HelloThreads();
		t1.start();
	}
	public void run() {
		System.out.println("Hello from a thread");
	}
}
