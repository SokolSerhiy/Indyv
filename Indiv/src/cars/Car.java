package cars;

public class Car {

	private Wheel wheel;
	
	private Helm helm;
	
	private Body body;

	public Car(Wheel wheel, Helm helm, Body body) {
		this.wheel = wheel;
		this.helm = helm;
		this.body = body;
	}

	public Wheel getWheel() {
		return wheel;
	}

	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}

	public Helm getHelm() {
		return helm;
	}

	public void setHelm(Helm helm) {
		this.helm = helm;
	}

	public Body getBody() {
		return body;
	}

	public void setBody(Body body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return "Car [wheel=" + wheel + ", helm=" + helm + ", body=" + body + "]";
	}
}
