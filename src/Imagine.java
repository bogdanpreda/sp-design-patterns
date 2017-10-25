
public class Imagine extends AbstractElement{
	private String nume;

	public Imagine(String nume) {
		super();
		this.nume = nume;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public void print() {
		System.out.println("Imagine [nume=" + nume + "]");
		
	}
	
	
}
