package less24;

import less12.Figure;
import less12.Rectangle;

public class Main {

	public static void main(String[] args) {
		Container<String> container = new Container<>("Ivan");
		System.out.println(container.getElement().substring(0, 1));
		Container<Rectangle> container2 = new Container<>(new Rectangle(1, 2));
		print(new Rectangle(2, 5));
		print(container2);
	}
	
	static void print(Figure figure){
		figure.print();
	}
	//exentds використовуємо якщо плануємо використовувати той тип даних що в дженеріку 
	static void print(Container<? extends Figure> container){
		container.getElement().print();
	}
	//super використовуємо якщо плануємо щось додати або сетнути в середину параметризованого класу
	static void add(Container<? super Figure> container, Figure figure){
		container.setElement(figure);
	}
}