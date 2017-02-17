package less11;

public class Main {

	public static void main(String[] args) {
		Bard bard = new Bard("Lutik");
		SimpleBallada ballada = new SimpleBallada();
		bard.singing(ballada);
		HeroBallada ballada2 = new HeroBallada();
		bard.singing(ballada2);
	}

}
