package less21;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		try{
			System.out.println(2/0);
			Object obj = new Object();
			System.out.println(obj);
		}catch (ArithmeticException | IllegalArgumentException e) {
			e.printStackTrace();
		}catch (RuntimeException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("Finally");
		}
		System.out.println("Hello");
		System.out.println(some());
		some3();
	}
	
	@SuppressWarnings("finally")
	static int some(){
		try{
			//System.out.println(2/0);
			return 1;
		}catch (ArithmeticException e) {
			return 2;
		}finally {
			return 3;
		}
	}
	
	static void some2() throws IOException{
		throw new IOException("Just for fun");
	}
	
	static void some3(){
		try{
			some2();
		}catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}