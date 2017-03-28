package less11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Bank bank = restore();
		Scanner sc = new Scanner(System.in);
		Map<String, Logic> menu = new HashMap<>();
		menu.put("1", new Case1(sc, bank));
		menu.put("2", new Case2(sc, bank));
		menu.put("3", new Case3(sc, bank));
		menu.put("4", new Case4(bank));
		menu.put("5", new Case5(bank));
		boolean isRun = true;
		while(isRun){
			save(bank);
			System.out.println("Enter 1 to add person");
			System.out.println("Enter 2 to add acount");
			System.out.println("Enter 3 to delete acount");
			System.out.println("Enter 4 to show bank balance");
			System.out.println("Enter 5 to write all persons to text file");
			isRun = menu.getOrDefault(sc.next(), ()->false).some();
		}
	}
	
	private static void save(Bank bank){
		File file = new File("bank.save");
		try(OutputStream os = new FileOutputStream(file);
				ObjectOutputStream oos = new ObjectOutputStream(os)){
			oos.writeObject(bank);
		}catch (IOException e){
		}
	}
	
	private static Bank restore(){
		File file = new File("bank.save");
//		InputStream is = null;
//		ObjectInputStream ois = null;
//		try{
//			is = new FileInputStream(file);
//			ois = new ObjectInputStream(is);
//			Object obj = ois.readObject();
//			return (Bank)obj;
//		}catch (IOException | ClassNotFoundException e) {
//		}finally {
//			try {
//				ois.close();
//			} catch (IOException e) {
//			}
//			try {
//				is.close();
//			} catch (IOException e) {
//			}
//		}
		try(InputStream is = new FileInputStream(file);
				ObjectInputStream ois = new ObjectInputStream(is)){
			Object obj = ois.readObject();
			return (Bank)obj;
		}catch (IOException | ClassNotFoundException e){
		}
		return new Bank();
	}
}