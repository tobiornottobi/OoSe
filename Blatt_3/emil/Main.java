public class Main {

	public static void main(String[] args) {
		Sheep sheep = new Sheep("Dolly", new Fur(10));
		Sheep sheep2 = sheep.clone();
		Sheep deepSheep = sheep.deepclone();
		Sheep shadowSheep = sheep.shadowclone();
		
		sheep2.shear();

		System.out.println(sheep);
		System.out.println(sheep2);
		System.out.println(shadowSheep);
		System.out.println(deepSheep);
	}
}