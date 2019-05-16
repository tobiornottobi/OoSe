public class Cuboid extends Shape {

	double height;
	double width ;
	double depth;

	Cuboid(double[] position, double height, double width, double depth) {
		super(position);
		this.height = height;
		this.width = width;
		this.depth = depth;
	}

	@Override
	double volume() {
		return height * width * depth;
	}

	@Override
	void scale(double factor) {
		height *= factor;
		width *= factor;
		depth *= factor;;
	}
}