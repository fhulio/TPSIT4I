package it.edu.issgubbio.fcfs;


public class Fcfs {

	

	


public static void main(String[] args ) {	
	String[] processo= new String[4];
	int []tArrivo=new int [4];
	int []tEsecuzione=new int [4];
	int []tServizio=new int [4];
	int []tAttesa=new int [4];
	double media;
	
	processo[0]="P0";
	processo[1]="P1";
	processo[2]="P2";
	processo[3]="P3";
	
//	tArrivo[0]=0;
//	tArrivo[1]=1;
//	tArrivo[2]=2;
//	tArrivo[3]=3;
	
	for (int x=0; x<4;x++) {
		tArrivo[x]=x;
	}
	
	
	
	
	
	tEsecuzione[0]=5;
	tEsecuzione[1]=3;
	tEsecuzione[2]=8;
	tEsecuzione[3]=6;
	
	for(int k=0; k<4;k++) {
		if(k==0) {
			tServizio[k]=0;
		}else {
			tServizio[k]=tServizio[k]+tEsecuzione[k-1];
		}
	}
//	tServizio[0]=0; ciao
//	tServizio[1]=tServizio[0]+tEsecuzione[0];
//	tServizio[2]=tServizio[1]+tEsecuzione[1];
//	tServizio[3]=tServizio[2]+tEsecuzione[2];
	
	for (int i=0; i<=3;i++) {
		System.out.println(processo[i]);

	}
	for (int p=0; p<=3;p++) {
		System.out.println(tAttesa[p]);

	}
	
	
	
	
	
	
	
	
	

}
}