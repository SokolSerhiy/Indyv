package less14;

import java.io.Serializable;

public class Container<T> implements Serializable{

	private static final long serialVersionUID = 8317744092006822315L;
	
	private T element;

	public Container(T element) {
		this.element = element;
	}

	public T getElement() {
		return element;
	}

	public void setElement(T element) {
		this.element = element;
	}

	@Override
	public String toString() {
		return "Container [element=" + element + "]";
	}
}