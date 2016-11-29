package less1;

public class Main {

	public static void main(String[] args) {
		boolean by = true;
		byte bt = 3;
		short sh = 34;
		char ch = 'd';
		int in = 5;
		long l = 3000000000L;
		float fl = 4.5f;
		double doub = 4.5;

		in += 5;// in = in + 5;
		System.out.println(in);
		if (in > 10) {
			System.out.println("True");
		} else if (!by) {
			System.out.println("False");
		} else {
			System.out.println("Else");
		}

		int fgg = 8;
		switch (fgg) {
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		case 3:
			System.out.println("3");
			break;
		default:
			System.out.println("default");
		}
		int a = in > 10 ? 5 : 10;
		// if(in>10){
		// 	a = 5;
		// }else{
		// 	a = 10;
		// }
		System.out.println(a);

		
	}
}