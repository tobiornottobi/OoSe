package ex2;

public class Main {

	public static void main(String[] args) {
		System.out.println("Teste auf Gleichheit...");
		boolean a,b;
		a=(6.5f==6.5?true:false); // evaluiert zu true, denn 6.5 l�sst sich genau im Bin�rformat als float darstellen
		b=(6.4f==6.4?true:false); // evaluiert zu false, denn 6.4 ist eine periodische Bin�rzahl, die im float Format als IEEE-754 Kodierung 
		//gerundet werden muss. Daher schl�gt der Vergleich zu 6.4 fehl
		System.out.println("6.5f = 6.5  =>" + a);
		System.out.println("6.4f = 6.4  =>" + b);
		

	}

}
