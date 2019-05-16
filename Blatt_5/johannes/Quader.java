
public class Quader extends Körper {
	//Längenangaben
	private double l;
	private double b;
	private double h;

	public Quader(double p[], double l, double b, double h) {
		set_p(p);
		this.l = l;
		this.b = b;
		this.h = h;
	}
	public void scale(double scaler) {
		l *= scaler;
		b *= scaler;
		h *= scaler;
	}
	public double volumne() {
		return l*b*h;
	}
	public void print_para() {
		double[] p = new double[3];
		p = get_p();
		System.out.println("Position: (" + p[0] + " " + p[1] + " " + p[2] + ")");
		System.out.println("Typ: Quader");
		System.out.println("Länge: " + l);
		System.out.println("Breite: " + b);
		System.out.println("Höhe: " + h);
		System.out.println("Volumen: " + this.volumne() + "\n");
	}
}
