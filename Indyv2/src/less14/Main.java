package less14;

import less3.Circle;
import less3.Figure;
import less3.Rectangle;

public class Main {

	public static void main(String[] args) {
		Container<String> container = new Container<>("Ivan");
		System.out.println(container);
		System.out.println(container.getElement().substring(0,1));
		Container<Integer> container2 = new Container<>(4);
		System.out.println(container2.getElement());
		Container<Rectangle> container3 = new Container<>(new Rectangle(4, 5));
		print(container3);
		print(new Rectangle(4, 5));
		add(new Container<>(new Circle(6)), new Circle(5));
		Container<? extends Figure> container4 = ret();
	}
	
	static void print(Figure figure){
		figure.print();
	}
	
	static void print(Container<? extends Figure> container){
		container.getElement().print();
	}
	
	static void add(Container<? super Figure> container, Figure figure){
		container.setElement(figure);
	}
	
	static Container<? extends Figure> ret(){
		return new Container<>(new Circle(6));
	}
}