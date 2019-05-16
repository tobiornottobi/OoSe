
public class Kugel extends Körper{
	//Radius
	private double r;
	public Kugel(double p[], double r) {
		//this.p = p
		set_p(p);
		this.r = r;
	}
	public void scale(double scaler) {
		this.r = this.r * scaler;
	}
	public double volumne() {
		return Math.pow(this.r,3)*Math.PI*4/3;
	}
	public void print_para() {
		double[] p = new double[3];
		p = get_p();
		System.out.println("Position: (" + p[0] + " " + p[1] + " " + p[2] + ")");
		System.out.println("Typ: Kugel");
		System.out.println("Radius: " + this.r + "");
		System.out.println("Volumen: " + this.volumne() + "\n");
	}
}
