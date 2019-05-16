import java.util.Arrays;

public abstract class Shape {

	private double[] position;

	Shape(double [] position) {
		this.position = position;
	}

	public double[] getPosion() {
		return position;
	}

	abstract void scale(double factor);

	abstract double volume();

	void move(double [] direction) {
		position[0] += direction[0];
		position[1] += direction[1];
		position[2] += direction[2];
	}

	void print() {
		System.out.println(this.getClass().getSimpleName() + ", " + volume() + ", " + Arrays.toString(position));
	}
}