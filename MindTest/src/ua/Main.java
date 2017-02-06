package ua;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Main {

	public static void main(String[] args) throws IOException {
		//розібратись з Q
		String letter = "Z";
		BufferedImage old = ImageIO.read(new File("images/"+letter+".png"));
		old.flush();
		int offsetTop = findOffsetTop(old)+1;
		int offsetBottom = findOffsetBottom(old)+1;
		int offsetLeft = findOffsetLeft(old)+1;
		int offsetRight = findOffsetRight(old)+1;
		int imageType = old.getType();
		if(imageType == 0) imageType = 5;
		BufferedImage present = new BufferedImage(old.getWidth()-offsetLeft-offsetRight, old.getHeight()-offsetTop-offsetBottom, imageType);
		for (int row = 0; row < present.getHeight(); row++) {
			for (int col = 0; col < present.getWidth(); col++) {
				present.setRGB(col, row, old.getRGB(col+offsetLeft, row+offsetTop));
			}
		}
		double coefficientRow = (double)present.getHeight()/500;
		double coefficientCol = (double)present.getWidth()/500;
		BufferedImage present1 = new BufferedImage(500, 500, imageType);
		for (int row = 0; row < present1.getHeight(); row++) {
			for (int col = 0; col < present1.getWidth(); col++) {
				int rgb = present.getRGB((int) Math.round(col*coefficientCol), (int) Math.round(row*coefficientRow));
				if(rgb!=0){
					rgb=-1;
				}
				present1.setRGB(col, row, rgb);
			}
		}
		ImageIO.write(present1, "png", new File("work/"+letter+".png"));
	}
	
	static int findOffsetRight(BufferedImage old){
		int offset = 0;
		boolean offsetFinded = false;
		for (int col = old.getWidth()-1; col > 0; col--) {
			int rowSum = 0;
			for (int row = 0; row < old.getHeight(); row++) {
				rowSum += old.getRGB(col, row);
			}
			if(rowSum==0&&!offsetFinded){
				offset = old.getWidth() - col;
			}else{
				offsetFinded = true;
			}
			if(offsetFinded)return offset;
		}
		return 0;
	}
	
	static int findOffsetLeft(BufferedImage old){
		int offset = 0;
		boolean offsetFinded = false;
		for (int col = 0; col < old.getWidth(); col++) {
			int rowSum = 0;
			for (int row = 0; row < old.getHeight(); row++) {
				rowSum += old.getRGB(col, row);
			}
			if(rowSum==0&&!offsetFinded){
				offset = col;
			}else{
				offsetFinded = true;
			}
			if(offsetFinded)return offset;
		}
		return 0;
	}
	
	static int findOffsetTop(BufferedImage old){
		int offset = 0;
		boolean offsetFinded = false;
		for (int row = 0; row < old.getHeight(); row++) {
			int lineSum = 0;
			for (int col = 0; col < old.getWidth(); col++) {
				lineSum += old.getRGB(col, row);
			}
			if(lineSum==0&&!offsetFinded){
				offset = row;
			}else{
				offsetFinded = true;
			}
			if(offsetFinded)return offset;
		}
		return 0;
	}
	
	static int findOffsetBottom(BufferedImage old){
		int offset = 0;
		boolean offsetFinded = false;
		for (int row = old.getHeight()-1; row >= 0; row--) {
			int lineSum = 0;
			for (int col = 0; col < old.getWidth(); col++) {
				lineSum += old.getRGB(col, row);
			}
			if(lineSum==0&&!offsetFinded){
				offset = old.getHeight() - row;
			}else{
				offsetFinded = true;
			}
			if(offsetFinded)return offset;
		}
		return 0;
	}
}