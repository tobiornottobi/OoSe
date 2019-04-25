public class Singleton2 {

	private Singleton2() {

	}

	private static Singleton2 INSTANCE = new Singleton2();
	static Singleton2 getSingleton() {
		return INSTANCE;
	}
}