package less15;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import less13.Person;
import less3.Figure;
import less3.Rectangle;

public class Main {
	
	private static Object person = new Person("Ivan", 18);

	public static void main(String[] args) throws Exception {
		Class<?> personClass = Class.forName("less13.Person");
		Field[] fields = personClass.getDeclaredFields();
		for (Field field : fields) {
			System.out.println(field.getName());
		}
		Field nameField = personClass.getDeclaredField("name");
		nameField.setAccessible(true);
		Object name = nameField.get(person);
		System.out.println(name);
		
		Field ageField = personClass.getDeclaredField("age");
		ageField.setAccessible(true);
		Object age = ageField.get(person);
		System.out.println(age);
		
		Object person2 = personClass.newInstance();
		nameField.set(person2, name);
		ageField.set(person2, age);
		System.out.println(person2);
		
		Method getName = personClass.getDeclaredMethod("getName");
		Method getAge = personClass.getDeclaredMethod("getAge");
		
		Object name1 = getName.invoke(person);
		Object age1 = getAge.invoke(person);
		
		System.out.println(name1+" "+age1);
		
		Method setName = personClass.getDeclaredMethod("setName", nameField.getType());
		Method setAge = personClass.getDeclaredMethod("setAge", ageField.getType());
		
		Object person3 = personClass.newInstance();
		setName.invoke(person3, name);
		setAge.invoke(person3, age);
		
		System.out.println(person3);
		
		Figure figure = new Rectangle(5, 8);
		Figure figure2 = (Figure) Proxy.newProxyInstance(figure.getClass().getClassLoader(), figure.getClass().getInterfaces(), name(figure));
		
		System.out.println(figure2.perimeter());
		System.out.println(figure2.square());
	}
	
	private static InvocationHandler name(Figure figure) {
		return new InvocationHandler() {
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				long start = System.nanoTime();
				Object res = method.invoke(figure, args);
				System.out.println("time = " + (System.nanoTime()-start));
				return res;
			}
		};
	}
}