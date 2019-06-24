
public class A3 extends A2 {

	public static void main(String[] args) {
		long time1=System.currentTimeMillis();

		int[] arr=A1.primzahlenZwischen(1, 4000);
		for (int i=0; arr[i]!=0;i++) {
			System.out.println(arr[i]+" ");
		}
		time1=System.currentTimeMillis()-time1;

			
		Thread[] t=new Thread[4];	
			
			
		PrimzahlRechner[] p=new PrimzahlRechner[4];
		p[0]=new PrimzahlRechner(1, 1000);
		p[1]=new PrimzahlRechner(1001, 2000);
		p[2]=new PrimzahlRechner(2001, 3000);
		p[3]=new PrimzahlRechner(3001, 4000);
		t[0]=new Thread(p[0]);
		t[1]=new Thread(p[1]);
		t[2]=new Thread(p[2]);
		t[3]=new Thread(p[3]);
		long time2=System.currentTimeMillis();
		for(int i=0; i<4;i++) {
			t[i].start();
		}
		for(int i=0; i<4;i++) {
			try {
				t[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		time2=System.currentTimeMillis()-time2;
		for(int k=0; k<4;k++) {
			int arr2[]=p[k].getErgebnis();
			for (int i=0; arr2[i]!=0;i++) {
				System.out.println(arr2[i]+" ");
				}
			System.out.println();
		}
		
		System.out.println(time1 +" : " +time2);

	}
	
	//Aufgabe 3 c: der Erste ist am schnellsten. Es wäre sinnvoll, in viererschritten zu gehen, nicht in angrenzenden Intervallen. Dann haben alle Threads ähnlich große Zahlen
	
	
}