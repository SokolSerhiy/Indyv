package fecade;

public class Main {

	public static void main(String[] args) {
		PageWriter writer = 
		new PageWriter(	new HeaderImpl(),
						new BodyImpl(),
						new FooterImpl());
		writer.printPage();
		System.out.println();
//		PageWriter writerLeft = 
//				new PageWriter(	new HeaderImpl(),
//								new BodyLeft(),
//								new FooterImpl());
//		writerLeft.printPage();
//		System.out.println();
//		PageWriter writerLeftRight = 
//				new PageWriter(	new HeaderImpl(),
//								new BodyLeftRight(),
//								new FooterImpl());
//		writerLeftRight.printPage();
//		System.out.println();
//		PageWriter writerLeftRightFooter = 
//				new PageWriter(	new HeaderImpl(),
//								new BodyLeftRight(),
//								null);
//		writerLeftRightFooter.printPage();
		
		PageWriter writerLeft = new PageWriter(writer, new BodyLeft(), writer);
		writerLeft.printPage();
		System.out.println();
		PageWriter writerLeftRight = new PageWriter(writer, new BodyLeftRight(), writer);
		writerLeftRight.printPage();
		System.out.println();
		PageWriter writerLeftRightFooter = new PageWriter(writer, writerLeftRight, null);
		writerLeftRightFooter.printPage();
	}

}
