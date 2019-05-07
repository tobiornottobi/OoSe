public class Nr3 {

	public static void main(String[] args) {
		Person[] personen = new Person[]{ 
			new Person("Beothy-Elo", "Emil", 53332, "August-Macke Str.", 6), 
			new Person("Jandrey", "David", 404, "Ende-der-Welt", 700),
			new Person("lmnbvcxysertzu", "pa", 1456789, "iak", 2)
		};
		System.out.println(findMin(personen));

		Integer[] zahlen = new Integer[]{4, 8, 3, 4, 2, 0, -123, 4, -234567};
		System.out.println(findMin(zahlen));
	}

	public static <T extends Comparable<T>> T findMin(T[] x) {
		if (x == null) {
			return null;
		}
		
		T currMin;
		for (T comp : x) {
			if (currMin == null || currMin.compareTo(comp) > 0) {
				currMin = comp;
			}
		}
		return currMin;
	}
}