package cars;

public class Helm {

	private int diametr;
	
	private boolean haveButtons;
	
	public Helm(int diametr, boolean haveButtons) {
		this.diametr = diametr;
		this.haveButtons = haveButtons;
	}

	public int getDiametr() {
		return diametr;
	}

	public void setDiametr(int diametr) {
		this.diametr = diametr;
	}

	public boolean isHaveButtons() {
		return haveButtons;
	}

	public void setHaveButtons(boolean haveButtons) {
		this.haveButtons = haveButtons;
	}

	@Override
	public String toString() {
		return "Helm [diametr=" + diametr + ", haveButtons=" + haveButtons + "]";
	}
	
	
}
