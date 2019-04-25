public class Singleton {

	private Singleton() {

	}

	private static Singleton INSTANCE = null;
	static Singleton getSingleton() {
		if (INSTANCE == null) INSTANCE = new Singleton();
		return INSTANCE;
	}
}