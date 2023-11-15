package it.edu.iisgubbio.operazioni;

public class Operazioni {
	int n1,n2;
	public Operazioni(int x, int y) {
		n1=x;
		n2=y;
	}
	public int Somma() {
		return n1+n2;
	}
	public int Prodotto() {
		return n1*n2;
	}
	public static void main(String[] args ) {
		Operazioni Op=new Operazioni(3,4);
		System.out.println(Op.Somma());
		System.out.println(Op.Prodotto());
	}
}
