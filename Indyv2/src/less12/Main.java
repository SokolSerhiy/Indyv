package less12;

import java.io.IOException;
import java.util.NoSuchElementException;

public class Main {

	public static void main(String[] args) {
		try{
			System.out.println(2/0);
		}catch (ArithmeticException | NoSuchElementException e) {
			e.printStackTrace();
		}catch (Exception e) {
			
		}finally {
			
		}
		System.out.println("Hello");
//		System.out.println(2/0);
//		System.out.println("Hello2");
	}
	
	static void some() throws IOException{
		throw new IOException();
	}
	
	static void someReThrow(){
		try{
			some();
		}catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}