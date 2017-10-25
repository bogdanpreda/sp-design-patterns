
public class Imagine extends AbstractElement{
	private String nume;
//	private ImageData data;
	
	public Imagine(String nume) {
		super();
		this.nume = nume;
//		data = loadFromFIle(filename);
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
