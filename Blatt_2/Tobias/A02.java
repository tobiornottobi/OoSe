
public class A02 {

	public static void main(String[] args) {
		double a1=6.5f;
		double a2=6.5;
		double b1=6.4f;
		double b2=6.4;

		System.out.println( (a1==a2)? "a1==a2":"a1!=a2");
		System.out.println( (b1==b2)? "b1==b2":"b1!=b2");
		System.out.println("Erklärung: 0.5 kann mit endlichen binärstellen dargestellt werden, was bei 0.4 unmöglich ist. Daher ist bei .4 immer mit Genauigkeitsunterschieden zu rechnen");

	}

}
