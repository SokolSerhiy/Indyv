package less16;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Singleton {

	private final static Singleton instance = new Singleton();
	
	public final List<Integer> queue = Collections.synchronizedList(new LinkedList<>());

	public static Singleton getInstance() {
		return instance;
	}
}
