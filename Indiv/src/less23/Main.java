package less23;

import java.util.Comparator;

import less23.Person.Pet;

public class Main {

	public static void main(String[] args) {
		Person person = new Person("Ivan", 25);
		Pet pet = person.addPet("Barsik");
		Person person1 = new Person("Mykola", 18);
		Pet pet1 = person1.addPet("Barsik");
		System.out.println(pet.equals(pet1));
		Person person2 = new Person.Builder()
				.age(19)
				.name("Petro")
				.pet("Barsik")
				.pet("Tuzik")
				.pet("Komposter")
				.build();
		System.out.println(person2);
		person2.getPets().sort(getComparatorByNameAsc());
		System.out.println(person2);
	}
	
	private static Comparator<Pet> getComparatorByNameAsc(){
		return new Comparator<Pet>() {
			@Override
			public int compare(Pet o1, Pet o2) {
				return o1.getName().compareTo(o2.getName());
			}
		}
//		.reversed()
		;
	}
	
	private static Comparator<Pet> getComparatorByNameDesc(){
		class Asdf implements Comparator<Pet>{
			@Override
			public int compare(Pet o1, Pet o2) {
				return o2.getName().compareTo(o1.getName());
			}
		}
		return new Asdf();
	}
}