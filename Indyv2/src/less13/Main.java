package less13;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager2;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import less13.Person.Pet;

public class Main {

	public static void main(String[] args) {
		Person person = new Person("Ivan", 23);
		System.out.println(person);
		Pet pet = person.new Pet("Barsik");
		System.out.println(person);
		Person person1 = new Person("Petro", 18);
		Pet pet1 = person1.new Pet("Barsik");
		System.out.println(pet.equals(pet1));
		System.out.println(person1);
		
		Person person2 = new Person.Builder()
				.age(18)
				.name("Mykola")
				.pet("Barsik")
				.pet("Tuzik")
				.build();
		System.out.println(person2);
		
		List<String> list = new ArrayList<>();
		list.add("Petro");
		list.add("Mykola");
		list.add("Ivan");
//		list.sort(new Comparator<String>() {
//			@Override
//			public int compare(String o1, String o2) {
//				return o2.compareTo(o1);
//			}
//		});
		list.sort(getComparator());
		System.out.println(getComparator().getClass().getName());
		System.out.println(list);
		Person person3 = getPerson("Sergiy", 25);
		person3.setAge(30);
		System.out.println(person3.getClass().getName());
	}
	
	static Comparator<String> getComparator(){
		return new Comparator<String>() {
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		}.reversed();
	}
	
	static Person getPerson(String name, int age){
		return new Person(name, age){
			public void setAge(int age) {
				System.out.println(age);
			}
		};
	}
	
	static void local(){
		class Asdf{
			void asdf(){
				System.out.println("Asdf");
			}
		}
		Asdf asdf = new Asdf();
		asdf.asdf();
	}
	
	static LayoutManager2 asdf(){
		return new LayoutManager2() {
			
			@Override
			public void removeLayoutComponent(Component comp) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public Dimension preferredLayoutSize(Container parent) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Dimension minimumLayoutSize(Container parent) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public void layoutContainer(Container parent) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void addLayoutComponent(String name, Component comp) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public Dimension maximumLayoutSize(Container target) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public void invalidateLayout(Container target) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public float getLayoutAlignmentY(Container target) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public float getLayoutAlignmentX(Container target) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public void addLayoutComponent(Component comp, Object constraints) {
				// TODO Auto-generated method stub
				
			}
		};
	}
}