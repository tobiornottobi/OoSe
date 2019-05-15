
public class Körper {
	//Position
	private double p[] = new double[3];
	public void set_p(double p[]) {
		this.p = p;
	}
	public double[] get_p() {
		return this.p;
	}
	
	public void move(double movement[]) {
		for(int i = 0; i<3; i++) {this.p[i]+=movement[i];}
	}
	public void scale(double scaler) {}
	public void print_para() {}
}
