import java.util.ArrayList;

public class Nr2 {

	public static void main(String[] args) {
		ArrayList<Shape> list = new ArrayList<>();

		double[] arr1 = new double[]{1, 2, 3};
		Sphere s = new Sphere(arr1, 4.0);
		list.add(s);

		double[] arr2 = new double[]{3, 3, 3};
		Cuboid c = new Cuboid(arr2, 4.0, 2.0, 1.0);
		list.add(c);

		for (Shape shape : list) {
			shape.print();
		}
	}
}