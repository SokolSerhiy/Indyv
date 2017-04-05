package less22;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException{
//		try(OutputStream os = new FileOutputStream(new File("person.save"));
//				ObjectOutputStream oos = new ObjectOutputStream(os)){
//			oos.writeObject(new Person("Ivan", 18, new Pet("Barsik")));
//		}catch (IOException e) {
//			e.printStackTrace();
//		}
		
//		try(InputStream is = new FileInputStream(new File("person.save"));
//				ObjectInputStream ois = new ObjectInputStream(is)){
//			Person person = (Person) ois.readObject();
//			System.out.println(person);
//		}catch (IOException | ClassNotFoundException e) {
//			
//		}
		
//		FileWriter fw = new FileWriter("some.txt", true);
//		fw.append("Hello ");
//		fw.append("World");
//		fw.append("\n");
//		fw.append("From ");
//		fw.append("Logos");
//		fw.close();
		
//		FileReader fr = new FileReader("some.txt");
//		while(fr.ready()){
//			System.out.println((char)fr.read());
//		}
//		fr.close();
		
//		Scanner sc= new Scanner(new File("some.txt"));
//		while (sc.hasNextLine()) {
//			String string = sc.nextLine();
//			System.out.println(string);
//		}
//		sc.close();
		
		RandomAccessFile raf = new RandomAccessFile("some.txt", "rw");
		String str = raf.readLine();
		while(str!=null){
			System.out.println(str);
			str = raf.readLine();
		}
//		raf.writeChars("\n add from raf");
		raf.close();
	}
}