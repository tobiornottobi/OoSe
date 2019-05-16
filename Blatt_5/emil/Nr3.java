import java.util.Arrays;

public class Nr3 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(sortArr(new double[]{4, -1, -12, 6, 18, -2})));
	}

	public static double[] sortArr(double[] arr) {
		double[] ret = new double[arr.length];
		int index = 0;
		double biggest = - Double.MAX_VALUE;
		for (int i = 0; i < ret.length; ++i) {
			double minValue = minGreater(arr, biggest);
			ret[i] = minValue;
			biggest = minValue;
		}
		return ret;
	}

	public static double minGreater(double[] arr, double greater) {
		double min = Double.MAX_VALUE;
		for (double d : arr) {
			if (d > greater && d < min) min = d;
		}
		return min;
	}
}