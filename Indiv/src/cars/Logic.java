package cars;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Logic {

	private final List<Car> cars = new ArrayList<>();
	
	private final Scanner sc = new Scanner(System.in);
	
	private final Car defCar = new Car(new Wheel(22), new Helm(19, false), new Body("sedan", Color.BLACK));
	
	private final Helm defHelm = new Helm(11, true);

	public Logic() {
		cars.add(new Car(new Wheel(17), new Helm(19, false), new Body("sedan", Color.BLACK)));
		cars.add(new Car(new Wheel(18), new Helm(15, false), new Body("spider", Color.RED)));
		cars.add(new Car(new Wheel(21), new Helm(12, false), new Body("sedan", Color.YELLOW)));
		cars.add(new Car(new Wheel(15), new Helm(13, false), new Body("spider", Color.BLACK)));
		cars.add(new Car(new Wheel(17), new Helm(17, false), new Body("sedan", Color.BLUE)));
		cars.add(new Car(new Wheel(19), new Helm(18, false), new Body("spider", Color.RED)));
		cars.add(new Car(new Wheel(18), new Helm(19, false), new Body("sedan", Color.RED)));
		boolean isRun = true;
		while(isRun){
			System.out.println("Enter 1 to filter by diametr of wheel");
			System.out.println("Enter 2 to filter by diametr of wheel and color");
			System.out.println("Enter 3 to change helm by diametr of wheel");
			System.out.println("Enter 4 to increase diametr of wheel if buttons is present");
			System.out.println("Enter 5 to change car by by diametr of wheel");
			switch (sc.next()) {
			case "1":
				filterByDiametr();
				break;
			case "2":
				filterByDiametrAndColor();
				break;
			case "3":
				changeHelm();
				break;
			case "4":
				increase();
				break;
			case "5":
				changeCar();
				break;
			default:
				isRun = false;
			}
		}
	}

	private void changeCar() {
		System.out.println("Enter diametr of wheel");
		int diametr = sc.nextInt();
		cars.stream()//потік машин
		.map(car->{
			if(car.getWheel().getDiametr()<diametr) return defCar;
			return car;
		}).forEach(System.out::println);
	}

	private void increase() {
		cars.stream()
		.filter(car->car.getHelm().isHaveButtons())
		.peek(car->car.getWheel().setDiametr(car.getWheel().getDiametr()*2))
		.forEach(System.out::println);
	}

	private void changeHelm() {
		cars.stream()
		.filter(car->car.getBody().getColor()==Color.RED)
		.peek(car->car.setHelm(defHelm))//проходить по всіх машинах і потім можна працювати далі з стрімом
		.forEach(System.out::println);
	}

	private void filterByDiametrAndColor() {
		System.out.println("Enter diametr of whhel");
		int diametr = sc.nextInt();
		System.out.println("Enter color");
		Color color = Color.valueOf(sc.next().toUpperCase());
		cars.stream()
		.filter(car->car.getWheel().getDiametr()==diametr)
		.filter(car->car.getBody().getColor()==color)
		.forEach(System.out::println);
	}

	private void filterByDiametr() {
		System.out.println("Enter diametr of whhel");
		int diametr = sc.nextInt();
		cars.stream()
		.filter(car->car.getWheel().getDiametr()==diametr)
		.forEach(System.out::println);
	}
	
	
}
