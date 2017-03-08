package cars;

public class Body {

	private String type;
	
	private Color color;

	public Body(String type, Color color) {
		this.type = type;
		this.color = color;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Body [type=" + type + ", color=" + color + "]";
	}
}
