import java.util.Scanner;

public class Nr3 {

	public static void main(String[] args) {
		getNumberBigger5();
		try {
			getNumberSmaller5();
		} catch (NumberTooSmallException e) {
			System.out.println("Die Zahl war aber nicht größer als 5!!!");
		}
	}

	public static int getNumberSmaller5() throws NumberTooSmallException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Gib eine Zahl größer 5 ein:");
		int in = scanner.nextInt();
		if (in < 5) {
			throw new NumberTooSmallException();
		}
		return in;
	}

	public static int getNumberBigger5() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Gib eine Zahl kleiner 5 ein:");
		int in = scanner.nextInt();
		if (in > 5) {
			throw new NumberTooBigException();
		}
		return in;
	}
}