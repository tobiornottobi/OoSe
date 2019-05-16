public class Sphere extends Shape {
	
	private double radius;

	Sphere(double[] position, double radius) {
		super(position);
		this.radius = radius;
	}

	@Override
	void scale(double factor) {
		radius *= factor;
	}

	@Override
	double volume() {
		return 4 / 3 * Math.PI * radius * radius * radius;
	}

	double getRadius() {
		return radius;
	}
}