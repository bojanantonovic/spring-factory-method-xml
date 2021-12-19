public class SimpleSingleton {
	private static final SimpleSingleton SINGLETON = new SimpleSingleton();

	private SimpleSingleton() {
	}

	public static SimpleSingleton getInstance() {
		return SINGLETON;
	}
}
