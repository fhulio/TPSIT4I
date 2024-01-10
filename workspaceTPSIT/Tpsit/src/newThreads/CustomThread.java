package newThreads;

public class CustomThread extends Thread{
	int vettore [];
	public CustomThread(int[]vettore) {
		this.vettore=vettore;
	}
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(i);
			try {
				sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
