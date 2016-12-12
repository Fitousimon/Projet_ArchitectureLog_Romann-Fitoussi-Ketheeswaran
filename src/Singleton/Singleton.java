package Singleton;

public final class Singleton {
	private static Singleton instance = null; 
	
	
	private Singleton() {
		super();
	}
	
	public static Singleton getSingleton() {
		
		if (instance ==null) {
			Singleton.instance = new Singleton();
		}
			
		
	return Singleton.instance;
		
	}
}
