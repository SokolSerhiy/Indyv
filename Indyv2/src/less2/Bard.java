package less2;

public class Bard {

	private String name;

	public Bard(String name) {
		this.name = name;
	}
	
	public void singing(Ballada ballada){
		System.out.print(name+": ");
		ballada.song();
	}
}
