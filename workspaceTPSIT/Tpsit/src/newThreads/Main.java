package newThreads;

public class Main {
	public static void main (String ars[]) {
		CustomThread c1 = new CustomThread();
		c1.start();
		CustomThread c2 = new CustomThread();
		c2.start();
	}
}
