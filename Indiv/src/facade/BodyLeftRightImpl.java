package facade;

public class BodyLeftRightImpl implements Body{

	@Override
	public void printBody() {
		System.out.println("**********************************************************************************************");
		System.out.println("*          *                                                                      *          *");
		System.out.println("*          *                                                                      *          *");
		System.out.println("*          *                                                                      *          *");
		System.out.println("*  Left    *                                                                      *   Right  *");
		System.out.println("*  Bar     *                          Body                                        *   Bar    *");
		System.out.println("*  Side    *                                                                      *   Side   *");
		System.out.println("*          *                                                                      *          *");
		System.out.println("*          *                                                                      *          *");
		System.out.println("*          *                                                                      *          *");
		System.out.println("**********************************************************************************************");
	}

}
