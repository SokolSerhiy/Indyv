package facade;

public class Main {

	public static void main(String[] args) {
//		Printer printer = new Printer(new HeaderImpl(), new BodyImpl(), new FooterImpl());
//		printer.printPage();
//		System.out.println();
//		Printer leftPrinter = new Printer(new HeaderImpl(), new BodyLeftImpl(), new FooterImpl());
//		leftPrinter.printPage();
//		System.out.println();
//		Printer leftRight = new Printer(new HeaderImpl(), new BodyLeftRightImpl(), new FooterImpl());
//		leftRight.printPage();
//		System.out.println();
//		Printer leftRightFooter = new Printer(new HeaderImpl(), new BodyLeftRightImpl(), null);
//		leftRightFooter.printPage();
		
		Printer printer = new Printer(new HeaderImpl(), new BodyImpl(), new FooterImpl());
		printer.printPage();
		System.out.println();
		Printer leftPrinter = new Printer(printer, new BodyLeftImpl(), printer);
		leftPrinter.printPage();
		System.out.println();
		Printer leftRight = new Printer(printer, new BodyLeftRightImpl(), printer);
		leftRight.printPage();
		System.out.println();
		Printer leftRightFooter = new Printer(printer, leftRight, null);
		leftRightFooter.printPage();
	}

}
