
public class Test {
	
	

	public static void main(String[] args) {
		Person[] arr=new Person[5];
		arr[0]=new Person("Zu","z",1, "z", 1);
		arr[1]=new Person("Zo","y",1, "z", 1);
		arr[2]=new Person("Zimmer","Hans",1, "z", 1);
		arr[3]=new Person("Zimmer","Hans",5, "z", 1);
		//System.out.println((((Person)(Klassemin.findMin(arr))).name));
		System.out.println(((Klassemin.findMin(arr)).name));
		Integer[] array={4, 2, 5, 1, 9};
		System.out.println(Klassemin.findMin(array));
	}

}
