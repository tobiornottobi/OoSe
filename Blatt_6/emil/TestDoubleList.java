public class TestDoubleList {

	public static void main(String[] args) {
		DoubleList list = new DoubleList();
		list.add(10);
		System.out.println(list);
		list.add(20);
		System.out.println(list);
		list.add(13);
		System.out.println(list);
		list.insertFirst(4);
		System.out.println(list);
		list.insertFirst(-40);
		System.out.println(list);

		list.remove(2);
		System.out.println(list);
		list.remove(0);
		System.out.println(list);
		list.remove(2);
		System.out.println(list);
		System.out.println(list.get(0));
	}
}