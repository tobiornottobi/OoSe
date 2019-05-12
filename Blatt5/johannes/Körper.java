
public class Körper {
	//Position
	protected double p[] = new double[3];
	public void move(double movement[]) {
		for(int i = 0; i<3; i++) {this.p[i]+=movement[i];}
	}
	public void scale(double scaler) {}
	public void print_para() {}
}
